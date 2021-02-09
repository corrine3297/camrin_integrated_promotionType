/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.view;

/**
 *
 * @author ANISH
 */
public class KeywordCategoryView {
    
    private String keywordCategoryId;
    private String keywordCategoryName;
    private String keywordCategoryDescription;

    public KeywordCategoryView() {
    }

    public KeywordCategoryView(String keywordCategoryId, String keywordCategoryName, String keywordCategoryDescription) {
        this.keywordCategoryId = keywordCategoryId;
        this.keywordCategoryName = keywordCategoryName;
        this.keywordCategoryDescription = keywordCategoryDescription;
    }

    public String getKeywordCategoryId() {
        return keywordCategoryId;
    }

    public String getKeywordCategoryName() {
        return keywordCategoryName;
    }

    public String getKeywordCategoryDescription() {
        return keywordCategoryDescription;
    }

    public void setKeywordCategoryId(String keywordCategoryId) {
        this.keywordCategoryId = keywordCategoryId;
    }

    public void setKeywordCategoryName(String keywordCategoryName) {
        this.keywordCategoryName = keywordCategoryName;
    }

    public void setKeywordCategoryDescription(String keywordCategoryDescription) {
        this.keywordCategoryDescription = keywordCategoryDescription;
    }
    
    
}
