/*
 * This file is generated by jOOQ.
 */
package com.guang.jooqlearn.gen;


import com.guang.jooqlearn.gen.tables.Order;
import com.guang.jooqlearn.gen.tables.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Study extends SchemaImpl {

    private static final long serialVersionUID = 1246666986;

    /**
     * The reference instance of <code>study</code>
     */
    public static final Study STUDY = new Study();

    /**
     * The table <code>study.order</code>.
     */
    public final Order ORDER = com.guang.jooqlearn.gen.tables.Order.ORDER;

    /**
     * The table <code>study.user</code>.
     */
    public final User USER = com.guang.jooqlearn.gen.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Study() {
        super("study", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Order.ORDER,
            User.USER);
    }
}