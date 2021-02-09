/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.brand.controller;

import com.camrin.shopping.brand.form.BrandForm;
import com.camrin.shopping.brand.view.BrandView;
import com.camrin.shopping.brand.service.BrandTableService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/brand")
public class brandController {
    
    
    @Autowired
    BrandTableService brandTableService;
    
    @PostMapping("")
    public BrandView addBrand(@RequestBody BrandForm form) {
        return brandTableService.addBrand(form);
    }
    @GetMapping("/{brandId}")
    public BrandView getBrandById(@PathVariable String brandId) {
        return brandTableService.getBrand(brandId);
    } 
    
    @PutMapping("/update/{brandId}")
    public BrandView putBrandById(@PathVariable String brandId, @RequestBody BrandForm form) {
        return brandTableService.putBrand(brandId,form);
    }
    
    @DeleteMapping("/delete/{brandId}")
    public BrandView deleteBrandById(@PathVariable String brandId) {
        return brandTableService.deleteBrand(brandId);
    }
    
}
