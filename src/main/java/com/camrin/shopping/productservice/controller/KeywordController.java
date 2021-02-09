/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.controller;

import com.camrin.shopping.productservice.services.KeywordService;
import com.camrin.shopping.productservice.form.KeywordForm;
import com.camrin.shopping.productservice.view.KeywordView;
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
@RequestMapping("/keywords")
public class KeywordController {
    
    @Autowired
    KeywordService keywordServices;
    
    @PostMapping("")
    public KeywordView addKeyword(@RequestBody KeywordForm form){
        return keywordServices.addKeywords(form);
    }
    
    @GetMapping("/{keywordId}")
    public KeywordView getKeywordById(@PathVariable String keywordId){
        return keywordServices.getKeywords(keywordId);
    }
    
    @PutMapping("/updateKeyword/{keywordId}")
    public KeywordView putKeywordById(@RequestBody KeywordForm form, @PathVariable String keywordId){
        return keywordServices.putKeywords(form, keywordId);
    }
    
    @DeleteMapping("/deleteKeyword/{keywordId}")
    public KeywordView deleteKeywordById(@RequestBody KeywordForm form, @PathVariable String keywordId){
        return keywordServices.deleteKeywords(form, keywordId);
    } 
}
