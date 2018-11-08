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


import com.epam.ta.reportportal.jooq.enums.JPasswordEncoderType;
import com.epam.ta.reportportal.jooq.tables.JLdapConfig;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class JLdapConfigRecord extends UpdatableRecordImpl<JLdapConfigRecord> implements Record12<Long, String, String, Long, String, String, String, String, String, String, String, JPasswordEncoderType> {

    private static final long serialVersionUID = 286662535;

    /**
     * Setter for <code>public.ldap_config.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.ldap_config.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.ldap_config.url</code>.
     */
    public void setUrl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.ldap_config.url</code>.
     */
    public String getUrl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.ldap_config.base_dn</code>.
     */
    public void setBaseDn(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.ldap_config.base_dn</code>.
     */
    public String getBaseDn() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.ldap_config.sync_attributes_id</code>.
     */
    public void setSyncAttributesId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.ldap_config.sync_attributes_id</code>.
     */
    public Long getSyncAttributesId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.ldap_config.user_dn_pattern</code>.
     */
    public void setUserDnPattern(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.ldap_config.user_dn_pattern</code>.
     */
    public String getUserDnPattern() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.ldap_config.user_search_filter</code>.
     */
    public void setUserSearchFilter(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.ldap_config.user_search_filter</code>.
     */
    public String getUserSearchFilter() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.ldap_config.group_search_base</code>.
     */
    public void setGroupSearchBase(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.ldap_config.group_search_base</code>.
     */
    public String getGroupSearchBase() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.ldap_config.group_search_filter</code>.
     */
    public void setGroupSearchFilter(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.ldap_config.group_search_filter</code>.
     */
    public String getGroupSearchFilter() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.ldap_config.password_attributes</code>.
     */
    public void setPasswordAttributes(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.ldap_config.password_attributes</code>.
     */
    public String getPasswordAttributes() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.ldap_config.manager_dn</code>.
     */
    public void setManagerDn(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.ldap_config.manager_dn</code>.
     */
    public String getManagerDn() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.ldap_config.manager_password</code>.
     */
    public void setManagerPassword(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.ldap_config.manager_password</code>.
     */
    public String getManagerPassword() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.ldap_config.passwordencodertype</code>.
     */
    public void setPasswordencodertype(JPasswordEncoderType value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.ldap_config.passwordencodertype</code>.
     */
    public JPasswordEncoderType getPasswordencodertype() {
        return (JPasswordEncoderType) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, Long, String, String, String, String, String, String, String, JPasswordEncoderType> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, Long, String, String, String, String, String, String, String, JPasswordEncoderType> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JLdapConfig.LDAP_CONFIG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JLdapConfig.LDAP_CONFIG.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JLdapConfig.LDAP_CONFIG.BASE_DN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return JLdapConfig.LDAP_CONFIG.SYNC_ATTRIBUTES_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JLdapConfig.LDAP_CONFIG.USER_DN_PATTERN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return JLdapConfig.LDAP_CONFIG.USER_SEARCH_FILTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return JLdapConfig.LDAP_CONFIG.GROUP_SEARCH_BASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return JLdapConfig.LDAP_CONFIG.GROUP_SEARCH_FILTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return JLdapConfig.LDAP_CONFIG.PASSWORD_ATTRIBUTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return JLdapConfig.LDAP_CONFIG.MANAGER_DN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return JLdapConfig.LDAP_CONFIG.MANAGER_PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JPasswordEncoderType> field12() {
        return JLdapConfig.LDAP_CONFIG.PASSWORDENCODERTYPE;
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
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getBaseDn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getSyncAttributesId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUserDnPattern();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUserSearchFilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getGroupSearchBase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getGroupSearchFilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPasswordAttributes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getManagerDn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getManagerPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JPasswordEncoderType component12() {
        return getPasswordencodertype();
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
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBaseDn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getSyncAttributesId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUserDnPattern();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUserSearchFilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getGroupSearchBase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getGroupSearchFilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPasswordAttributes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getManagerDn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getManagerPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JPasswordEncoderType value12() {
        return getPasswordencodertype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfigRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfigRecord value2(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfigRecord value3(String value) {
        setBaseDn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfigRecord value4(Long value) {
        setSyncAttributesId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfigRecord value5(String value) {
        setUserDnPattern(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfigRecord value6(String value) {
        setUserSearchFilter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfigRecord value7(String value) {
        setGroupSearchBase(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfigRecord value8(String value) {
        setGroupSearchFilter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfigRecord value9(String value) {
        setPasswordAttributes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfigRecord value10(String value) {
        setManagerDn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfigRecord value11(String value) {
        setManagerPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfigRecord value12(JPasswordEncoderType value) {
        setPasswordencodertype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLdapConfigRecord values(Long value1, String value2, String value3, Long value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, JPasswordEncoderType value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JLdapConfigRecord
     */
    public JLdapConfigRecord() {
        super(JLdapConfig.LDAP_CONFIG);
    }

    /**
     * Create a detached, initialised JLdapConfigRecord
     */
    public JLdapConfigRecord(Long id, String url, String baseDn, Long syncAttributesId, String userDnPattern, String userSearchFilter, String groupSearchBase, String groupSearchFilter, String passwordAttributes, String managerDn, String managerPassword, JPasswordEncoderType passwordencodertype) {
        super(JLdapConfig.LDAP_CONFIG);

        set(0, id);
        set(1, url);
        set(2, baseDn);
        set(3, syncAttributesId);
        set(4, userDnPattern);
        set(5, userSearchFilter);
        set(6, groupSearchBase);
        set(7, groupSearchFilter);
        set(8, passwordAttributes);
        set(9, managerDn);
        set(10, managerPassword);
        set(11, passwordencodertype);
    }
}
