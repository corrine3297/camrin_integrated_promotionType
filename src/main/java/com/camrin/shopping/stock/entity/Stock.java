/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.stock.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.camrin.shopping.inventory.entity.InventoryProduct;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 *
 * @author geoge
 */
@Entity
@Table(name="stock_table")
public class Stock implements Serializable{
   @Id
    private String stockId;
    //private String inventoryProductId;
   @ManyToOne
    @JoinColumn(name = "inventory_product_id",referencedColumnName = "inventory_product_id")
   private InventoryProduct inventoryProductId;
    private String stockProductQuantity;
    private String stockTotalAmount;
    
    public Stock(){
        
    }

    public InventoryProduct getInventoryProductId() {
        return inventoryProductId;
    }

    public void setInventoryProductId(InventoryProduct inventoryProductId) {
        this.inventoryProductId = inventoryProductId;
    }

    public Stock(String stockId, InventoryProduct inventoryProductId, String stockProductQuantity, String stockTotalAmount) {
        this.stockId = stockId;
        this.inventoryProductId = inventoryProductId;
        this.stockProductQuantity = stockProductQuantity;
        this.stockTotalAmount = stockTotalAmount;
    }

    

    public String getStockId() {
        return stockId;
    }

   

    public String getStockProductQuantity() {
        return stockProductQuantity;
    }

    public String getStockTotalAmount() {
        return stockTotalAmount;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    

    public void setStockProductQuantity(String stockProductQuantity) {
        this.stockProductQuantity = stockProductQuantity;
    }

    public void setStockTotalAmount(String stockTotalAmount) {
        this.stockTotalAmount = stockTotalAmount;
    }
    
    
   
}
