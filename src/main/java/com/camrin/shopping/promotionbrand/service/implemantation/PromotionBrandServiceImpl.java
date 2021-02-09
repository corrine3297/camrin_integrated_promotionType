/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.promotionbrand.service.implemantation;

import com.camrin.shopping.promotionbrand.form.PromotionBrandForm;
import com.camrin.shopping.promotionbrand.view.PromotionBrandView;
import com.camrin.shopping.promotionbrand.entity.PromotionBrand;
import com.camrin.shopping.promotionbrand.repository.PromotionBrandRepository;
import com.camrin.shopping.promotionbrand.service.PromotionBrandService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */

@Service
public class PromotionBrandServiceImpl implements PromotionBrandService{
    
      @Autowired
      PromotionBrandRepository promotionBrandRepository;
    
    @Override
    public PromotionBrandView addPromtionBrand(PromotionBrandForm form){
        
        PromotionBrand promotionBrand=promotionBrandRepository.save(new PromotionBrand(form.getPromotionBasedonBrandId(),form.getPromotionBasedonBrandName(),form.getPromotionBasedonBrandStartDate(),form.getPromotionBasedonBrandEndDate(),form.getPromotionBasedonBrandDetails(),form.getPromotionBasedonBrandAmount(),form.getBrandId()));
    return new PromotionBrandView(promotionBrand.getPromotionBasedonBrandId(),promotionBrand.getPromotionBasedonBrandName(),promotionBrand.getPromotionBasedonBrandStartDate(),promotionBrand.getPromotionBasedonBrandEndDate(),promotionBrand.getPromotionBasedonBrandDetails(),promotionBrand.getPromotionBasedonBrandAmount(),promotionBrand.getBrandId());    
    }
    
     public PromotionBrandView getPromtionBrand(String promotionBasedonBrandId){
       
      PromotionBrand promotionBrand=promotionBrandRepository.findById(promotionBasedonBrandId);
          return new PromotionBrandView(promotionBrand.getPromotionBasedonBrandId(),promotionBrand.getPromotionBasedonBrandName(),promotionBrand.getPromotionBasedonBrandStartDate(),promotionBrand.getPromotionBasedonBrandEndDate(),promotionBrand.getPromotionBasedonBrandDetails(),promotionBrand.getPromotionBasedonBrandAmount(),promotionBrand.getBrandId());    

     
     }
     
      public PromotionBrandView putPromtionBrand(String promotionBasedonBrandId,PromotionBrandForm form){
         
           PromotionBrand promotionBranddb=promotionBrandRepository.findById(promotionBasedonBrandId);
           
        promotionBranddb.setPromotionBasedonBrandId(form.getPromotionBasedonBrandId());
        promotionBranddb.setPromotionBasedonBrandName(form.getPromotionBasedonBrandName());
        promotionBranddb.setPromotionBasedonBrandStartDate(form.getPromotionBasedonBrandStartDate());
        promotionBranddb.setPromotionBasedonBrandEndDate(form.getPromotionBasedonBrandEndDate());
        promotionBranddb.setPromotionBasedonBrandDetails(form.getPromotionBasedonBrandDetails());
        promotionBranddb.setPromotionBasedonBrandAmount(form.getPromotionBasedonBrandAmount());
        promotionBranddb.setBrandId(form.getBrandId());
        
        PromotionBrand promotionBrand=promotionBrandRepository.save(promotionBranddb);
        
           return new PromotionBrandView(promotionBrand.getPromotionBasedonBrandId(),promotionBrand.getPromotionBasedonBrandName(),promotionBrand.getPromotionBasedonBrandStartDate(),promotionBrand.getPromotionBasedonBrandEndDate(),promotionBrand.getPromotionBasedonBrandDetails(),promotionBrand.getPromotionBasedonBrandAmount(),promotionBrand.getBrandId());    

          
          
       }
      
       public PromotionBrandView deletePromtionBrand(String promotionBasedonBrandId){
           
            PromotionBrand promotionBrand=promotionBrandRepository.findById(promotionBasedonBrandId);
            promotionBrandRepository.delete(promotionBrand);
            
          return new PromotionBrandView(promotionBrand.getPromotionBasedonBrandId(),promotionBrand.getPromotionBasedonBrandName(),promotionBrand.getPromotionBasedonBrandStartDate(),promotionBrand.getPromotionBasedonBrandEndDate(),promotionBrand.getPromotionBasedonBrandDetails(),promotionBrand.getPromotionBasedonBrandAmount(),promotionBrand.getBrandId());    

       }
}
