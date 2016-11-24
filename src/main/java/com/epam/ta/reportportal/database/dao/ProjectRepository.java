/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/commons-dao
 * 
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */ 

package com.epam.ta.reportportal.database.dao;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Repository;

import com.epam.ta.reportportal.config.CacheConfiguration;
import com.epam.ta.reportportal.database.entity.Project;

/**
 * DAO for the {@link Project} entity
 * 
 * @author Andrei Varabyeu
 * 
 */
@Repository("projectRepository")
public interface ProjectRepository extends ReportPortalRepository<Project, String>, ProjectRepositoryCustom {

	Project findByName(String name);

	List<Project> findByCustomer(String customer);

	@CacheEvict(allEntries = true,  value = CacheConfiguration.ASSIGNED_USERS_CACHE, beforeInvocation = true)
	@Override
	void delete(Project entity);

	@CacheEvict(allEntries = true, value = CacheConfiguration.ASSIGNED_USERS_CACHE, beforeInvocation = true)
	@Override
	void deleteAll();

	@CacheEvict(allEntries = true, value = CacheConfiguration.ASSIGNED_USERS_CACHE, beforeInvocation = true)
	@Override
	void delete(Iterable<? extends Project> arg0);

	@CacheEvict(allEntries = true,  value = CacheConfiguration.ASSIGNED_USERS_CACHE, beforeInvocation = true)
	@Override
	void delete(String id);

	@Override
	@CacheEvict(allEntries = true, value = CacheConfiguration.ASSIGNED_USERS_CACHE, beforeInvocation = true)
	Project save(Project entity);
}