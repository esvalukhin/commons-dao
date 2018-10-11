package com.epam.ta.reportportal.dao;

import com.epam.ta.reportportal.commons.querygen.Filter;
import com.epam.ta.reportportal.commons.querygen.QueryBuilder;
import com.epam.ta.reportportal.entity.project.Project;
import com.epam.ta.reportportal.entity.project.ProjectInfo;
import com.epam.ta.reportportal.jooq.enums.JLaunchModeEnum;
import com.epam.ta.reportportal.jooq.enums.JStatusEnum;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.epam.ta.reportportal.dao.util.RecordMappers.PROJECT_MAPPER;
import static com.epam.ta.reportportal.jooq.Tables.*;
import static org.jooq.impl.DSL.*;

@Repository
public class ProjectRepositoryCustomImpl implements ProjectRepositoryCustom {

	@Autowired
	private DSLContext dsl;

	@Override
	public List<Project> findByFilter(Filter filter) {

		return dsl.fetch(QueryBuilder.newBuilder(filter).build()).map(PROJECT_MAPPER);
	}

	@Override
	public Page<Project> findByFilter(Filter filter, Pageable pageable) {
		return PageableExecutionUtils.getPage(
				dsl.fetch(QueryBuilder.newBuilder(filter).with(pageable).build()).map(PROJECT_MAPPER),
				pageable,
				() -> dsl.fetchCount(QueryBuilder.newBuilder(filter).build())
		);
	}

	@Override
	public Page<ProjectInfo> findProjectInfoByFilter(Filter filter, Pageable pageable, String mode) {
		return PageableExecutionUtils.getPage(dsl.with("filtered_project")
				.as(QueryBuilder.newBuilder(filter).with(pageable).build())
				.select(
						DSL.countDistinct(PROJECT_USER.USER_ID).as("usersQuantity"),
						DSL.countDistinct(choose().when(LAUNCH.MODE.eq(JLaunchModeEnum.valueOf(mode))
								.and(LAUNCH.STATUS.ne(JStatusEnum.IN_PROGRESS)), LAUNCH.ID)).as("launchesQuantity"),
						DSL.max(LAUNCH.START_TIME).as("lastRun"),
						PROJECT.ID,
						PROJECT.CREATION_DATE,
						PROJECT.NAME,
						PROJECT.PROJECT_TYPE
				)
				.from(DSL.table(name("filtered_project"))
						.leftJoin(PROJECT_USER)
						.on(field(name(PROJECT.ID.getName()), Long.class).eq(PROJECT_USER.PROJECT_ID))
						.leftJoin(LAUNCH)
						.on(field(name(PROJECT.ID.getName()), Long.class).eq(LAUNCH.PROJECT_ID)))
				.groupBy(PROJECT.ID, PROJECT.CREATION_DATE, PROJECT.NAME, PROJECT.PROJECT_TYPE)
				.fetch()
				.into(ProjectInfo.class), pageable, () -> dsl.fetchCount(QueryBuilder.newBuilder(filter).build()));
	}

	@Override
	public Optional<String> findPersonalProjectName(String username) {
		Optional<Project> projectOptional = Optional.ofNullable(dsl.select()
				.from(USERS)
				.join(PROJECT)
				.on(USERS.DEFAULT_PROJECT_ID.eq(PROJECT.ID))
				.where(USERS.LOGIN.eq(username))
				.fetchOne(PROJECT_MAPPER));
		return projectOptional.map(Project::getName);
	}

	@Override
	public List<Project> findUserProjects(String username) {
		return dsl.select()
				.from(PROJECT)
				.join(PROJECT_USER)
				.on(PROJECT_USER.PROJECT_ID.eq(PROJECT.ID))
				.join(USERS)
				.on(PROJECT_USER.USER_ID.eq(USERS.ID))
				.where(USERS.LOGIN.eq(username))
				.fetch(PROJECT_MAPPER);
	}
}
