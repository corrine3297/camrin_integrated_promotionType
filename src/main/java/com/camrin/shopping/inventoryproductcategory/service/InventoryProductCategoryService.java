/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.inventoryproductcategory.service;
import com.camrin.shopping.inventoryproductcategory.form.InventoryProductCategoryForm;
import com.camrin.shopping.inventoryproductcategory.view.InventoryProductCategoryView;

/**
 *
 * @author jndjk
 */
public interface InventoryProductCategoryService {
    public InventoryProductCategoryView addInventoryProductCategory(InventoryProductCategoryForm form);

    public InventoryProductCategoryView getInventoryProductCategory(String inventoryProductCategoryId);
    
    public InventoryProductCategoryView putInventoryProductCategory(String inventoryProductCategoryId,InventoryProductCategoryForm form);
    
    public InventoryProductCategoryView deleteInventoryProductCategory(String inventoryProductCategoryId);
    
}
