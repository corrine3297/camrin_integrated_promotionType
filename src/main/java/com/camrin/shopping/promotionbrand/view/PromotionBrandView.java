/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.promotionbrand.view;

import com.camrin.shopping.brand.entity.Brand;

/**
 *
 * @author HP
 */
public class PromotionBrandView {
    
    private String promotionBasedonBrandId;
  
      private String promotionBasedonBrandName;
      
      
      private String promotionBasedonBrandStartDate;
      
      
      private String promotionBasedonBrandEndDate;
      
      
      private String promotionBasedonBrandDetails;
      
      
      private String promotionBasedonBrandAmount;
      
      
      private Brand brandId;

    public PromotionBrandView() {
    }

    public PromotionBrandView(String promotionBasedonBrandId, String promotionBasedonBrandName, String promotionBasedonBrandStartDate, String promotionBasedonBrandEndDate, String promotionBasedonBrandDetails, String promotionBasedonBrandAmount, Brand brandId) {
        this.promotionBasedonBrandId = promotionBasedonBrandId;
        this.promotionBasedonBrandName = promotionBasedonBrandName;
        this.promotionBasedonBrandStartDate = promotionBasedonBrandStartDate;
        this.promotionBasedonBrandEndDate = promotionBasedonBrandEndDate;
        this.promotionBasedonBrandDetails = promotionBasedonBrandDetails;
        this.promotionBasedonBrandAmount = promotionBasedonBrandAmount;
        this.brandId = brandId;
    }

    public String getPromotionBasedonBrandId() {
        return promotionBasedonBrandId;
    }

    public String getPromotionBasedonBrandName() {
        return promotionBasedonBrandName;
    }

    public String getPromotionBasedonBrandStartDate() {
        return promotionBasedonBrandStartDate;
    }

    public String getPromotionBasedonBrandEndDate() {
        return promotionBasedonBrandEndDate;
    }

    public String getPromotionBasedonBrandDetails() {
        return promotionBasedonBrandDetails;
    }

    public String getPromotionBasedonBrandAmount() {
        return promotionBasedonBrandAmount;
    }

    public Brand getBrandId() {
        return brandId;
    }

    public void setPromotionBasedonBrandId(String promotionBasedonBrandId) {
        this.promotionBasedonBrandId = promotionBasedonBrandId;
    }

    public void setPromotionBasedonBrandName(String promotionBasedonBrandName) {
        this.promotionBasedonBrandName = promotionBasedonBrandName;
    }

    public void setPromotionBasedonBrandStartDate(String promotionBasedonBrandStartDate) {
        this.promotionBasedonBrandStartDate = promotionBasedonBrandStartDate;
    }

    public void setPromotionBasedonBrandEndDate(String promotionBasedonBrandEndDate) {
        this.promotionBasedonBrandEndDate = promotionBasedonBrandEndDate;
    }

    public void setPromotionBasedonBrandDetails(String promotionBasedonBrandDetails) {
        this.promotionBasedonBrandDetails = promotionBasedonBrandDetails;
    }

    public void setPromotionBasedonBrandAmount(String promotionBasedonBrandAmount) {
        this.promotionBasedonBrandAmount = promotionBasedonBrandAmount;
    }

    public void setBrandId(Brand brandId) {
        this.brandId = brandId;
    }
    
    

      
    
}
