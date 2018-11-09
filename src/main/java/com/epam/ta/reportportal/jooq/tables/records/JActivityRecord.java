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


import com.epam.ta.reportportal.jooq.enums.JActivityEntityEnum;
import com.epam.ta.reportportal.jooq.tables.JActivity;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class JActivityRecord extends UpdatableRecordImpl<JActivityRecord> implements Record8<Long, Long, Long, JActivityEntityEnum, String, Object, Timestamp, Long> {

    private static final long serialVersionUID = -1527298618;

    /**
     * Setter for <code>public.activity.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.activity.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.activity.user_id</code>.
     */
    public void setUserId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.activity.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.activity.project_id</code>.
     */
    public void setProjectId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.activity.project_id</code>.
     */
    public Long getProjectId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.activity.entity</code>.
     */
    public void setEntity(JActivityEntityEnum value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.activity.entity</code>.
     */
    public JActivityEntityEnum getEntity() {
        return (JActivityEntityEnum) get(3);
    }

    /**
     * Setter for <code>public.activity.action</code>.
     */
    public void setAction(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.activity.action</code>.
     */
    public String getAction() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.activity.details</code>.
     */
    public void setDetails(Object value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.activity.details</code>.
     */
    public Object getDetails() {
        return get(5);
    }

    /**
     * Setter for <code>public.activity.creation_date</code>.
     */
    public void setCreationDate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.activity.creation_date</code>.
     */
    public Timestamp getCreationDate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>public.activity.object_id</code>.
     */
    public void setObjectId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.activity.object_id</code>.
     */
    public Long getObjectId() {
        return (Long) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Long, JActivityEntityEnum, String, Object, Timestamp, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Long, JActivityEntityEnum, String, Object, Timestamp, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JActivity.ACTIVITY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return JActivity.ACTIVITY.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return JActivity.ACTIVITY.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JActivityEntityEnum> field4() {
        return JActivity.ACTIVITY.ENTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JActivity.ACTIVITY.ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field6() {
        return JActivity.ACTIVITY.DETAILS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return JActivity.ACTIVITY.CREATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return JActivity.ACTIVITY.OBJECT_ID;
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
    public Long component2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityEntityEnum component4() {
        return getEntity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object component6() {
        return getDetails();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getObjectId();
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
    public Long value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityEntityEnum value4() {
        return getEntity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value6() {
        return getDetails();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getObjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value3(Long value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value4(JActivityEntityEnum value) {
        setEntity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value5(String value) {
        setAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value6(Object value) {
        setDetails(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value7(Timestamp value) {
        setCreationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value8(Long value) {
        setObjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord values(Long value1, Long value2, Long value3, JActivityEntityEnum value4, String value5, Object value6, Timestamp value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JActivityRecord
     */
    public JActivityRecord() {
        super(JActivity.ACTIVITY);
    }

    /**
     * Create a detached, initialised JActivityRecord
     */
    public JActivityRecord(Long id, Long userId, Long projectId, JActivityEntityEnum entity, String action, Object details, Timestamp creationDate, Long objectId) {
        super(JActivity.ACTIVITY);

        set(0, id);
        set(1, userId);
        set(2, projectId);
        set(3, entity);
        set(4, action);
        set(5, details);
        set(6, creationDate);
        set(7, objectId);
    }
}
