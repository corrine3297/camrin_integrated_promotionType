
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.inventory.repository;
import com.camrin.shopping.inventory.entity.InventoryProduct;

import org.springframework.data.repository.Repository;

/**
 *
 * @author jndjk
 */
public interface InventoryProductRepository extends Repository<InventoryProduct, String>{
    
    public InventoryProduct save(InventoryProduct inventoryproduct);
    
    public InventoryProduct findById(String inventoryproductId);
    
    public InventoryProduct delete(InventoryProduct inventoryproduct);
    
}
