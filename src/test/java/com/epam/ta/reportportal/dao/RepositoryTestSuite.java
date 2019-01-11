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

package com.epam.ta.reportportal.dao;

import com.epam.ta.reportportal.dao.suite.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.runners.Suite.SuiteClasses;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
@RunWith(Suite.class)
// Order of test classes is important
@SuiteClasses({ ProjectRepositoryTest.class, ActivityRepositoryTest.class, AttributeRepositoryTest.class, IssueTypeRepositoryTest.class,
		IssueGroupRepositoryTest.class, UserRepositoryTest.class, ItemAttributeRepositoryTest.class, IssueEntityRepositoryTest.class,
		TestItemRepositoryTest.class, LogRepositoryTest.class, LaunchRepositoryTest.class, DashboardRepositoryTest.class,
		UserFilterRepositoryTest.class, UserPreferenceRepositoryTest.class, UserCreationBidRepositoryTest.class })
public class RepositoryTestSuite {

}