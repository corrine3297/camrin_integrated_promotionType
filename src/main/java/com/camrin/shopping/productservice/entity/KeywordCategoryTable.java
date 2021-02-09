/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

/**
 *
 * @author ANISH
 */
@Entity
@Table(name = "keyword_category_table")
public class KeywordCategoryTable implements Serializable {
    
    @Id
    private String keywordCategoryId;
    private String keywordCategoryName;
    private String keywordCategoryDescription;

    public KeywordCategoryTable() {
    }

    public KeywordCategoryTable(String keywordCategoryId, String keywordCategoryName, String keywordCategoryDescription) {
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
