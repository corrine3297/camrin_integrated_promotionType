/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.services.implementation;

import com.camrin.shopping.productservice.entity.KeywordCategoryTable;
import com.camrin.shopping.productservice.form.KeywordCategoryForm;
import com.camrin.shopping.productservice.repository.KeywordCategoryRepository;
import com.camrin.shopping.productservice.services.KeywordCategoryService;
import com.camrin.shopping.productservice.view.KeywordCategoryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ANISH
 */
@Service
public class KeywordCategoryServiceImple implements KeywordCategoryService {
    
    @Autowired
    KeywordCategoryRepository keywordCategoryRepository;
    
    @Override
    public KeywordCategoryView addKeywordCategory(KeywordCategoryForm form){
        KeywordCategoryTable keywordCategoryTable = keywordCategoryRepository.save(new KeywordCategoryTable(form.getKeywordCategoryId(),form.getKeywordCategoryName(),form.getKeywordCategoryDescription()));
        return new KeywordCategoryView(keywordCategoryTable.getKeywordCategoryId(),keywordCategoryTable.getKeywordCategoryName(),keywordCategoryTable.getKeywordCategoryDescription());
    }
    
    @Override
    public KeywordCategoryView getKeywordCategory(String keywordCategoryId) {
        KeywordCategoryTable keywordCategory = keywordCategoryRepository.findById(keywordCategoryId);
        return new KeywordCategoryView(keywordCategory.getKeywordCategoryId(),keywordCategory.getKeywordCategoryName(),keywordCategory.getKeywordCategoryDescription());
    }
    
    @Override
    public KeywordCategoryView putKeywordCategory(KeywordCategoryForm form,String keywordCategoryId) {
        KeywordCategoryTable keywordCategoryPut = keywordCategoryRepository.findById(keywordCategoryId);
        keywordCategoryPut.setKeywordCategoryId(form.getKeywordCategoryId());
        keywordCategoryPut.setKeywordCategoryName(form.getKeywordCategoryName());
        keywordCategoryPut.setKeywordCategoryDescription(form.getKeywordCategoryDescription());
        KeywordCategoryTable keywordCategory = keywordCategoryRepository.save(keywordCategoryPut);
        return new KeywordCategoryView(keywordCategory.getKeywordCategoryId(),keywordCategory.getKeywordCategoryName(),keywordCategory.getKeywordCategoryDescription());
    }
    
    @Override
    public KeywordCategoryView deleteKeywordCategory(KeywordCategoryForm form, String keywordCategotyId) {
        KeywordCategoryTable keywordCategoryDelete = keywordCategoryRepository.findById(keywordCategotyId);
        keywordCategoryRepository.delete(keywordCategoryDelete);
        return new KeywordCategoryView(keywordCategoryDelete.getKeywordCategoryId(),keywordCategoryDelete.getKeywordCategoryName(),keywordCategoryDelete.getKeywordCategoryDescription());
    }
}
