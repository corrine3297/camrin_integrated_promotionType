/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ANISH
 */
@Entity
@Table(name = "keyword_tag_table")
public class KeywordTagTable implements Serializable {
    
    @Id
    private String keywordTagId;
    private String keywordTagName;

    public KeywordTagTable() {
    }

    public KeywordTagTable(String keywordTagId, String keywordTagName) {
        this.keywordTagId = keywordTagId;
        this.keywordTagName = keywordTagName;
    }

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
    
    
}
