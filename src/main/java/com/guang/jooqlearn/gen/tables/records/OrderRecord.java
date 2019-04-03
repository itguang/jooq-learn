/*
 * This file is generated by jOOQ.
 */
package com.guang.jooqlearn.gen.tables.records;


import com.guang.jooqlearn.gen.tables.Order;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class OrderRecord extends UpdatableRecordImpl<OrderRecord> implements Record5<Integer, Integer, Long, Byte, Timestamp> {

    private static final long serialVersionUID = 1502956501;

    /**
     * Setter for <code>study.order.order_id</code>. 订单编号
     */
    public void setOrderId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>study.order.order_id</code>. 订单编号
     */
    @NotNull
    public Integer getOrderId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>study.order.uid</code>. 用户Id
     */
    public void setUid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>study.order.uid</code>. 用户Id
     */
    public Integer getUid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>study.order.amout</code>. 订单金额(单位为分)
     */
    public void setAmout(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>study.order.amout</code>. 订单金额(单位为分)
     */
    @NotNull
    public Long getAmout() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>study.order.status</code>. 订单状态
     */
    public void setStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>study.order.status</code>. 订单状态
     */
    public Byte getStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>study.order.order_time</code>. 订单时间
     */
    public void setOrderTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>study.order.order_time</code>. 订单时间
     */
    public Timestamp getOrderTime() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Long, Byte, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Long, Byte, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Order.ORDER.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Order.ORDER.UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Order.ORDER.AMOUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return Order.ORDER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Order.ORDER.ORDER_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getAmout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getOrderTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAmout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getOrderTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value1(Integer value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value2(Integer value) {
        setUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value3(Long value) {
        setAmout(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value4(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord value5(Timestamp value) {
        setOrderTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderRecord values(Integer value1, Integer value2, Long value3, Byte value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderRecord
     */
    public OrderRecord() {
        super(Order.ORDER);
    }

    /**
     * Create a detached, initialised OrderRecord
     */
    public OrderRecord(Integer orderId, Integer uid, Long amout, Byte status, Timestamp orderTime) {
        super(Order.ORDER);

        set(0, orderId);
        set(1, uid);
        set(2, amout);
        set(3, status);
        set(4, orderTime);
    }
}
