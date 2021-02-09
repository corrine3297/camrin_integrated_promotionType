/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.brandcategory.service;

import com.camrin.shopping.brandcategory.form.BrandCategoryForm;
import com.camrin.shopping.brandcategory.view.BrandCategoryView;


/**
 *
 * @author HP
 */
public interface BrandCategoryService {
    
    public BrandCategoryView addBrandCategoryValue(BrandCategoryForm form);

    public BrandCategoryView getBrandCategoryValue(String brandCategoryId);
    
    public BrandCategoryView putBrandCategoryValue(String brandCategoryId,BrandCategoryForm form);
    
    public BrandCategoryView deleteBrandCategoryValue(String brandCategoryId);

    
}
