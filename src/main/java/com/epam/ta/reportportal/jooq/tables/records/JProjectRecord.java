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
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.tables.JProject;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JProjectRecord extends UpdatableRecordImpl<JProjectRecord> implements Record5<Long, String, String, Timestamp, Object> {

    private static final long serialVersionUID = -1478911883;

    /**
     * Setter for <code>public.project.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.project.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.project.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.project.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.project.project_type</code>.
     */
    public void setProjectType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.project.project_type</code>.
     */
    public String getProjectType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.project.creation_date</code>.
     */
    public void setCreationDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.project.creation_date</code>.
     */
    public Timestamp getCreationDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.project.metadata</code>.
     */
    public void setMetadata(Object value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.project.metadata</code>.
     */
    public Object getMetadata() {
        return get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, Timestamp, Object> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, Timestamp, Object> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JProject.PROJECT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JProject.PROJECT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JProject.PROJECT.PROJECT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return JProject.PROJECT.CREATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field5() {
        return JProject.PROJECT.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getProjectType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object component5() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProjectType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value5() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectRecord value3(String value) {
        setProjectType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectRecord value4(Timestamp value) {
        setCreationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectRecord value5(Object value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectRecord values(Long value1, String value2, String value3, Timestamp value4, Object value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JProjectRecord
     */
    public JProjectRecord() {
        super(JProject.PROJECT);
    }

    /**
     * Create a detached, initialised JProjectRecord
     */
    public JProjectRecord(Long id, String name, String projectType, Timestamp creationDate, Object metadata) {
        super(JProject.PROJECT);

        set(0, id);
        set(1, name);
        set(2, projectType);
        set(3, creationDate);
        set(4, metadata);
    }
}
