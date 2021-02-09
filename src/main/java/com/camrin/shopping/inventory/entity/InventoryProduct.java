/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.inventory.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.camrin.shopping.holiday.entity.Holiday;
import com.camrin.shopping.inventoryproductcategory.entity.InventoryProductCategory;
import com.camrin.shopping.brand.entity.Brand;
import com.camrin.shopping.productservice.entity.KeywordTable;
import javax.persistence.Column;
/**
 *
 * @author jerald
 */
@Entity
@Table(name = "inventory_product_table")
public class InventoryProduct implements Serializable{
    @Id
    @Column(name="inventory_product_id")
   private String inventoryProductId;
    private String inventoryProductName ;
    private String inventoryProductDescription;
    private String inventoryProductPrice ;
    private String inventoryProductSize ;
    private String inventoryProductColor;
    
    @ManyToOne
    @JoinColumn(name = "inventory_product_holiday_id",referencedColumnName = "holiday_id")
    // @Column(name="inventory_product_holiday_id")
     private Holiday inventoryProductHolidayId;
    
     @ManyToOne
    @JoinColumn(name = "inventory_product_category_id",referencedColumnName = "inventory_product_category_id")
    // @Column(name="inventory_product_category_id")
     private InventoryProductCategory inventoryProductCategoryId; ;
     
    //private  String inventoryProductHolidayId;
    //private String inventoryProductCategoryId; 
     @ManyToOne
    @JoinColumn(name = "inventory_product_brand_id",referencedColumnName = "brand_id")
    private Brand inventoryProductBrandId ;
    private String inventoryProductQuantity ;
     @ManyToOne
    @JoinColumn(name = "inventory_product_keyword_id",referencedColumnName = "keyword_id")
    private KeywordTable inventoryProductKeywordId ;
    private int inventoryProductDeleted ;
    private int inventoryProductUpdated ;

    public InventoryProduct() {
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

    public InventoryProduct(String inventoryProductId, String inventoryProductName, String inventoryProductDescription, String inventoryProductPrice, String inventoryProductSize, String inventoryProductColor, Holiday inventoryProductHolidayId, InventoryProductCategory inventoryProductCategoryId, Brand inventoryProductBrandId, String inventoryProductQuantity, KeywordTable inventoryProductKeywordId, int inventoryProductDeleted, int inventoryProductUpdated) {
        this.inventoryProductId = inventoryProductId;
        this.inventoryProductName = inventoryProductName;
        this.inventoryProductDescription = inventoryProductDescription;
        this.inventoryProductPrice = inventoryProductPrice;
        this.inventoryProductSize = inventoryProductSize;
        this.inventoryProductColor = inventoryProductColor;
        this.inventoryProductHolidayId = inventoryProductHolidayId;
        this.inventoryProductCategoryId = inventoryProductCategoryId;
        this.inventoryProductBrandId = inventoryProductBrandId;
        this.inventoryProductQuantity = inventoryProductQuantity;
        this.inventoryProductKeywordId = inventoryProductKeywordId;
        this.inventoryProductDeleted = inventoryProductDeleted;
        this.inventoryProductUpdated = inventoryProductUpdated;
    }
    
    
    
    
    
    
    
    
    
    
    
}
