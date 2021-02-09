/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.brandcategory.service.implemantation;

import com.camrin.shopping.brandcategory.service.BrandCategoryService;
import com.camrin.shopping.brandcategory.form.BrandCategoryForm;
import com.camrin.shopping.brandcategory.view.BrandCategoryView;
import com.camrin.shopping.brandcategory.entity.BrandCategoryTable;
import com.camrin.shopping.brandcategory.repository.BrandCategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author HP
 */
@Service

public class BrandCategoryServiceImple implements BrandCategoryService{
    
    
    @Autowired
    BrandCategoryRepository brandCategoryRepository;
    
    
      @Override
    public BrandCategoryView addBrandCategoryValue(BrandCategoryForm form)
    {
        BrandCategoryTable brandcategorytable = brandCategoryRepository.save(new BrandCategoryTable(form.getBrandCategoryId(),form.getBrandCategory()));
        return new BrandCategoryView(brandcategorytable.getBrandCategoryId(),brandcategorytable.getBrandCategory());
    }
    
       @Override
        public BrandCategoryView getBrandCategoryValue(String brandCategoryId){
            
             BrandCategoryTable brandcategorytable = brandCategoryRepository.findById(brandCategoryId);
             
             return new BrandCategoryView(brandcategorytable.getBrandCategoryId(),brandcategorytable.getBrandCategory());
             
        }
        
        
        
        @Override
    public BrandCategoryView putBrandCategoryValue(String brandCategoryId,BrandCategoryForm form){
        
        BrandCategoryTable brandCategoryTablePut = brandCategoryRepository.findById(brandCategoryId);
        
               brandCategoryTablePut.setBrandCategoryId(form.getBrandCategoryId());
               brandCategoryTablePut.setBrandCategory(form.getBrandCategory());
               
             BrandCategoryTable brandcategorytable =   brandCategoryRepository.save(brandCategoryTablePut);
             brandcategorytable=brandCategoryRepository.findById(brandCategoryId);

              return new BrandCategoryView(brandcategorytable.getBrandCategoryId(),brandcategorytable.getBrandCategory());       
    }
    
        @Override
    public BrandCategoryView deleteBrandCategoryValue(String brandCategoryId){
        
        BrandCategoryTable brandcategorytable = brandCategoryRepository.findById(brandCategoryId);
        brandCategoryRepository.delete(brandcategorytable);
          return new BrandCategoryView(brandcategorytable.getBrandCategoryId(),brandcategorytable.getBrandCategory());       

    }
    
    
       
    
}
