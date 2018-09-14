/*
 * Copyright 2017 EPAM Systems
 *
 *
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/service-api
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

package com.epam.ta.reportportal.dao;

import com.epam.ta.reportportal.entity.enums.StatusEnum;
import com.epam.ta.reportportal.entity.item.TestItem;
import com.epam.ta.reportportal.entity.item.issue.IssueType;

import java.util.List;
import java.util.Optional;

/**
 * @author Pavel Bortnik
 */
public interface TestItemRepositoryCustom extends FilterableRepository<TestItem> {

	/**
	 * Selects all descendants of TestItem with provided id.
	 *
	 * @param itemId TestItem id
	 * @return List of all descendants
	 */
	List<TestItem> selectAllDescendants(Long itemId);
	/**
	 * Selects all descendants of TestItem with provided id, which has at least one child.
	 *
	 * @param itemId TestItem id
	 * @return List of descendants
	 */
	List<TestItem> selectAllDescendantsWithChildren(Long itemId);

	/**
	 * Select common items object that have provided status for
	 * specified launch.
	 *
	 * @param launchId Launch
	 * @param statuses Statuses
	 * @return List of items
	 */
	List<TestItem> selectItemsInStatusByLaunch(Long launchId, StatusEnum... statuses);

	/**
	 * Select common items object that have provided status for
	 * specified parent item.
	 *
	 * @param parentId Parent item
	 * @param statuses Statuses
	 * @return List of items
	 */
	List<TestItem> selectItemsInStatusByParent(Long parentId, StatusEnum... statuses);

	/**
	 * True if the provided launch contains any items with
	 * a specified status.
	 *
	 * @param launchId Checking launch id
	 * @param statuses Checking statuses
	 * @return True if contains, false if not
	 */
	Boolean hasItemsInStatusByLaunch(Long launchId, StatusEnum... statuses);

	/**
	 * True if the provided parent item contains any items with
	 * a specified status.
	 *
	 * @param parentId Checking launch id
	 * @param statuses Checking statuses
	 * @return True if contains, false if not
	 */
	Boolean hasItemsInStatusByParent(Long parentId, StatusEnum... statuses);

	/**
	 * Select ids of items that has different issue from provided for
	 * specified launch.
	 *
	 * @param launchId  Launch
	 * @param issueType Issue type locator
	 * @return List of item ids
	 */
	List<Long> selectIdsNotInIssueByLaunch(Long launchId, String issueType);

	/**
	 * Select test items that has issue with provided issue type for
	 * specified launch.
	 *
	 * @param launchId  Launch id
	 * @param issueType Issue type
	 * @return List of items
	 */
	List<TestItem> selectItemsInIssueByLaunch(Long launchId, String issueType);

	/**
	 * Identifies status of the provided item using it's children.
	 *
	 * @param testItemId Test Item
	 * @return Status of test item
	 */
	StatusEnum identifyStatus(Long testItemId);

	//TODO move to project repo
	List<IssueType> selectIssueLocatorsByProject(Long projectId);

	/**
	 * Selects issue type object by provided locator for specified project.
	 *
	 * @param projectId Project id
	 * @param locator   Issue type locator
	 * @return Issue type
	 */
	Optional<IssueType> selectIssueTypeByLocator(Long projectId, String locator);
}
