/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.services.implementation;

import com.camrin.shopping.productservice.services.KeywordService;
import com.camrin.shopping.productservice.form.KeywordForm;
import com.camrin.shopping.productservice.view.KeywordView;
import com.camrin.shopping.productservice.entity.KeywordTable;
import com.camrin.shopping.productservice.repository.KeywordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author ANISH
 */
@Service
public class KeywordServiceImple implements KeywordService {
    
    @Autowired
    KeywordRepository keywordRepository;
    
    @Override
    public KeywordView addKeywords(KeywordForm form){
        KeywordTable keywords = keywordRepository.save(new KeywordTable(form.getKeywordId(),form.getKeywords(),form.getKeywordCategoryId(),form.getKeywordTag()));
        return new KeywordView(keywords.getKeywordId(),keywords.getKeywords(),keywords.getKeywordCategoryId(),keywords.getKeywordTag());
    }
    
    @Override
    public KeywordView getKeywords(String keywordId){
        KeywordTable keywords = keywordRepository.findById(keywordId);
        return new KeywordView(keywords.getKeywordId(),keywords.getKeywords(),keywords.getKeywordCategoryId(),keywords.getKeywordTag());
    }
    
    @Override
    public KeywordView putKeywords(KeywordForm form,String KeywordId){
        KeywordTable keywordPut = keywordRepository.findById(KeywordId);
        keywordPut.setKeywordId(form.getKeywordId());
        keywordPut.setKeywords(form.getKeywords());
        keywordPut.setKeywordCategoryId(form.getKeywordCategoryId());
        keywordPut.setKeywordTag(form.getKeywordTag());
        KeywordTable keywords = keywordRepository.save(keywordPut);
        return new KeywordView(keywords.getKeywordId(),keywords.getKeywords(),keywords.getKeywordCategoryId(),keywords.getKeywordTag());
    }
    
    @Override
    public KeywordView deleteKeywords(KeywordForm form,String keywordId){
        KeywordTable keywords = keywordRepository.findById(keywordId);
        keywordRepository.delete(keywords);
        return new KeywordView(keywords.getKeywordId(),keywords.getKeywords(),keywords.getKeywordCategoryId(),keywords.getKeywordTag());
    }
}
