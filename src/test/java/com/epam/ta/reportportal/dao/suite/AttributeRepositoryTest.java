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
import com.epam.ta.reportportal.dao.AttributeRepository;
import com.epam.ta.reportportal.entity.attribute.Attribute;
import com.epam.ta.reportportal.entity.enums.ProjectAttributeEnum;
import org.flywaydb.test.annotation.FlywayTest;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Ivan Budaev
 */
public class AttributeRepositoryTest extends BaseTest {

	private static final String FILL_SCRIPT_PATH = "db/fill/attributes";

	@Autowired
	private AttributeRepository attributeRepository;

	@FlywayTest(locationsForMigrate = { FILL_SCRIPT_PATH }, invokeCleanDB = false)
	@BeforeClass
	public static void before() {
	}

	@Test
	public void shouldFindWhenNameIsPresent() {

		//given
		String name = "present";

		//when
		Optional<Attribute> attribute = attributeRepository.findByName(name);

		//then
		assertTrue("Attribute should exists", attribute.isPresent());
	}

	@Test
	public void shouldNotFindWhenNameIsNotPresent() {

		//given
		String name = "not present";

		//when
		Optional<Attribute> attribute = attributeRepository.findByName(name);

		//then
		Assert.assertFalse("Attribute should not exists", attribute.isPresent());
	}

	@Test
	public void getDefaultProjectAttributesTest() {
		final Set<Attribute> defaultProjectAttributes = attributeRepository.getDefaultProjectAttributes();
		defaultProjectAttributes.forEach(it -> assertTrue(
				"Attribute should exists",
				ProjectAttributeEnum.findByAttributeName(it.getName()).isPresent()
		));
	}

	@Test
	public void findById() {
		final Long attrId = 100L;
		final String attrName = "present";

		final Optional<Attribute> attrOptional = attributeRepository.findById(attrId);
		assertTrue("Attribute should exists", attrOptional.isPresent());
		assertEquals("Incorrect attribute name", attrName, attrOptional.get().getName());
	}

	@Test
	public void deleteById() {
		final Long attrId = 100L;
		attributeRepository.deleteById(attrId);
		assertEquals(ProjectAttributeEnum.values().length, attributeRepository.findAll().size());
	}
}