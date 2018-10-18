/*
 *
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
 *
 */

/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.tables.records.JConnectbyRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.4" }, comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JConnectby extends TableImpl<JConnectbyRecord> {

	private static final long serialVersionUID = 832518665;

	/**
	 * The reference instance of <code>public.connectby</code>
	 */
	public static final JConnectby CONNECTBY = new JConnectby();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JConnectbyRecord> getRecordType() {
		return JConnectbyRecord.class;
	}

	/**
	 * The column <code>public.connectby.connectby</code>.
	 */
	public final TableField<JConnectbyRecord, Record> CONNECTBY_ = createField("connectby", org.jooq.impl.SQLDataType.RECORD, this, "");

	/**
	 * Create a <code>public.connectby</code> table reference
	 */
	public JConnectby() {
		this(DSL.name("connectby"), null);
	}

	/**
	 * Create an aliased <code>public.connectby</code> table reference
	 */
	public JConnectby(String alias) {
		this(DSL.name(alias), CONNECTBY);
	}

	/**
	 * Create an aliased <code>public.connectby</code> table reference
	 */
	public JConnectby(Name alias) {
		this(alias, CONNECTBY);
	}

	private JConnectby(Name alias, Table<JConnectbyRecord> aliased) {
		this(alias, aliased, new Field[7]);
	}

	private JConnectby(Name alias, Table<JConnectbyRecord> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, DSL.comment(""));
	}

	public <O extends Record> JConnectby(Table<O> child, ForeignKey<O, JConnectbyRecord> key) {
		super(child, key, CONNECTBY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema() {
		return JPublic.PUBLIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JConnectby as(String alias) {
		return new JConnectby(DSL.name(alias), this, parameters);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JConnectby as(Name alias) {
		return new JConnectby(alias, this, parameters);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JConnectby rename(String name) {
		return new JConnectby(DSL.name(name), null, parameters);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JConnectby rename(Name name) {
		return new JConnectby(name, null, parameters);
	}

	/**
	 * Call this table-valued function
	 */
	public JConnectby call(String __1, String __2, String __3, String __4, String __5, Integer __6, String __7) {
		return new JConnectby(
				DSL.name(getName()),
				null,
				new Field[] { DSL.val(__1, org.jooq.impl.SQLDataType.CLOB), DSL.val(__2, org.jooq.impl.SQLDataType.CLOB),
						DSL.val(__3, org.jooq.impl.SQLDataType.CLOB), DSL.val(__4, org.jooq.impl.SQLDataType.CLOB),
						DSL.val(__5, org.jooq.impl.SQLDataType.CLOB), DSL.val(__6, org.jooq.impl.SQLDataType.INTEGER),
						DSL.val(__7, org.jooq.impl.SQLDataType.CLOB) }
		);
	}

	/**
	 * Call this table-valued function
	 */
	public JConnectby call(Field<String> __1, Field<String> __2, Field<String> __3, Field<String> __4, Field<String> __5,
			Field<Integer> __6, Field<String> __7) {
		return new JConnectby(DSL.name(getName()), null, new Field[] { __1, __2, __3, __4, __5, __6, __7 });
	}
}
