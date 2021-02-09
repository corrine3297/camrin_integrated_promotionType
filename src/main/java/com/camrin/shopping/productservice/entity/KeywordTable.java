/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ANISH
 */
@Entity
@Table(name = "keyword_table")
public class KeywordTable implements Serializable {
    
    @Id
    @Column(name = "keyword_id")
    private String keywordId;
    
    @Column(name = "keywords")
    private String keywords;
    
    @ManyToOne
    @JoinColumn(name = "keyword_category_id")
    private KeywordCategoryTable keywordCategoryId;
    
    @ManyToOne
    @JoinColumn(name = "keyword_tag")
    private KeywordTagTable keywordTag;

    public KeywordTable(String keywordId, String keywords, KeywordCategoryTable keywordCategoryId, KeywordTagTable keywordTag) {
        this.keywordId = keywordId;
        this.keywords = keywords;
        this.keywordCategoryId = keywordCategoryId;
        this.keywordTag = keywordTag;
    }

    public KeywordTable() {
    }

    public void setKeywordId(String keywordId) {
        this.keywordId = keywordId;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setKeywordCategoryId(KeywordCategoryTable keywordCategoryId) {
        this.keywordCategoryId = keywordCategoryId;
    }

    public void setKeywordTag(KeywordTagTable keywordTag) {
        this.keywordTag = keywordTag;
    }

    public String getKeywordId() {
        return keywordId;
    }

    public String getKeywords() {
        return keywords;
    }

    public KeywordCategoryTable getKeywordCategoryId() {
        return keywordCategoryId;
    }

    public KeywordTagTable getKeywordTag() {
        return keywordTag;
    }
    
    
}
