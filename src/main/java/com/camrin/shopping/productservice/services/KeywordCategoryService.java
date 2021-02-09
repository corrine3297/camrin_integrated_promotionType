/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.services;

import com.camrin.shopping.productservice.form.KeywordCategoryForm;
import com.camrin.shopping.productservice.view.KeywordCategoryView;
/**
 *
 * @author ANISH
 */
public interface KeywordCategoryService {
    
    public KeywordCategoryView addKeywordCategory(KeywordCategoryForm form);
    
    public KeywordCategoryView getKeywordCategory(String keywordCategoryId);
    
    public KeywordCategoryView putKeywordCategory(KeywordCategoryForm form, String keywordCategoryId);
    
    public KeywordCategoryView deleteKeywordCategory(KeywordCategoryForm form, String keywordCategoryId);
}
