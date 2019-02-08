/*
 * Copyright 2018 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.entity.project;

import com.epam.ta.reportportal.entity.Metadata;
import com.epam.ta.reportportal.entity.enums.ProjectType;
import com.epam.ta.reportportal.entity.integration.Integration;
import com.epam.ta.reportportal.entity.user.ProjectUser;
import com.google.common.collect.Sets;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

/**
 * @author Ivan Budayeu
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@TypeDef(name = "json", typeClass = Metadata.class)
@Table(name = "project", schema = "public")
public class Project implements Serializable {

	private static final long serialVersionUID = -263516611;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false, precision = 64)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "project_type")
	private ProjectType projectType;

	@OneToMany(mappedBy = "project", cascade = { CascadeType.PERSIST, CascadeType.REMOVE }, fetch = FetchType.EAGER)
	private Set<Integration> integrations = Sets.newHashSet();

	@OneToMany(mappedBy = "project", cascade = { CascadeType.PERSIST, CascadeType.REMOVE }, fetch = FetchType.LAZY)
	private Set<ProjectAttribute> projectAttributes = Sets.newHashSet();

	@OneToMany(mappedBy = "project", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.LAZY)
	private Set<ProjectIssueType> projectIssueTypes = Sets.newHashSet();

	@Column(name = "creation_date")
	private Date creationDate;

	@Type(type = "json")
	@Column(name = "metadata")
	private Metadata metadata;

	@Column(name = "organization")
	private String organization;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project", cascade = CascadeType.PERSIST)
	private Set<ProjectUser> users;

	public Project(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Project() {
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProjectType getProjectType() {
		return projectType;
	}

	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}

	public Set<ProjectUser> getUsers() {
		return users;
	}

	public void setUsers(Set<ProjectUser> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Integration> getIntegrations() {
		return integrations;
	}

	public void setIntegrations(Set<Integration> integrations) {
		this.integrations = integrations;
	}

	public Set<ProjectAttribute> getProjectAttributes() {
		return projectAttributes;
	}

	public Set<ProjectIssueType> getProjectIssueTypes() {
		return projectIssueTypes;
	}

	public void setProjectIssueTypes(Set<ProjectIssueType> projectIssueTypes) {
		this.projectIssueTypes = projectIssueTypes;
	}

	public void setProjectAttributes(Set<ProjectAttribute> projectAttributes) {
		this.projectAttributes = projectAttributes;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Project project = (Project) o;
		return Objects.equals(name, project.name) && Objects.equals(creationDate, project.creationDate) && Objects.equals(metadata,
				project.metadata
		);
	}

	@Override
	public int hashCode() {

		return Objects.hash(name, creationDate, metadata);
	}

}
