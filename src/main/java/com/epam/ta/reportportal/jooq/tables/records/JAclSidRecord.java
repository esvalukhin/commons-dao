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


import com.epam.ta.reportportal.jooq.tables.JAclSid;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class JAclSidRecord extends UpdatableRecordImpl<JAclSidRecord> implements Record3<Long, Boolean, String> {

    private static final long serialVersionUID = 419274333;

    /**
     * Setter for <code>public.acl_sid.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.acl_sid.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.acl_sid.principal</code>.
     */
    public void setPrincipal(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.acl_sid.principal</code>.
     */
    public Boolean getPrincipal() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>public.acl_sid.sid</code>.
     */
    public void setSid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.acl_sid.sid</code>.
     */
    public String getSid() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Boolean, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Boolean, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JAclSid.ACL_SID.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return JAclSid.ACL_SID.PRINCIPAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JAclSid.ACL_SID.SID;
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
    public Boolean component2() {
        return getPrincipal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSid();
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
    public Boolean value2() {
        return getPrincipal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAclSidRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAclSidRecord value2(Boolean value) {
        setPrincipal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAclSidRecord value3(String value) {
        setSid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAclSidRecord values(Long value1, Boolean value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JAclSidRecord
     */
    public JAclSidRecord() {
        super(JAclSid.ACL_SID);
    }

    /**
     * Create a detached, initialised JAclSidRecord
     */
    public JAclSidRecord(Long id, Boolean principal, String sid) {
        super(JAclSid.ACL_SID);

        set(0, id);
        set(1, principal);
        set(2, sid);
    }
}
