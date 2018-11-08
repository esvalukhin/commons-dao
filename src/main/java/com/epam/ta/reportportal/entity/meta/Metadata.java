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
 */kage com.epam.ta.reportportal.entity.meta;

import com.epam.ta.reportportal.commons.JsonbUserType;

import java.util.Map;

/**
 * @author Ivan Budayeu
 */
public class Metadata extends JsonbUserType {

	@Override
	public Class<?> returnedClass() {
		return Metadata.class;
	}

	private Map<String, Object> metadata;

	public Metadata() {
	}

	public Metadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}
}
