/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.inventory.service;
import com.camrin.shopping.inventory.view.InventoryProductView;
import com.camrin.shopping.inventory.form.InventoryProductForm;

/**
 *
 * @author jndjk
 */
public interface InventoryProductService {
    
     public InventoryProductView addInventoryProduct(InventoryProductForm form);

    public InventoryProductView getInventoryProduct(String inventoryproductId);
    
    public InventoryProductView putInventoryProduct(String inventoryproductId,InventoryProductForm form);
    
    public InventoryProductView deleteInventoryProduct(String inventoryproductId);
    
}
