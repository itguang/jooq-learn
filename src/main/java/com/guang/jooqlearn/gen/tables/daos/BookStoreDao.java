/*
 * This file is generated by jOOQ.
 */
package com.guang.jooqlearn.gen.tables.daos;


import com.guang.jooqlearn.gen.tables.BookStore;
import com.guang.jooqlearn.gen.tables.records.BookStoreRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


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
@Repository
public class BookStoreDao extends DAOImpl<BookStoreRecord, com.guang.jooqlearn.gen.tables.pojos.BookStore, String> {

    /**
     * Create a new BookStoreDao without any configuration
     */
    public BookStoreDao() {
        super(BookStore.BOOK_STORE, com.guang.jooqlearn.gen.tables.pojos.BookStore.class);
    }

    /**
     * Create a new BookStoreDao with an attached configuration
     */
    @Autowired
    public BookStoreDao(Configuration configuration) {
        super(BookStore.BOOK_STORE, com.guang.jooqlearn.gen.tables.pojos.BookStore.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.guang.jooqlearn.gen.tables.pojos.BookStore object) {
        return object.getName();
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.guang.jooqlearn.gen.tables.pojos.BookStore> fetchByName(String... values) {
        return fetch(BookStore.BOOK_STORE.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>name = value</code>
     */
    public com.guang.jooqlearn.gen.tables.pojos.BookStore fetchOneByName(String value) {
        return fetchOne(BookStore.BOOK_STORE.NAME, value);
    }
}
