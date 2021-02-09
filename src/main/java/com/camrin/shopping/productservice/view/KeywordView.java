/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.view;

import com.camrin.shopping.productservice.entity.KeywordCategoryTable;
import com.camrin.shopping.productservice.entity.KeywordTagTable;

/**
 *
 * @author ANISH
 */
public class KeywordView {
    
    private String keywordId;
    private String keywords;
    private KeywordCategoryTable keywordCategoryId;
    private KeywordTagTable keywordTag;

    public KeywordView() {
    }

    public KeywordView(String keywordId, String keywords, KeywordCategoryTable keywordCategoryId, KeywordTagTable keywordTag) {
        this.keywordId = keywordId;
        this.keywords = keywords;
        this.keywordCategoryId = keywordCategoryId;
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
    
    
}
