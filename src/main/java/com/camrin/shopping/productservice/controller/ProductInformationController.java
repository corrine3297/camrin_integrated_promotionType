/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.controller;

import com.camrin.shopping.productservice.services.ProductInformationService;
import com.camrin.shopping.productservice.form.ProductInformationForm;
import com.camrin.shopping.productservice.view.ProductInformationView;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ANISH
 */
@RestController
@RequestMapping("/productInformation")
public class ProductInformationController {
    
    @Autowired
    ProductInformationService productInformationService;
    
    @PostMapping("")
    public ProductInformationView addProduct(@RequestBody ProductInformationForm form, 
            @RequestParam("image1") MultipartFile image1,
            @RequestParam("image2") MultipartFile image2,
            @RequestParam("image3") MultipartFile image3,
            @RequestParam("image4") MultipartFile image4) throws IOException{
        return productInformationService.addProductInformation(form,image1,image2,image3,image4);
    }
    
    @GetMapping("/{productInformationId}")
    public ProductInformationView getProductById(@RequestBody ProductInformationForm form,
            @PathVariable String productInformationId){
        return productInformationService.getProductInformation(productInformationId);
    }
    
    @PutMapping("/updateProduct/{productInformationId}")
    public ProductInformationView putProductById(@RequestBody ProductInformationForm form, 
            @PathVariable String productInformationId){
        return productInformationService.putProductInformation(form, productInformationId);
    }
    
    @DeleteMapping("/deleteProduct/{productInformationId}")
    public ProductInformationView deleteProductById(@RequestBody ProductInformationForm form,
            @PathVariable String productInformationId){
        return productInformationService.deleteProductInformation(form, productInformationId);
    }
}
