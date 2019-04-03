/*
 * This file is generated by jOOQ.
 */
package com.guang.jooqlearn.gen.tables.records;


import com.guang.jooqlearn.gen.tables.Book;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BookRecord extends UpdatableRecordImpl<BookRecord> implements Record11<Integer, Integer, Integer, Integer, String, Integer, Integer, String, byte[], Integer, Timestamp> {

    private static final long serialVersionUID = 1054750176;

    /**
     * Setter for <code>study.book.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>study.book.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>study.book.author_id</code>.
     */
    public void setAuthorId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>study.book.author_id</code>.
     */
    public Integer getAuthorId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>study.book.co_author_id</code>.
     */
    public void setCoAuthorId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>study.book.co_author_id</code>.
     */
    public Integer getCoAuthorId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>study.book.details_id</code>.
     */
    public void setDetailsId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>study.book.details_id</code>.
     */
    public Integer getDetailsId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>study.book.title</code>.
     */
    public void setTitle(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>study.book.title</code>.
     */
    public String getTitle() {
        return (String) get(4);
    }

    /**
     * Setter for <code>study.book.published_in</code>.
     */
    public void setPublishedIn(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>study.book.published_in</code>.
     */
    public Integer getPublishedIn() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>study.book.language_id</code>.
     */
    public void setLanguageId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>study.book.language_id</code>.
     */
    public Integer getLanguageId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>study.book.content_text</code>.
     */
    public void setContentText(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>study.book.content_text</code>.
     */
    public String getContentText() {
        return (String) get(7);
    }

    /**
     * Setter for <code>study.book.content_pdf</code>.
     */
    public void setContentPdf(byte... value) {
        set(8, value);
    }

    /**
     * Getter for <code>study.book.content_pdf</code>.
     */
    public byte[] getContentPdf() {
        return (byte[]) get(8);
    }

    /**
     * Setter for <code>study.book.rec_version</code>.
     */
    public void setRecVersion(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>study.book.rec_version</code>.
     */
    public Integer getRecVersion() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>study.book.rec_timestamp</code>.
     */
    public void setRecTimestamp(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>study.book.rec_timestamp</code>.
     */
    public Timestamp getRecTimestamp() {
        return (Timestamp) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, Integer, String, Integer, Integer, String, byte[], Integer, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, Integer, String, Integer, Integer, String, byte[], Integer, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Book.BOOK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Book.BOOK.AUTHOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Book.BOOK.CO_AUTHOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Book.BOOK.DETAILS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Book.BOOK.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Book.BOOK.PUBLISHED_IN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Book.BOOK.LANGUAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Book.BOOK.CONTENT_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field9() {
        return Book.BOOK.CONTENT_PDF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Book.BOOK.REC_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Book.BOOK.REC_TIMESTAMP;
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
    public Integer component2() {
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCoAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getDetailsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getPublishedIn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getLanguageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getContentText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component9() {
        return getContentPdf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getRecVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getRecTimestamp();
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
    public Integer value2() {
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCoAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDetailsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPublishedIn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getLanguageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getContentText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value9() {
        return getContentPdf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getRecVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getRecTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value2(Integer value) {
        setAuthorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value3(Integer value) {
        setCoAuthorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value4(Integer value) {
        setDetailsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value5(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value6(Integer value) {
        setPublishedIn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value7(Integer value) {
        setLanguageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value8(String value) {
        setContentText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value9(byte... value) {
        setContentPdf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value10(Integer value) {
        setRecVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value11(Timestamp value) {
        setRecTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, Integer value6, Integer value7, String value8, byte[] value9, Integer value10, Timestamp value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookRecord
     */
    public BookRecord() {
        super(Book.BOOK);
    }

    /**
     * Create a detached, initialised BookRecord
     */
    public BookRecord(Integer id, Integer authorId, Integer coAuthorId, Integer detailsId, String title, Integer publishedIn, Integer languageId, String contentText, byte[] contentPdf, Integer recVersion, Timestamp recTimestamp) {
        super(Book.BOOK);

        set(0, id);
        set(1, authorId);
        set(2, coAuthorId);
        set(3, detailsId);
        set(4, title);
        set(5, publishedIn);
        set(6, languageId);
        set(7, contentText);
        set(8, contentPdf);
        set(9, recVersion);
        set(10, recTimestamp);
    }
}
