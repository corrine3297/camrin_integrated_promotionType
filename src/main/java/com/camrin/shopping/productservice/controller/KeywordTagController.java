/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.controller;

import com.camrin.shopping.productservice.services.KeywordTagService;
import com.camrin.shopping.productservice.form.KeywordTagForm;
import com.camrin.shopping.productservice.view.KeywordTagView;
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
@RequestMapping("/keywordTags")
public class KeywordTagController {
    
    @Autowired
    KeywordTagService keywordTagService;
    
    @PostMapping("")
    public KeywordTagView addTag(@RequestBody KeywordTagForm form) {
        return keywordTagService.addKeywordTag(form);
    }
    
    @GetMapping("/{keywordTagId}")
    public KeywordTagView getKeywordTagById(@PathVariable String keywordTagId) {
        return keywordTagService.getKeywordTag(keywordTagId);
    }
    
    @PutMapping("/updateKWT/{keywordTagId}")
    public KeywordTagView putKeywordTagById(@RequestBody KeywordTagForm form, @PathVariable String keywordTagId) {
        return keywordTagService.putKeywordTag(form, keywordTagId);
    }
    
    @DeleteMapping("/deleteKWT/{keywordTagId}")
    public KeywordTagView deleteKeywordTagById(@RequestBody KeywordTagForm form, @PathVariable String keywordTagId) {
        return keywordTagService.deleteKeywordTag(form, keywordTagId);
    }
}
