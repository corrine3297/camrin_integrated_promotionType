/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.inventoryproductcategory.service.implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.camrin.shopping.inventoryproductcategory.controller.InventoryProductCategoryController;
import com.camrin.shopping.inventoryproductcategory.entity.InventoryProductCategory;
import com.camrin.shopping.inventoryproductcategory.form.InventoryProductCategoryForm;
import com.camrin.shopping.inventoryproductcategory.repository.InventoryProductCategoryRepository;
import com.camrin.shopping.inventoryproductcategory.service.InventoryProductCategoryService;
import com.camrin.shopping.inventoryproductcategory.view.InventoryProductCategoryView;
/**
 *
 * @author jndjk
 */
@Service
public class InventoryProductCategoryServiceImple implements InventoryProductCategoryService{
    @Autowired
    InventoryProductCategoryRepository inventoryProductCategoryRepository;
    
    
    @Override
    public InventoryProductCategoryView addInventoryProductCategory(InventoryProductCategoryForm form)
    {
         InventoryProductCategory inventoryProductCategory = inventoryProductCategoryRepository.save(new InventoryProductCategory(form.getInventory_product_category_id(),form.getInventory_product_category_name(),form.getInventory_product_category_description(),form.getInventory_product_category_deleted(),form.getInventory_product_category_updated()));
        return new InventoryProductCategoryView(inventoryProductCategory.getInventory_product_category_id(),inventoryProductCategory.getInventory_product_category_name(),inventoryProductCategory.getInventory_product_category_description(),inventoryProductCategory.getInventory_product_category_deleted(),inventoryProductCategory.getInventory_product_category_updated());
    }
    
    @Override
     public InventoryProductCategoryView getInventoryProductCategory(String inventoryProductCategoryId)
     {
          InventoryProductCategory inventoryProductCategory = inventoryProductCategoryRepository.findById(inventoryProductCategoryId);
        return new InventoryProductCategoryView(inventoryProductCategory.getInventory_product_category_id(),inventoryProductCategory.getInventory_product_category_name(),inventoryProductCategory.getInventory_product_category_description(),inventoryProductCategory.getInventory_product_category_deleted(),inventoryProductCategory.getInventory_product_category_updated());
     }
      @Override
    public InventoryProductCategoryView deleteInventoryProductCategory(String inventoryProductCategoryId) {
        InventoryProductCategory inventoryProductCategory = inventoryProductCategoryRepository.findById(inventoryProductCategoryId);
       inventoryProductCategoryRepository.delete(inventoryProductCategory);
        return new InventoryProductCategoryView(inventoryProductCategory.getInventory_product_category_id(),inventoryProductCategory.getInventory_product_category_name(),inventoryProductCategory.getInventory_product_category_description(),inventoryProductCategory.getInventory_product_category_deleted(),inventoryProductCategory.getInventory_product_category_updated());
    }
    
    @Override
    public InventoryProductCategoryView putInventoryProductCategory(String inventoryProductCategoryId,InventoryProductCategoryForm form) {
        InventoryProductCategory inventoryProductCategorydb = inventoryProductCategoryRepository.findById(inventoryProductCategoryId);
        inventoryProductCategorydb.setInventory_product_category_id(form.getInventory_product_category_id());
        inventoryProductCategorydb.setInventory_product_category_name(form.getInventory_product_category_name());
        inventoryProductCategorydb.setInventory_product_category_description(form.getInventory_product_category_description());
        inventoryProductCategorydb.setInventory_product_category_deleted(form.getInventory_product_category_deleted());
        inventoryProductCategorydb.setInventory_product_category_updated(form.getInventory_product_category_updated());
        
       
        InventoryProductCategory inventoryProductCategory = inventoryProductCategoryRepository.save(inventoryProductCategorydb);
        inventoryProductCategory = inventoryProductCategoryRepository.findById(inventoryProductCategoryId);
         return new InventoryProductCategoryView(inventoryProductCategory.getInventory_product_category_id(),inventoryProductCategory.getInventory_product_category_name(),inventoryProductCategory.getInventory_product_category_description(),inventoryProductCategory.getInventory_product_category_deleted(),inventoryProductCategory.getInventory_product_category_updated());
    }
    
    
    
}


