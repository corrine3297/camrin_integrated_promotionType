/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.promotionbrand.repository;

import org.springframework.data.repository.Repository;

import com.camrin.shopping.promotionbrand.entity.PromotionBrand;
/**
 *
 * @author HP
 */


public interface PromotionBrandRepository  extends Repository<PromotionBrand, String>{
    
    
    public PromotionBrand findById(String promotionBasedonBrandId);
    
     public PromotionBrand save(PromotionBrand promotionBrand);
     
     public PromotionBrand delete(PromotionBrand promotionBrand);
            
  
}
