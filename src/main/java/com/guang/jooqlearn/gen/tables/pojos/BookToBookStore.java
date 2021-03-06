/*
 * This file is generated by jOOQ.
 */
package com.guang.jooqlearn.gen.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class BookToBookStore implements Serializable {

    private static final long serialVersionUID = -2062223378;

    private String  bookStoreName;
    private Integer bookId;
    private Integer stock;

    public BookToBookStore() {}

    public BookToBookStore(BookToBookStore value) {
        this.bookStoreName = value.bookStoreName;
        this.bookId = value.bookId;
        this.stock = value.stock;
    }

    public BookToBookStore(
        String  bookStoreName,
        Integer bookId,
        Integer stock
    ) {
        this.bookStoreName = bookStoreName;
        this.bookId = bookId;
        this.stock = stock;
    }

    @NotNull
    @Size(max = 400)
    public String getBookStoreName() {
        return this.bookStoreName;
    }

    public void setBookStoreName(String bookStoreName) {
        this.bookStoreName = bookStoreName;
    }

    @NotNull
    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getStock() {
        return this.stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final BookToBookStore other = (BookToBookStore) obj;
        if (bookStoreName == null) {
            if (other.bookStoreName != null)
                return false;
        }
        else if (!bookStoreName.equals(other.bookStoreName))
            return false;
        if (bookId == null) {
            if (other.bookId != null)
                return false;
        }
        else if (!bookId.equals(other.bookId))
            return false;
        if (stock == null) {
            if (other.stock != null)
                return false;
        }
        else if (!stock.equals(other.stock))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.bookStoreName == null) ? 0 : this.bookStoreName.hashCode());
        result = prime * result + ((this.bookId == null) ? 0 : this.bookId.hashCode());
        result = prime * result + ((this.stock == null) ? 0 : this.stock.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BookToBookStore (");

        sb.append(bookStoreName);
        sb.append(", ").append(bookId);
        sb.append(", ").append(stock);

        sb.append(")");
        return sb.toString();
    }
}
