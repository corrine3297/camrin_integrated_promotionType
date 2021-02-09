/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.services;

import com.camrin.shopping.productservice.form.KeywordTagForm;
import com.camrin.shopping.productservice.view.KeywordTagView;
/**
 *
 * @author ANISH
 */
public interface KeywordTagService {
    
    public KeywordTagView addKeywordTag(KeywordTagForm form);
    
    public KeywordTagView getKeywordTag(String keywordTagId);
    
    public KeywordTagView putKeywordTag(KeywordTagForm form, String keywordTagId);
    
    public KeywordTagView deleteKeywordTag(KeywordTagForm form, String keywordTagId);
}
