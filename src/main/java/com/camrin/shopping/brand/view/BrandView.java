/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.brand.view;

import com.camrin.shopping.brandcategory.entity.BrandCategoryTable;

/**
 *
 * @author HP
 */
public class BrandView {
    
    private String brandId;
    
  
    private String brandName;
    

    private String brandItems;
    
    

    private BrandCategoryTable brandCategoryId;

    public BrandView() {
    }

    public BrandView(String brandId, String brandName, String brandItems, BrandCategoryTable brandCategoryId) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandItems = brandItems;
        this.brandCategoryId = brandCategoryId;
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
