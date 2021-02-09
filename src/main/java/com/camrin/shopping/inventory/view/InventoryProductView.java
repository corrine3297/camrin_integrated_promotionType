/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.inventory.view;
import com.camrin.shopping.brand.entity.Brand;
import com.camrin.shopping.holiday.entity.Holiday;
import com.camrin.shopping.inventoryproductcategory.entity.InventoryProductCategory;
import com.camrin.shopping.productservice.entity.KeywordTable;

/**
 *
 * @author jndjk
 */
public class InventoryProductView {
    private String inventoryProductId;
    private String inventoryProductName ;
    private String inventoryProductDescription;
    private String inventoryProductPrice ;
    private String inventoryProductSize ;
    private String inventoryProductColor;
   // private String inventoryProductHolidayId;
   // private String inventoryProductCategoryId;
    //private String inventoryProductBrandId ;
     private Brand inventoryProductBrandId ;
    private String inventoryProductQuantity ;
    //private String inventoryProductKeywordId ;
     private KeywordTable inventoryProductKeywordId ;
    private int inventoryProductDeleted ;
    private int inventoryProductUpdated ;
    
     
 private InventoryProductCategory inventoryProductCategoryId; 
    
     private Holiday inventoryProductHolidayId;
    

    public InventoryProductView() {
    }

    public InventoryProductCategory getInventoryProductCategoryId() {
        return inventoryProductCategoryId;
    }

    public void setInventoryProductCategoryId(InventoryProductCategory inventoryProductCategoryId) {
        this.inventoryProductCategoryId = inventoryProductCategoryId;
    }

    public Holiday getInventoryProductHolidayId() {
        return inventoryProductHolidayId;
    }

    public void setInventoryProductHolidayId(Holiday inventoryProductHolidayId) {
        this.inventoryProductHolidayId = inventoryProductHolidayId;
    }

   

    public String getInventoryProductId() {
        return inventoryProductId;
    }

    public String getInventoryProductName() {
        return inventoryProductName;
    }

    public String getInventoryProductDescription() {
        return inventoryProductDescription;
    }

    public String getInventoryProductPrice() {
        return inventoryProductPrice;
    }

    public String getInventoryProductSize() {
        return inventoryProductSize;
    }

    public String getInventoryProductColor() {
        return inventoryProductColor;
    }

    
   

    public String getInventoryProductQuantity() {
        return inventoryProductQuantity;
    }

    

    public int getInventoryProductDeleted() {
        return inventoryProductDeleted;
    }

    public int getInventoryProductUpdated() {
        return inventoryProductUpdated;
    }

    public void setInventoryProductId(String inventoryProductId) {
        this.inventoryProductId = inventoryProductId;
    }

    public void setInventoryProductName(String inventoryProductName) {
        this.inventoryProductName = inventoryProductName;
    }

    public void setInventoryProductDescription(String inventoryProductDescription) {
        this.inventoryProductDescription = inventoryProductDescription;
    }

    public void setInventoryProductPrice(String inventoryProductPrice) {
        this.inventoryProductPrice = inventoryProductPrice;
    }

    public void setInventoryProductSize(String inventoryProductSize) {
        this.inventoryProductSize = inventoryProductSize;
    }

    public void setInventoryProductColor(String inventoryProductColor) {
        this.inventoryProductColor = inventoryProductColor;
    }

    

    

    public void setInventoryProductQuantity(String inventoryProductQuantity) {
        this.inventoryProductQuantity = inventoryProductQuantity;
    }

    

    public void setInventoryProductDeleted(int inventoryProductDeleted) {
        this.inventoryProductDeleted = inventoryProductDeleted;
    }

    public void setInventoryProductUpdated(int inventoryProductUpdated) {
        this.inventoryProductUpdated = inventoryProductUpdated;
    }

    public Brand getInventoryProductBrandId() {
        return inventoryProductBrandId;
    }

    public void setInventoryProductBrandId(Brand inventoryProductBrandId) {
        this.inventoryProductBrandId = inventoryProductBrandId;
    }

    public KeywordTable getInventoryProductKeywordId() {
        return inventoryProductKeywordId;
    }

    public void setInventoryProductKeywordId(KeywordTable inventoryProductKeywordId) {
        this.inventoryProductKeywordId = inventoryProductKeywordId;
    }

    public InventoryProductView(String inventoryProductId, String inventoryProductName, String inventoryProductDescription, String inventoryProductPrice, String inventoryProductSize, String inventoryProductColor, Brand inventoryProductBrandId, String inventoryProductQuantity, KeywordTable inventoryProductKeywordId, int inventoryProductDeleted, int inventoryProductUpdated, InventoryProductCategory inventoryProductCategoryId, Holiday inventoryProductHolidayId) {
        this.inventoryProductId = inventoryProductId;
        this.inventoryProductName = inventoryProductName;
        this.inventoryProductDescription = inventoryProductDescription;
        this.inventoryProductPrice = inventoryProductPrice;
        this.inventoryProductSize = inventoryProductSize;
        this.inventoryProductColor = inventoryProductColor;
        this.inventoryProductBrandId = inventoryProductBrandId;
        this.inventoryProductQuantity = inventoryProductQuantity;
        this.inventoryProductKeywordId = inventoryProductKeywordId;
        this.inventoryProductDeleted = inventoryProductDeleted;
        this.inventoryProductUpdated = inventoryProductUpdated;
        this.inventoryProductCategoryId = inventoryProductCategoryId;
        this.inventoryProductHolidayId = inventoryProductHolidayId;
    }

   

  

  
  
    
    
}
