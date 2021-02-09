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
public class KeywordTagView {
    
    private String keywordTagId;
    private String keywordTagName;

    public String getKeywordTagId() {
        return keywordTagId;
    }

    public String getKeywordTagName() {
        return keywordTagName;
    }

    public void setKeywordTagId(String keywordTagId) {
        this.keywordTagId = keywordTagId;
    }

    public void setKeywordTagName(String keywordTagName) {
        this.keywordTagName = keywordTagName;
    }

    public KeywordTagView(String keywordTagId, String keywordTagName) {
        this.keywordTagId = keywordTagId;
        this.keywordTagName = keywordTagName;
    }

    public KeywordTagView() {
    }
    
    
}
