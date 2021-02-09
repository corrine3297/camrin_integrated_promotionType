/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.brandcategory.view;

/**
 *
 * @author HP
 */
public class BrandCategoryView {
    
    private String brandCategoryId;
    private String brandCategory;

    public BrandCategoryView() {
    }

    public BrandCategoryView(String brandCategoryId, String brandCategory) {
        this.brandCategoryId = brandCategoryId;
        this.brandCategory = brandCategory;
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
