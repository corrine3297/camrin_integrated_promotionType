/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.inventoryproductcategory.repository;
import org.springframework.data.repository.Repository;
import com.camrin.shopping.inventoryproductcategory.entity.InventoryProductCategory;
/**
 *
 * @author jndjk
 */
public interface InventoryProductCategoryRepository  extends Repository<InventoryProductCategory,String>{

    public InventoryProductCategory save(InventoryProductCategory inventoryProductCategory);
    
    public InventoryProductCategory findById(String inventoryProductCategoryId);
    
    public InventoryProductCategory delete(InventoryProductCategory inventoryProductCategory);
    
}
