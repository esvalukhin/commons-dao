/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.OauthRegistrationScope;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OauthRegistrationScopeRecord extends UpdatableRecordImpl<OauthRegistrationScopeRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1208302084;

    /**
     * Setter for <code>public.oauth_registration_scope.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.oauth_registration_scope.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.oauth_registration_scope.oauth_registration_fk</code>.
     */
    public void setOauthRegistrationFk(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.oauth_registration_scope.oauth_registration_fk</code>.
     */
    public String getOauthRegistrationFk() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.oauth_registration_scope.scope</code>.
     */
    public void setScope(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.oauth_registration_scope.scope</code>.
     */
    public String getScope() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.OAUTH_REGISTRATION_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.SCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getOauthRegistrationFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOauthRegistrationFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthRegistrationScopeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthRegistrationScopeRecord value2(String value) {
        setOauthRegistrationFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthRegistrationScopeRecord value3(String value) {
        setScope(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthRegistrationScopeRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OauthRegistrationScopeRecord
     */
    public OauthRegistrationScopeRecord() {
        super(OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE);
    }

    /**
     * Create a detached, initialised OauthRegistrationScopeRecord
     */
    public OauthRegistrationScopeRecord(Integer id, String oauthRegistrationFk, String scope) {
        super(OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE);

        set(0, id);
        set(1, oauthRegistrationFk);
        set(2, scope);
    }
}
