/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.promotionbrand.entity;


import com.camrin.shopping.brand.entity.Brand;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name="promotion_basedon_brand_table")
public class PromotionBrand implements Serializable {
    
    
      @Id
    
      @Column(name="promotion_basedon_brand_id")
      private String promotionBasedonBrandId;
      
      
      @Column(name="promotion_basedon_brand_name")
      private String promotionBasedonBrandName;
      
      
      @Column(name="promotion_basedon_brand_start_date")
      private String promotionBasedonBrandStartDate;
      
      
      @Column(name="promotion_basedon_brand_end_date")
      private String promotionBasedonBrandEndDate;
      
      
      @Column(name="promotion_basedon_brand_details")
      private String promotionBasedonBrandDetails;
      
      
      @Column(name="promotion_basedon_brand_amount")
      private String promotionBasedonBrandAmount;
      
      
    @ManyToOne
    @JoinColumn(name="brand_id")
      private Brand brandId;

    public PromotionBrand(String promotionBasedonBrandId, String promotionBasedonBrandName, String promotionBasedonBrandStartDate, String promotionBasedonBrandEndDate, String promotionBasedonBrandDetails, String promotionBasedonBrandAmount, Brand brandId) {
        this.promotionBasedonBrandId = promotionBasedonBrandId;
        this.promotionBasedonBrandName = promotionBasedonBrandName;
        this.promotionBasedonBrandStartDate = promotionBasedonBrandStartDate;
        this.promotionBasedonBrandEndDate = promotionBasedonBrandEndDate;
        this.promotionBasedonBrandDetails = promotionBasedonBrandDetails;
        this.promotionBasedonBrandAmount = promotionBasedonBrandAmount;
        this.brandId = brandId;
    }

    public PromotionBrand() {
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
