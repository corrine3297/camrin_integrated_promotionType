/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.brand.form;

import com.camrin.shopping.brandcategory.entity.BrandCategoryTable;

/**
 *
 * @author HP
 */
public class BrandForm {
   
    private String brandId;
    
  
    private String brandName;
    

    private String brandItems;
    

    private BrandCategoryTable brandCategoryId;

    
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
