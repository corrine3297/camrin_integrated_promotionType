/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.controller;

import com.camrin.shopping.productservice.form.KeywordCategoryForm;
import com.camrin.shopping.productservice.view.KeywordCategoryView;
import com.camrin.shopping.productservice.services.KeywordCategoryService;
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
 * @author ANISH
 */

@RestController
@RequestMapping("/keywordCategory")
public class KeywordCategoryController {
    
    @Autowired
    KeywordCategoryService keywordCategoryService;
    
    @PostMapping("")
    public KeywordCategoryView addCategory(@RequestBody KeywordCategoryForm form){
        return keywordCategoryService.addKeywordCategory(form);
    }
    
    @GetMapping("/{keywordCategoryId}")
    public KeywordCategoryView getKeywordCategoryById(@PathVariable String keywordCategoryId) {
        return keywordCategoryService.getKeywordCategory(keywordCategoryId);
    }
    
    @PutMapping("/updateKWC/{keywordCategoryId}")
    public KeywordCategoryView putKeywordCategoryById(@RequestBody KeywordCategoryForm form, @PathVariable String keywordCategoryId){
        return keywordCategoryService.putKeywordCategory(form,keywordCategoryId);
    }
    
    @DeleteMapping("/deleteKWC/{keywordCategoryid}")
    public KeywordCategoryView deleteKeywordCategoryById(@RequestBody KeywordCategoryForm form, @PathVariable String keywordCategoryId) {
        return keywordCategoryService.deleteKeywordCategory(form,keywordCategoryId);
    }
    
}
