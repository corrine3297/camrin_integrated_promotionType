/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.brandcategory.controller;


import com.camrin.shopping.brandcategory.service.BrandCategoryService;
import com.camrin.shopping.brandcategory.form.BrandCategoryForm;
import com.camrin.shopping.brandcategory.view.BrandCategoryView;



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
@RequestMapping("/brandcategory")
public class BrandCategoryController {
    
        
    @Autowired
    BrandCategoryService brandCategoryService;
    
    
    
     @PostMapping("")
    public BrandCategoryView addBrandCategory(@RequestBody BrandCategoryForm form) {
        return brandCategoryService.addBrandCategoryValue(form);
    }
    
     @GetMapping("/{brandCategoryId}")
    public BrandCategoryView getBrandCategoryById(@PathVariable String brandCategoryId) {
        return brandCategoryService.getBrandCategoryValue(brandCategoryId);
    } 

    @PutMapping("/update/{brandCategoryId}")
    public BrandCategoryView putBrandCategoryById(@PathVariable String brandCategoryId, @RequestBody BrandCategoryForm form) {
        return brandCategoryService. putBrandCategoryValue(brandCategoryId,form);
    }
    
    @DeleteMapping("/delete/{brandCategoryId}")
    public BrandCategoryView deletePBrandCategoryId(@PathVariable String brandCategoryId) {
        return brandCategoryService.deleteBrandCategoryValue(brandCategoryId);
    }
    
    
}
