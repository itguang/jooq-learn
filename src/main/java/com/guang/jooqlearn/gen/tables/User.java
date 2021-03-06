/*
 * This file is generated by jOOQ.
 */
package com.guang.jooqlearn.gen.tables;


import com.guang.jooqlearn.gen.Indexes;
import com.guang.jooqlearn.gen.Keys;
import com.guang.jooqlearn.gen.Study;
import com.guang.jooqlearn.gen.tables.records.UserRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = -568194010;

    /**
     * The reference instance of <code>study.user</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>study.user.uid</code>. 用户id
     */
    public final TableField<UserRecord, Integer> UID = createField("uid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "用户id");

    /**
     * The column <code>study.user.name</code>. 姓名
     */
    public final TableField<UserRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "姓名");

    /**
     * The column <code>study.user.sex</code>. 性别
     */
    public final TableField<UserRecord, Byte> SEX = createField("sex", org.jooq.impl.SQLDataType.TINYINT, this, "性别");

    /**
     * The column <code>study.user.age</code>. 年龄
     */
    public final TableField<UserRecord, Byte> AGE = createField("age", org.jooq.impl.SQLDataType.TINYINT, this, "年龄");

    /**
     * The column <code>study.user.mobile</code>. 手机号码
     */
    public final TableField<UserRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(11), this, "手机号码");

    /**
     * The column <code>study.user.password</code>. 密码
     */
    public final TableField<UserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "密码");

    /**
     * The column <code>study.user.register_time</code>. 注册时间
     */
    public final TableField<UserRecord, Timestamp> REGISTER_TIME = createField("register_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "注册时间");

    /**
     * Create a <code>study.user</code> table reference
     */
    public User() {
        this(DSL.name("user"), null);
    }

    /**
     * Create an aliased <code>study.user</code> table reference
     */
    public User(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>study.user</code> table reference
     */
    public User(Name alias) {
        this(alias, USER);
    }

    private User(Name alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(Name alias, Table<UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> User(Table<O> child, ForeignKey<O, UserRecord> key) {
        super(child, key, USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Study.STUDY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_INDEX_MOBILE, Indexes.USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRecord>>asList(Keys.KEY_USER_PRIMARY, Keys.KEY_USER_INDEX_MOBILE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(String alias) {
        return new User(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(Name alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(Name name) {
        return new User(name, null);
    }
}
