/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ANISH
 */
@Entity
@Table(name = "product_information_table")
public class ProductInformationTable implements Serializable{
    
    @Id
    @Column(name = "product_information_id")
    private String productInformationId;
    
    //@ManyToOne
    //@JoinColumn(name = "inventory_product_id")
    @Column(name = "inventory_product_id")
    private String inventoryProductId;
    
    @Column(name = "product_information_image1")
    private String productInformationImage1;
    
    @Column(name = "product_information_image2")
    private String productInformationImage2;
    
    @Column(name = "product_information_image3")
    private String productInformationImage3;
    
    @Column(name = "product_information_image4")
    private String productInformationImage4;
    
    @Column(name = "product_seller_mrp")
    private String productSellerMrp;
    
    @Column(name = "promotion_brand_id")
    private String promotionBrandId;
    
    @ManyToOne
    @JoinColumn(name = "keyword_tag")
    private KeywordTagTable keywordTag;

    public ProductInformationTable(String productInformationId, String inventoryProductId, String productInformationImage1, String productInformationImage2, String productInformationImage3, String productInformationImage4, String productSellerMrp, String promotionBrandId, KeywordTagTable keywordTag) {
        this.productInformationId = productInformationId;
        this.inventoryProductId = inventoryProductId;
        this.productInformationImage1 = productInformationImage1;
        this.productInformationImage2 = productInformationImage2;
        this.productInformationImage3 = productInformationImage3;
        this.productInformationImage4 = productInformationImage4;
        this.productSellerMrp = productSellerMrp;
        this.promotionBrandId = promotionBrandId;
        this.keywordTag = keywordTag;
    }

    public ProductInformationTable() {
    }

    public String getProductInformationId() {
        return productInformationId;
    }

    public void setProductInformationId(String productInformationId) {
        this.productInformationId = productInformationId;
    }

    public String getInventoryProductId() {
        return inventoryProductId;
    }

    public void setInventoryProductId(String inventoryProductId) {
        this.inventoryProductId = inventoryProductId;
    }

    public String getProductInformationImage1() {
        return productInformationImage1;
    }

    public void setProductInformationImage1(String productInformationImage1) {
        this.productInformationImage1 = productInformationImage1;
    }

    public String getProductInformationImage2() {
        return productInformationImage2;
    }

    public void setProductInformationImage2(String productInformationImage2) {
        this.productInformationImage2 = productInformationImage2;
    }

    public String getProductInformationImage3() {
        return productInformationImage3;
    }

    public void setProductInformationImage3(String productInformationImage3) {
        this.productInformationImage3 = productInformationImage3;
    }

    public String getProductInformationImage4() {
        return productInformationImage4;
    }

    public void setProductInformationImage4(String productInformationImage4) {
        this.productInformationImage4 = productInformationImage4;
    }

    public String getProductSellerMrp() {
        return productSellerMrp;
    }

    public void setProductSellerMrp(String productSellerMrp) {
        this.productSellerMrp = productSellerMrp;
    }

    public String getPromotionBrandId() {
        return promotionBrandId;
    }

    public void setPromotionBrandId(String promotionBrandId) {
        this.promotionBrandId = promotionBrandId;
    }

    public KeywordTagTable getKeywordTag() {
        return keywordTag;
    }

    public void setKeywordTag(KeywordTagTable keywordTag) {
        this.keywordTag = keywordTag;
    }
    
    
}
