/*
 * Copyright (C) 2018 EPAM Systems
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

package com.epam.ta.reportportal.entity.enums;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public class StatusEnumTest {

	private Map<StatusEnum, List<String>> allowed;
	private List<String> disallowed;

	@Before
	public void setUp() throws Exception {
		allowed = Arrays.stream(StatusEnum.values())
				.collect(Collectors.toMap(it -> it, it -> Arrays.asList(it.name(), it.name().toUpperCase(), it.name().toLowerCase())));
		disallowed = Arrays.asList("noSuchStatus", "", " ", null);
	}

	@Test
	public void fromValue() {
		allowed.forEach((key, value) -> value.forEach(val -> {
			final Optional<StatusEnum> optional = StatusEnum.fromValue(val);
			assertTrue(optional.isPresent());
			assertEquals(key, optional.get());
		}));
		disallowed.forEach(it -> assertFalse(StatusEnum.fromValue(it).isPresent()));
	}

	@Test
	public void isPresent() {
		allowed.entrySet().stream().flatMap(it -> it.getValue().stream()).forEach(it -> assertTrue(StatusEnum.isPresent(it)));
		disallowed.forEach(it -> assertFalse(StatusEnum.isPresent(it)));
	}
}