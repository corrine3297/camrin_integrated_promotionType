/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.stock.view;

import com.camrin.shopping.inventory.entity.InventoryProduct;

/**
 *
 * @author geoge
 */
public class StockView {
    private String stockId;
    private InventoryProduct inventoryProductId;
    private String stockProductQuantity;
    private String stockTotalAmount;
    
    public StockView(){
        
    }

    public InventoryProduct getInventoryProductId() {
        return inventoryProductId;
    }

    public void setInventoryProductId(InventoryProduct inventoryProductId) {
        this.inventoryProductId = inventoryProductId;
    }

    public StockView(String stockId, InventoryProduct inventoryProductId, String stockProductQuantity, String stockTotalAmount) {
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
