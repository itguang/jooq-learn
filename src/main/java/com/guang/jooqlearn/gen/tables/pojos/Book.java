/*
 * This file is generated by jOOQ.
 */
package com.guang.jooqlearn.gen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

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
public class Book implements Serializable {

    private static final long serialVersionUID = -936555988;

    private Integer   id;
    private Integer   authorId;
    private Integer   coAuthorId;
    private Integer   detailsId;
    private String    title;
    private Integer   publishedIn;
    private Integer   languageId;
    private String    contentText;
    private byte[]    contentPdf;
    private Integer   recVersion;
    private Timestamp recTimestamp;

    public Book() {}

    public Book(Book value) {
        this.id = value.id;
        this.authorId = value.authorId;
        this.coAuthorId = value.coAuthorId;
        this.detailsId = value.detailsId;
        this.title = value.title;
        this.publishedIn = value.publishedIn;
        this.languageId = value.languageId;
        this.contentText = value.contentText;
        this.contentPdf = value.contentPdf;
        this.recVersion = value.recVersion;
        this.recTimestamp = value.recTimestamp;
    }

    public Book(
        Integer   id,
        Integer   authorId,
        Integer   coAuthorId,
        Integer   detailsId,
        String    title,
        Integer   publishedIn,
        Integer   languageId,
        String    contentText,
        byte[]    contentPdf,
        Integer   recVersion,
        Timestamp recTimestamp
    ) {
        this.id = id;
        this.authorId = authorId;
        this.coAuthorId = coAuthorId;
        this.detailsId = detailsId;
        this.title = title;
        this.publishedIn = publishedIn;
        this.languageId = languageId;
        this.contentText = contentText;
        this.contentPdf = contentPdf;
        this.recVersion = recVersion;
        this.recTimestamp = recTimestamp;
    }

    @NotNull
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    public Integer getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getCoAuthorId() {
        return this.coAuthorId;
    }

    public void setCoAuthorId(Integer coAuthorId) {
        this.coAuthorId = coAuthorId;
    }

    public Integer getDetailsId() {
        return this.detailsId;
    }

    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
    }

    @NotNull
    @Size(max = 400)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublishedIn() {
        return this.publishedIn;
    }

    public void setPublishedIn(Integer publishedIn) {
        this.publishedIn = publishedIn;
    }

    public Integer getLanguageId() {
        return this.languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    @Size(max = 2000)
    public String getContentText() {
        return this.contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    @Size(max = 65535)
    public byte[] getContentPdf() {
        return this.contentPdf;
    }

    public void setContentPdf(byte... contentPdf) {
        this.contentPdf = contentPdf;
    }

    public Integer getRecVersion() {
        return this.recVersion;
    }

    public void setRecVersion(Integer recVersion) {
        this.recVersion = recVersion;
    }

    public Timestamp getRecTimestamp() {
        return this.recTimestamp;
    }

    public void setRecTimestamp(Timestamp recTimestamp) {
        this.recTimestamp = recTimestamp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Book other = (Book) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (authorId == null) {
            if (other.authorId != null)
                return false;
        }
        else if (!authorId.equals(other.authorId))
            return false;
        if (coAuthorId == null) {
            if (other.coAuthorId != null)
                return false;
        }
        else if (!coAuthorId.equals(other.coAuthorId))
            return false;
        if (detailsId == null) {
            if (other.detailsId != null)
                return false;
        }
        else if (!detailsId.equals(other.detailsId))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        }
        else if (!title.equals(other.title))
            return false;
        if (publishedIn == null) {
            if (other.publishedIn != null)
                return false;
        }
        else if (!publishedIn.equals(other.publishedIn))
            return false;
        if (languageId == null) {
            if (other.languageId != null)
                return false;
        }
        else if (!languageId.equals(other.languageId))
            return false;
        if (contentText == null) {
            if (other.contentText != null)
                return false;
        }
        else if (!contentText.equals(other.contentText))
            return false;
        if (contentPdf == null) {
            if (other.contentPdf != null)
                return false;
        }
        else if (!Arrays.equals(contentPdf, other.contentPdf))
            return false;
        if (recVersion == null) {
            if (other.recVersion != null)
                return false;
        }
        else if (!recVersion.equals(other.recVersion))
            return false;
        if (recTimestamp == null) {
            if (other.recTimestamp != null)
                return false;
        }
        else if (!recTimestamp.equals(other.recTimestamp))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.authorId == null) ? 0 : this.authorId.hashCode());
        result = prime * result + ((this.coAuthorId == null) ? 0 : this.coAuthorId.hashCode());
        result = prime * result + ((this.detailsId == null) ? 0 : this.detailsId.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.publishedIn == null) ? 0 : this.publishedIn.hashCode());
        result = prime * result + ((this.languageId == null) ? 0 : this.languageId.hashCode());
        result = prime * result + ((this.contentText == null) ? 0 : this.contentText.hashCode());
        result = prime * result + ((this.contentPdf == null) ? 0 : Arrays.hashCode(this.contentPdf));
        result = prime * result + ((this.recVersion == null) ? 0 : this.recVersion.hashCode());
        result = prime * result + ((this.recTimestamp == null) ? 0 : this.recTimestamp.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Book (");

        sb.append(id);
        sb.append(", ").append(authorId);
        sb.append(", ").append(coAuthorId);
        sb.append(", ").append(detailsId);
        sb.append(", ").append(title);
        sb.append(", ").append(publishedIn);
        sb.append(", ").append(languageId);
        sb.append(", ").append(contentText);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(recVersion);
        sb.append(", ").append(recTimestamp);

        sb.append(")");
        return sb.toString();
    }
}
