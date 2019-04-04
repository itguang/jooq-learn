/*
 * This file is generated by jOOQ.
 */
package com.guang.jooqlearn.gen.tables.daos;


import com.guang.jooqlearn.gen.Tables;
import com.guang.jooqlearn.gen.tables.User;
import com.guang.jooqlearn.gen.tables.records.UserRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.*;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
@Repository
public class UserDao extends DAOImpl<UserRecord, com.guang.jooqlearn.gen.tables.pojos.User, Integer> {

    @Autowired
    DSLContext dslContext;

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(User.USER, com.guang.jooqlearn.gen.tables.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    @Autowired
    public UserDao(Configuration configuration) {
        super(User.USER, com.guang.jooqlearn.gen.tables.pojos.User.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.guang.jooqlearn.gen.tables.pojos.User object) {
        return object.getUid();
    }

    /**
     * Fetch records that have <code>uid IN (values)</code>
     */
    public List<com.guang.jooqlearn.gen.tables.pojos.User> fetchByUid(Integer... values) {
        return fetch(User.USER.UID, values);
    }

    /**
     * Fetch a unique record that has <code>uid = value</code>
     */
    public com.guang.jooqlearn.gen.tables.pojos.User fetchOneByUid(Integer value) {
        return fetchOne(User.USER.UID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.guang.jooqlearn.gen.tables.pojos.User> fetchByName(String... values) {
        return fetch(User.USER.NAME, values);
    }

    /**
     * Fetch records that have <code>sex IN (values)</code>
     */
    public List<com.guang.jooqlearn.gen.tables.pojos.User> fetchBySex(Byte... values) {
        return fetch(User.USER.SEX, values);
    }

    /**
     * Fetch records that have <code>age IN (values)</code>
     */
    public List<com.guang.jooqlearn.gen.tables.pojos.User> fetchByAge(Byte... values) {
        return fetch(User.USER.AGE, values);
    }

    /**
     * Fetch records that have <code>mobile IN (values)</code>
     */
    public List<com.guang.jooqlearn.gen.tables.pojos.User> fetchByMobile(String... values) {
        return fetch(User.USER.MOBILE, values);
    }

    /**
     * Fetch a unique record that has <code>mobile = value</code>
     */
    public com.guang.jooqlearn.gen.tables.pojos.User fetchOneByMobile(String value) {
        return fetchOne(User.USER.MOBILE, value);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<com.guang.jooqlearn.gen.tables.pojos.User> fetchByPassword(String... values) {
        return fetch(User.USER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>register_time IN (values)</code>
     */
    public List<com.guang.jooqlearn.gen.tables.pojos.User> fetchByRegisterTime(Timestamp... values) {
        return fetch(User.USER.REGISTER_TIME, values);
    }


    public List<User> getUser(String userName) {


        SelectQuery<Record> query = dslContext.selectQuery();

        if (!StringUtils.isEmpty(userName)){
            query.addConditions(Tables.USER.NAME.like("%"+userName+"%"));
        }
        Result<Record> recordResult = query.fetch();




     return null;


    }




}
