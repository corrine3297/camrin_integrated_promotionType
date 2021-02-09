/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.services;

import com.camrin.shopping.productservice.form.KeywordForm;
import com.camrin.shopping.productservice.view.KeywordView;
/**
 *
 * @author ANISH
 */
public interface KeywordService {
    
    public KeywordView addKeywords(KeywordForm form);
    
    public KeywordView getKeywords(String keywordId);
    
    public KeywordView putKeywords(KeywordForm form, String keywordId);
    
    public KeywordView deleteKeywords(KeywordForm form, String keywordId);
}
