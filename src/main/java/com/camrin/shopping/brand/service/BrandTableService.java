/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.brand.service;

import com.camrin.shopping.brand.view.BrandView;
import com.camrin.shopping.brand.form.BrandForm;

/**
 *
 * @author HP
 */
public interface BrandTableService {
    
     public BrandView getBrand(String brandId);
     
     public BrandView addBrand(BrandForm form);
             
     public BrandView putBrand(String brandId,BrandForm form);
                     
     public BrandView deleteBrand(String brandId);
    
}
