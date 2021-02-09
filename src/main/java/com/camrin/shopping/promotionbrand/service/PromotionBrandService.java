/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.promotionbrand.service;

import com.camrin.shopping.promotionbrand.form.PromotionBrandForm;
import com.camrin.shopping.promotionbrand.view.PromotionBrandView;
/**
 *
 * @author HP
 */
public interface PromotionBrandService {
    
    public PromotionBrandView addPromtionBrand(PromotionBrandForm form);
    
     public PromotionBrandView getPromtionBrand(String promotionBasedonBrandId);
     
      public PromotionBrandView putPromtionBrand(String promotionBasedonBrandId,PromotionBrandForm form);
      
       public PromotionBrandView deletePromtionBrand(String promotionBasedonBrandId);
}
