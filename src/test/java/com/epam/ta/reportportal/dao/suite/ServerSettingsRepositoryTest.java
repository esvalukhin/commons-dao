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

package com.epam.ta.reportportal.dao.suite;

import com.epam.ta.reportportal.BaseTest;
import com.epam.ta.reportportal.dao.ServerSettingsRepository;
import com.epam.ta.reportportal.entity.ServerSettings;
import org.flywaydb.test.annotation.FlywayTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public class ServerSettingsRepositoryTest extends BaseTest {

	private static final String FILL_SCRIPT_PATH = "/db/fill/server-settings";

	@Autowired
	private ServerSettingsRepository repository;

	@FlywayTest(locationsForMigrate = { FILL_SCRIPT_PATH }, invokeCleanDB = false)
	@BeforeClass
	public static void before() {
	}

	@Test
	public void findByKeyPositive() {
		final String key = "key1";
		final Optional<ServerSettings> serverSettingsOptional = repository.findByKey(key);

		assertTrue(serverSettingsOptional.isPresent());
		assertEquals(key, serverSettingsOptional.get().getKey());
	}

	@Test
	public void findByKeyNegative() {
		assertFalse(repository.findByKey("no_such_key").isPresent());
	}

	@Test
	public void streamAll() {
		final Stream<ServerSettings> serverSettingsStream = repository.streamAll();
		assertEquals(14, serverSettingsStream.collect(Collectors.toList()).size());
	}

	@Test
	public void name() {
		repository.deleteAllByTerm("key");
		assertEquals(11, repository.findAll().size());
	}
}