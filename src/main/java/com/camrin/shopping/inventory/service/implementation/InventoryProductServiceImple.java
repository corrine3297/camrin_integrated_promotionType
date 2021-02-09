/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.inventory.service.implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.camrin.shopping.inventory.entity.InventoryProduct;
import com.camrin.shopping.inventory.form.InventoryProductForm;
import com.camrin.shopping.inventory.repository.InventoryProductRepository;
import com.camrin.shopping.inventory.service.InventoryProductService;
import com.camrin.shopping.inventory.view.InventoryProductView;

/**
 *
 * @author jndjk
 */
@Service
public class InventoryProductServiceImple implements InventoryProductService {
    @Autowired
    InventoryProductRepository inventoryProductRepository;
    
    @Override
    public InventoryProductView addInventoryProduct(InventoryProductForm form)
    {
         InventoryProduct inventoryProduct = inventoryProductRepository.save(new InventoryProduct(form.getInventoryProductId(),form.getInventoryProductName(),form.getInventoryProductDescription(),form.getInventoryProductPrice(),form.getInventoryProductSize(),form.getInventoryProductColor(),form.getInventoryProductHolidayId(),form.getInventoryProductCategoryId(),form.getInventoryProductBrandId(),form.getInventoryProductQuantity(),form.getInventoryProductKeywordId(),form.getInventoryProductDeleted(),form.getInventoryProductUpdated()));
        return new InventoryProductView(inventoryProduct.getInventoryProductId()
                ,inventoryProduct.getInventoryProductName(),inventoryProduct.getInventoryProductDescription(),
                inventoryProduct.getInventoryProductPrice(),inventoryProduct.getInventoryProductSize(),
                inventoryProduct.getInventoryProductColor(),inventoryProduct.getInventoryProductBrandId(),
                inventoryProduct.getInventoryProductQuantity(),inventoryProduct.getInventoryProductKeywordId(),
                inventoryProduct.getInventoryProductDeleted(),inventoryProduct.getInventoryProductUpdated(),inventoryProduct.getInventoryProductCategoryId(),inventoryProduct.getInventoryProductHolidayId());
    }
    
    @Override
     public InventoryProductView getInventoryProduct(String inventoryproductId)
     {
          InventoryProduct inventoryProduct = inventoryProductRepository.findById(inventoryproductId);
        return new InventoryProductView(inventoryProduct.getInventoryProductId()
                ,inventoryProduct.getInventoryProductName(),inventoryProduct.getInventoryProductDescription(),
                inventoryProduct.getInventoryProductPrice(),inventoryProduct.getInventoryProductSize(),
                inventoryProduct.getInventoryProductColor(),
               inventoryProduct.getInventoryProductBrandId(),
                inventoryProduct.getInventoryProductQuantity(),inventoryProduct.getInventoryProductKeywordId(),
                inventoryProduct.getInventoryProductDeleted(),inventoryProduct.getInventoryProductUpdated(),inventoryProduct.getInventoryProductCategoryId(),inventoryProduct.getInventoryProductHolidayId());
     }
      @Override
    public InventoryProductView deleteInventoryProduct(String inventoryproductId) {
        InventoryProduct inventoryProduct = inventoryProductRepository.findById(inventoryproductId);
       inventoryProductRepository.delete(inventoryProduct);
       return new InventoryProductView(inventoryProduct.getInventoryProductId()
                ,inventoryProduct.getInventoryProductName(),inventoryProduct.getInventoryProductDescription(),
                inventoryProduct.getInventoryProductPrice(),inventoryProduct.getInventoryProductSize(),
                inventoryProduct.getInventoryProductColor(),
               inventoryProduct.getInventoryProductBrandId(),
                inventoryProduct.getInventoryProductQuantity(),inventoryProduct.getInventoryProductKeywordId(),
                inventoryProduct.getInventoryProductDeleted(),inventoryProduct.getInventoryProductUpdated(),inventoryProduct.getInventoryProductCategoryId(),inventoryProduct.getInventoryProductHolidayId());
    }
    
    @Override
    public InventoryProductView putInventoryProduct(String inventoryproductId,InventoryProductForm form) {
        InventoryProduct inventoryProductdb = inventoryProductRepository.findById(inventoryproductId);
        inventoryProductdb.setInventoryProductId(form.getInventoryProductId());
        inventoryProductdb.setInventoryProductName(form.getInventoryProductName());
        inventoryProductdb.setInventoryProductDescription(form.getInventoryProductDescription());
        inventoryProductdb.setInventoryProductPrice(form.getInventoryProductPrice());
        inventoryProductdb.setInventoryProductSize(form.getInventoryProductSize());
        inventoryProductdb.setInventoryProductColor(form.getInventoryProductColor());
        inventoryProductdb.setInventoryProductHolidayId(form.getInventoryProductHolidayId());
        inventoryProductdb.setInventoryProductCategoryId(form.getInventoryProductCategoryId());
        inventoryProductdb.setInventoryProductBrandId(form.getInventoryProductBrandId());
        inventoryProductdb.setInventoryProductQuantity(form.getInventoryProductQuantity());
        inventoryProductdb.setInventoryProductKeywordId(form.getInventoryProductKeywordId());
        inventoryProductdb.setInventoryProductDeleted(form.getInventoryProductDeleted());
        inventoryProductdb.setInventoryProductUpdated(form.getInventoryProductUpdated());
       
       
        InventoryProduct inventoryProduct = inventoryProductRepository.save(inventoryProductdb);
        inventoryProduct = inventoryProductRepository.findById(inventoryproductId);
       return new InventoryProductView(inventoryProduct.getInventoryProductId()
                ,inventoryProduct.getInventoryProductName(),inventoryProduct.getInventoryProductDescription(),
                inventoryProduct.getInventoryProductPrice(),inventoryProduct.getInventoryProductSize(),
                inventoryProduct.getInventoryProductColor(),
               inventoryProduct.getInventoryProductBrandId(),
                inventoryProduct.getInventoryProductQuantity(),inventoryProduct.getInventoryProductKeywordId(),
                inventoryProduct.getInventoryProductDeleted(),inventoryProduct.getInventoryProductUpdated(),inventoryProduct.getInventoryProductCategoryId(),inventoryProduct.getInventoryProductHolidayId());
    }
    
}
