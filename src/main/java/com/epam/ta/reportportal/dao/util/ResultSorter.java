package com.epam.ta.reportportal.dao.util;

import com.epam.ta.reportportal.entity.widget.content.LaunchesStatisticsContent;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.Optional.ofNullable;

/**
 * @author Ivan Budaev
 */
public final class ResultSorter {

	private ResultSorter() {
		//static only
	}

	public static final Comparator<Map.Entry<String, List<LaunchesStatisticsContent>>> TAG_SORT_COMPARATOR = (prevEntry, currEntry) -> {
		String prevKey = ofNullable(prevEntry.getKey()).orElseGet(String::new);
		String currKey = ofNullable(currEntry.getKey()).orElseGet(String::new);

		int prevKeyLength = prevKey.length();
		int currKeyLength = currKey.length();

//		String[] array =prevKey.trim().split("\\D+");
//		String[] resultArray = Arrays.stream(array).filter(StringUtils::isNotEmpty).toArray(String[]::new);

		return prevKeyLength == currKeyLength ? prevKey.compareTo(currKey) : prevKeyLength - currKeyLength;
	};
}