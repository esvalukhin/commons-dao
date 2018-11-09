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

/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;


import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JActiveDirectoryConfigRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JActiveDirectoryConfig extends TableImpl<JActiveDirectoryConfigRecord> {

    private static final long serialVersionUID = -1754900317;

    /**
     * The reference instance of <code>public.active_directory_config</code>
     */
    public static final JActiveDirectoryConfig ACTIVE_DIRECTORY_CONFIG = new JActiveDirectoryConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JActiveDirectoryConfigRecord> getRecordType() {
        return JActiveDirectoryConfigRecord.class;
    }

    /**
     * The column <code>public.active_directory_config.id</code>.
     */
    public final TableField<JActiveDirectoryConfigRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.active_directory_config.url</code>.
     */
    public final TableField<JActiveDirectoryConfigRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.active_directory_config.base_dn</code>.
     */
    public final TableField<JActiveDirectoryConfigRecord, String> BASE_DN = createField("base_dn", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.active_directory_config.sync_attributes_id</code>.
     */
    public final TableField<JActiveDirectoryConfigRecord, Long> SYNC_ATTRIBUTES_ID = createField("sync_attributes_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.active_directory_config.domain</code>.
     */
    public final TableField<JActiveDirectoryConfigRecord, String> DOMAIN = createField("domain", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * Create a <code>public.active_directory_config</code> table reference
     */
    public JActiveDirectoryConfig() {
        this(DSL.name("active_directory_config"), null);
    }

    /**
     * Create an aliased <code>public.active_directory_config</code> table reference
     */
    public JActiveDirectoryConfig(String alias) {
        this(DSL.name(alias), ACTIVE_DIRECTORY_CONFIG);
    }

    /**
     * Create an aliased <code>public.active_directory_config</code> table reference
     */
    public JActiveDirectoryConfig(Name alias) {
        this(alias, ACTIVE_DIRECTORY_CONFIG);
    }

    private JActiveDirectoryConfig(Name alias, Table<JActiveDirectoryConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private JActiveDirectoryConfig(Name alias, Table<JActiveDirectoryConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JActiveDirectoryConfig(Table<O> child, ForeignKey<O, JActiveDirectoryConfigRecord> key) {
        super(child, key, ACTIVE_DIRECTORY_CONFIG);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ACTIVE_DIRECTORY_CONFIG_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JActiveDirectoryConfigRecord> getPrimaryKey() {
        return Keys.ACTIVE_DIRECTORY_CONFIG_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JActiveDirectoryConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<JActiveDirectoryConfigRecord>>asList(Keys.ACTIVE_DIRECTORY_CONFIG_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JActiveDirectoryConfigRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JActiveDirectoryConfigRecord, ?>>asList(Keys.ACTIVE_DIRECTORY_CONFIG__ACTIVE_DIRECTORY_CONFIG_ID_FKEY, Keys.ACTIVE_DIRECTORY_CONFIG__ACTIVE_DIRECTORY_CONFIG_SYNC_ATTRIBUTES_ID_FKEY);
    }

    public JIntegration integration() {
        return new JIntegration(this, Keys.ACTIVE_DIRECTORY_CONFIG__ACTIVE_DIRECTORY_CONFIG_ID_FKEY);
    }

    public JLdapSynchronizationAttributes ldapSynchronizationAttributes() {
        return new JLdapSynchronizationAttributes(this, Keys.ACTIVE_DIRECTORY_CONFIG__ACTIVE_DIRECTORY_CONFIG_SYNC_ATTRIBUTES_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActiveDirectoryConfig as(String alias) {
        return new JActiveDirectoryConfig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActiveDirectoryConfig as(Name alias) {
        return new JActiveDirectoryConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JActiveDirectoryConfig rename(String name) {
        return new JActiveDirectoryConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JActiveDirectoryConfig rename(Name name) {
        return new JActiveDirectoryConfig(name, null);
    }
}
