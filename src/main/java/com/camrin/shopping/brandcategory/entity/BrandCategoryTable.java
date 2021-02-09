/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.brandcategory.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author HP
 */

@Entity
@Table(name = "brand_category_table")
public class BrandCategoryTable implements Serializable{
    
    @Id
    
    private String brandCategoryId;
    private String brandCategory;

    public BrandCategoryTable(String brandCategoryId, String brandCategory) {
        this.brandCategoryId = brandCategoryId;
        this.brandCategory = brandCategory;
    }

    public BrandCategoryTable() {
    }

    public String getBrandCategoryId() {
        return brandCategoryId;
    }

    public void setBrandCategoryId(String brandCategoryId) {
        this.brandCategoryId = brandCategoryId;
    }

    public String getBrandCategory() {
        return brandCategory;
    }

    public void setBrandCategory(String brandCategory) {
        this.brandCategory = brandCategory;
    }
    
    
}
