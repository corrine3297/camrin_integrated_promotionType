/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.inventory.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.camrin.shopping.inventory.service.InventoryProductService;
import com.camrin.shopping.inventory.view.InventoryProductView;
import com.camrin.shopping.inventory.form.InventoryProductForm;
/**
 *
 * @author jndjk
 */
@RestController
@RequestMapping("/inventoryproducts")
public class InventoryProductController {
    @Autowired
    InventoryProductService inventoryProductService;
    
     @PostMapping("")
    public InventoryProductView addProduct(@RequestBody InventoryProductForm form) {
        return inventoryProductService.addInventoryProduct(form);
    }
    
    @GetMapping("/{inventoryProductId}")
    public InventoryProductView getProductById(@PathVariable String inventoryProductId) {
        return inventoryProductService.getInventoryProduct(inventoryProductId);
    } 
    
     @DeleteMapping("/delete/{inventoryProductId}")
    public InventoryProductView deleteInventoryProductById(@PathVariable String inventoryProductId) {
        return inventoryProductService.deleteInventoryProduct(inventoryProductId);
    }
     @PutMapping("/update/{inventoryProductId}")
    public InventoryProductView putInventoryProductById(@PathVariable String inventoryProductId, @RequestBody InventoryProductForm form) {
        return inventoryProductService.putInventoryProduct(inventoryProductId, form);
    }
    
    
}
