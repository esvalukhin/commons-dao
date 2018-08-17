/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.tables.records.JCrosstab2Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JCrosstab2 extends TableImpl<JCrosstab2Record> {

    private static final long serialVersionUID = -1988507110;

    /**
     * The reference instance of <code>public.crosstab2</code>
     */
    public static final JCrosstab2 CROSSTAB2 = new JCrosstab2();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JCrosstab2Record> getRecordType() {
        return JCrosstab2Record.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JCrosstab2Record, Object> CROSSTAB2_ = createField("crosstab2", org.jooq.impl.DefaultDataType.getDefaultDataType("\"tablefunc_crosstab_2\""), this, "");

    /**
     * Create a <code>public.crosstab2</code> table reference
     */
    public JCrosstab2() {
        this(DSL.name("crosstab2"), null);
    }

    /**
     * Create an aliased <code>public.crosstab2</code> table reference
     */
    public JCrosstab2(String alias) {
        this(DSL.name(alias), CROSSTAB2);
    }

    /**
     * Create an aliased <code>public.crosstab2</code> table reference
     */
    public JCrosstab2(Name alias) {
        this(alias, CROSSTAB2);
    }

    private JCrosstab2(Name alias, Table<JCrosstab2Record> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private JCrosstab2(Name alias, Table<JCrosstab2Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JCrosstab2(Table<O> child, ForeignKey<O, JCrosstab2Record> key) {
        super(child, key, CROSSTAB2);
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
    public JCrosstab2 as(String alias) {
        return new JCrosstab2(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JCrosstab2 as(Name alias) {
        return new JCrosstab2(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JCrosstab2 rename(String name) {
        return new JCrosstab2(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JCrosstab2 rename(Name name) {
        return new JCrosstab2(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JCrosstab2 call(String __1) {
        return new JCrosstab2(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.SQLDataType.CLOB)
        });
    }

    /**
     * Call this table-valued function
     */
    public JCrosstab2 call(Field<String> __1) {
        return new JCrosstab2(DSL.name(getName()), null, new Field[] { 
              __1
        });
    }
}
