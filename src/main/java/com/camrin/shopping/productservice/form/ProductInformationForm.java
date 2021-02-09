/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.form;

import com.camrin.shopping.productservice.entity.InventoryProductTable;
import com.camrin.shopping.productservice.entity.KeywordTagTable;

/**
 *
 * @author ANISH
 */
public class ProductInformationForm {
    
    private String productInformationId;
    private String inventoryProductId;
    private String productInformationImage1;
    private String productInformationImage2;
    private String productInformationImage3;
    private String productInformationImage4;
    private String productSellerMrp;
    private String promotionBrandId;
    private KeywordTagTable keywordTag;

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
