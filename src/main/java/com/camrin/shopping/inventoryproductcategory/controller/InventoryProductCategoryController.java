/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.inventoryproductcategory.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.camrin.shopping.inventoryproductcategory.service.InventoryProductCategoryService;
import com.camrin.shopping.inventoryproductcategory.form.InventoryProductCategoryForm;
import com.camrin.shopping.inventoryproductcategory.view.InventoryProductCategoryView;

/**
 *
 * @author jndjk
 */
@RestController
@RequestMapping("/inventoryproductcategory")
public class InventoryProductCategoryController {
     @Autowired
    InventoryProductCategoryService inventoryProductCategoryService;
    
     @PostMapping("")
    public InventoryProductCategoryView addInventoryProductCategory(@RequestBody InventoryProductCategoryForm form) {
        return inventoryProductCategoryService.addInventoryProductCategory(form);
    }
    
    @GetMapping("/{inventoryProductCategoryId}")
    public InventoryProductCategoryView getInventoryProductCategoryById(@PathVariable String inventoryProductCategoryId) {
        return inventoryProductCategoryService.getInventoryProductCategory(inventoryProductCategoryId);
    } 
    
     @DeleteMapping("/delete/{inventoryProductCategoryId}")
    public InventoryProductCategoryView deleteInventoryProductCategoryById(@PathVariable String inventoryProductCategoryId) {
        return inventoryProductCategoryService.deleteInventoryProductCategory(inventoryProductCategoryId);
    }
    
    @PutMapping("/update/{inventoryProductCategoryId}")
    public InventoryProductCategoryView putInventoryProductCategoryById(@PathVariable String inventoryProductCategoryId, @RequestBody InventoryProductCategoryForm form) {
        return inventoryProductCategoryService.putInventoryProductCategory(inventoryProductCategoryId, form);
    }
    
}
