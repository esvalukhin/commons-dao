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


import com.epam.ta.reportportal.jooq.tables.JUserCreationBid;

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
public class JUserCreationBidRecord extends UpdatableRecordImpl<JUserCreationBidRecord> implements Record5<String, Timestamp, String, Long, String> {

    private static final long serialVersionUID = -1687051465;

    /**
     * Setter for <code>public.user_creation_bid.uuid</code>.
     */
    public void setUuid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user_creation_bid.uuid</code>.
     */
    public String getUuid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.user_creation_bid.last_modified</code>.
     */
    public void setLastModified(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user_creation_bid.last_modified</code>.
     */
    public Timestamp getLastModified() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.user_creation_bid.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.user_creation_bid.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.user_creation_bid.default_project_id</code>.
     */
    public void setDefaultProjectId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.user_creation_bid.default_project_id</code>.
     */
    public Long getDefaultProjectId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.user_creation_bid.role</code>.
     */
    public void setRole(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.user_creation_bid.role</code>.
     */
    public String getRole() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, Timestamp, String, Long, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, Timestamp, String, Long, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return JUserCreationBid.USER_CREATION_BID.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return JUserCreationBid.USER_CREATION_BID.LAST_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JUserCreationBid.USER_CREATION_BID.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return JUserCreationBid.USER_CREATION_BID.DEFAULT_PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JUserCreationBid.USER_CREATION_BID.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getLastModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getDefaultProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getLastModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getDefaultProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUserCreationBidRecord value1(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUserCreationBidRecord value2(Timestamp value) {
        setLastModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUserCreationBidRecord value3(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUserCreationBidRecord value4(Long value) {
        setDefaultProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUserCreationBidRecord value5(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUserCreationBidRecord values(String value1, Timestamp value2, String value3, Long value4, String value5) {
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
     * Create a detached JUserCreationBidRecord
     */
    public JUserCreationBidRecord() {
        super(JUserCreationBid.USER_CREATION_BID);
    }

    /**
     * Create a detached, initialised JUserCreationBidRecord
     */
    public JUserCreationBidRecord(String uuid, Timestamp lastModified, String email, Long defaultProjectId, String role) {
        super(JUserCreationBid.USER_CREATION_BID);

        set(0, uuid);
        set(1, lastModified);
        set(2, email);
        set(3, defaultProjectId);
        set(4, role);
    }
}
