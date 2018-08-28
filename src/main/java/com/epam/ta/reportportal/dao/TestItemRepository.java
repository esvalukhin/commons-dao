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

import com.epam.ta.reportportal.entity.item.TestItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Pavel Bortnik
 */
public interface TestItemRepository extends ReportPortalRepository<TestItem, Long>, TestItemRepositoryCustom {

	List<TestItem> findTestItemsByUniqueId(String uniqueId);

	@Query(value = "DELETE FROM test_item WHERE test_item.item_id = :itemId", nativeQuery = true)
	void deleteTestItem(@Param(value = "itemId") Long itemId);

	/**
	 * Checks does test item have children.
	 *
	 * @param itemPath Current item path in a tree
	 * @return True if has
	 */
	@Query(value = "SELECT EXISTS(SELECT 1 FROM test_item t WHERE t.path ~ cast(concat(:itemPath, '.*') AS LQUERY) LIMIT 1)", nativeQuery = true)
	boolean hasChildren(@Param("itemPath") String itemPath);

	/**
	 * Select ids and names of all items in a tree till current.
	 *
	 * @param itemPath itemPath
	 * @return List of item names
	 */
	@Query(value = "SELECT t.name FROM test_item t WHERE t.path @> cast(:itemPath AS LTREE)", nativeQuery = true)
	List<String> selectPathNames(@Param("itemPath") String itemPath);

	/**
	 * Interrupts all {@link com.epam.ta.reportportal.entity.enums.StatusEnum#IN_PROGRESS} children items of the
	 * launch with provided launchId.
	 * Sets them {@link com.epam.ta.reportportal.entity.enums.StatusEnum#INTERRUPTED} status
	 *
	 * @param launchId Launch id
	 */
	@Query(value =
			"UPDATE test_item_results SET status = 'INTERRUPTED', end_time = current_timestamp, duration = EXTRACT(EPOCH FROM current_timestamp - i.start_time)"
					+ "FROM test_item i WHERE i.item_id = result_id AND i.launch_id = :launch_id AND status = 'IN_PROGRESS'", nativeQuery = true)
	void interruptInProgressItems(@Param("launchId") Long launchId);

}
