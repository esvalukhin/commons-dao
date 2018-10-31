/*
 *  Copyright (C) 2018 EPAM Systems
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JCrosstab3;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.4" }, comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JCrosstab3Record extends TableRecordImpl<JCrosstab3Record> implements Record1<Object> {

	private static final long serialVersionUID = 1953223729;

	/**
	 * Setter for <code>public.crosstab3.crosstab3</code>.
	 */
	public void setCrosstab3(Object value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.crosstab3.crosstab3</code>.
	 */
	public Object getCrosstab3() {
		return get(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Object> fieldsRow() {
		return (Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Object> valuesRow() {
		return (Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field1() {
		return JCrosstab3.CROSSTAB3.CROSSTAB3_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object component1() {
		return getCrosstab3();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value1() {
		return getCrosstab3();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JCrosstab3Record value1(Object value) {
		setCrosstab3(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JCrosstab3Record values(Object value1) {
		value1(value1);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JCrosstab3Record
	 */
	public JCrosstab3Record() {
		super(JCrosstab3.CROSSTAB3);
	}

	/**
	 * Create a detached, initialised JCrosstab3Record
	 */
	public JCrosstab3Record(Object crosstab3) {
		super(JCrosstab3.CROSSTAB3);

		set(0, crosstab3);
	}
}
