/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JItemAttribute;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.7" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JItemAttributeRecord extends UpdatableRecordImpl<JItemAttributeRecord>
		implements Record6<Integer, String, String, Long, Long, Boolean> {

	private static final long serialVersionUID = -835008905;

	/**
	 * Setter for <code>public.item_attribute.id</code>.
	 */
	public void setId(Integer value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.item_attribute.id</code>.
	 */
	public Integer getId() {
		return (Integer) get(0);
	}

	/**
	 * Setter for <code>public.item_attribute.key</code>.
	 */
	public void setKey(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.item_attribute.key</code>.
	 */
	public String getKey() {
		return (String) get(1);
	}

	/**
	 * Setter for <code>public.item_attribute.value</code>.
	 */
	public void setValue(String value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.item_attribute.value</code>.
	 */
	public String getValue() {
		return (String) get(2);
	}

	/**
	 * Setter for <code>public.item_attribute.item_id</code>.
	 */
	public void setItemId(Long value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.item_attribute.item_id</code>.
	 */
	public Long getItemId() {
		return (Long) get(3);
	}

	/**
	 * Setter for <code>public.item_attribute.launch_id</code>.
	 */
	public void setLaunchId(Long value) {
		set(4, value);
	}

	/**
	 * Getter for <code>public.item_attribute.launch_id</code>.
	 */
	public Long getLaunchId() {
		return (Long) get(4);
	}

	/**
	 * Setter for <code>public.item_attribute.system</code>.
	 */
	public void setSystem(Boolean value) {
		set(5, value);
	}

	/**
	 * Getter for <code>public.item_attribute.system</code>.
	 */
	public Boolean getSystem() {
		return (Boolean) get(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, Long, Long, Boolean> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, Long, Long, Boolean> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return JItemAttribute.ITEM_ATTRIBUTE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JItemAttribute.ITEM_ATTRIBUTE.KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return JItemAttribute.ITEM_ATTRIBUTE.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return JItemAttribute.ITEM_ATTRIBUTE.ITEM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return JItemAttribute.ITEM_ATTRIBUTE.LAUNCH_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field6() {
		return JItemAttribute.ITEM_ATTRIBUTE.SYSTEM;
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
		return getKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component3() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component4() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component5() {
		return getLaunchId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean component6() {
		return getSystem();
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
		return getKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getItemId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getLaunchId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value6() {
		return getSystem();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JItemAttributeRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JItemAttributeRecord value2(String value) {
		setKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JItemAttributeRecord value3(String value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JItemAttributeRecord value4(Long value) {
		setItemId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JItemAttributeRecord value5(Long value) {
		setLaunchId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JItemAttributeRecord value6(Boolean value) {
		setSystem(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JItemAttributeRecord values(Integer value1, String value2, String value3, Long value4, Long value5, Boolean value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JItemAttributeRecord
	 */
	public JItemAttributeRecord() {
		super(JItemAttribute.ITEM_ATTRIBUTE);
	}

	/**
	 * Create a detached, initialised JItemAttributeRecord
	 */
	public JItemAttributeRecord(Integer id, String key, String value, Long itemId, Long launchId, Boolean system) {
		super(JItemAttribute.ITEM_ATTRIBUTE);

		set(0, id);
		set(1, key);
		set(2, value);
		set(3, itemId);
		set(4, launchId);
		set(5, system);
	}
}
