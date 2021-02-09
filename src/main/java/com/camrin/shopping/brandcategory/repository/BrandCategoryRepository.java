/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.brandcategory.repository;

import com.camrin.shopping.brandcategory.entity.BrandCategoryTable;

import org.springframework.data.repository.Repository;
/**
 *
 * @author HP
 */

public interface BrandCategoryRepository extends Repository<BrandCategoryTable, String>{
    
     public BrandCategoryTable save(BrandCategoryTable brandcategorytable);
    
    public BrandCategoryTable findById(String brandCategoryId);
    
    public BrandCategoryTable delete(BrandCategoryTable brandcategorytable);
    
}
