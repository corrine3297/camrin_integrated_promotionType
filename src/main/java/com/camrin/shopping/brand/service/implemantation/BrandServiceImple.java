/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.brand.service.implemantation;

import com.camrin.shopping.brand.entity.Brand;
import com.camrin.shopping.brand.form.BrandForm;
import com.camrin.shopping.brand.view.BrandView;
import com.camrin.shopping.brand.repository.BrandRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.camrin.shopping.brand.service.BrandTableService;
/**
 *
 * @author HP
 */
@Service
public class BrandServiceImple implements BrandTableService {
    
     @Autowired
     BrandRepository brandRepository;
     
     
      @Override
        public BrandView getBrand(String brandId){
            
            Brand brand = brandRepository.findById(brandId);
            return new BrandView(brand.getBrandId(),brand.getBrandName(),brand.getBrandItems(),brand.getBrandCategoryId());
             
         }
        @Override
         public BrandView addBrand(BrandForm form)
         {
             Brand brand = brandRepository.save(new Brand(form.getBrandId(),form.getBrandName(),form.getBrandItems(),form.getBrandCategoryId()));
          return new BrandView(brand.getBrandId(),brand.getBrandName(),brand.getBrandItems(),brand.getBrandCategoryId());
         }
                  
          @Override   
     public BrandView putBrand(String brandId,BrandForm form)
     {
         Brand putBrand = brandRepository.findById(brandId);
         putBrand.setBrandId(form.getBrandId());
         putBrand.setBrandName(form.getBrandName());
         putBrand.setBrandItems(form.getBrandItems());
         putBrand.setBrandCategoryId(form.getBrandCategoryId());
         
         Brand brand = brandRepository.save(putBrand);
         brand = brandRepository.findById(brandId);
         
          return new BrandView(brand.getBrandId(),brand.getBrandName(),brand.getBrandItems(),brand.getBrandCategoryId());
     }
         @Override            
     public BrandView deleteBrand(String brandId){
         
         Brand brand = brandRepository.findById(brandId);
         brandRepository.delete(brand);
         return new BrandView(brand.getBrandId(),brand.getBrandName(),brand.getBrandItems(),brand.getBrandCategoryId());
     }
    
}
