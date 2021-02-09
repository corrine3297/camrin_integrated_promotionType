/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.brand.entity;

import com.camrin.shopping.brandcategory.entity.BrandCategoryTable;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author HP
 */

@Entity
@Table(name = "brand_table")
public class Brand implements Serializable{
    
    
    @Id
    
    @Column(name="brand_id")
    private String brandId;
    
    @Column(name="brand_name")
    private String brandName;
    
    @Column(name="brand_items")
    private String brandItems;
    
    
    @ManyToOne
    @JoinColumn(name="brand_category_id")
    private BrandCategoryTable brandCategoryId;

    public Brand(String brandId, String brandName, String brandItems, BrandCategoryTable brandCategoryId) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandItems = brandItems;
        this.brandCategoryId = brandCategoryId;
    }

    public Brand() {
    }

    public String getBrandId() {
        return brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getBrandItems() {
        return brandItems;
    }

    public BrandCategoryTable getBrandCategoryId() {
        return brandCategoryId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setBrandItems(String brandItems) {
        this.brandItems = brandItems;
    }

    public void setBrandCategoryId(BrandCategoryTable brandCategoryId) {
        this.brandCategoryId = brandCategoryId;
    }
    
    
    
    
}
