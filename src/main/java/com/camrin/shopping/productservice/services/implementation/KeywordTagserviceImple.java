/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.services.implementation;

import com.camrin.shopping.productservice.services.KeywordTagService;
import com.camrin.shopping.productservice.entity.KeywordTagTable;
import com.camrin.shopping.productservice.form.KeywordTagForm;
import com.camrin.shopping.productservice.view.KeywordTagView;
import com.camrin.shopping.productservice.repository.KeywordTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ANISH
 */
@Service
public class KeywordTagserviceImple implements KeywordTagService{
    
    @Autowired
    KeywordTagRepository keywordTagRepository;
    
    @Override
    public KeywordTagView addKeywordTag(KeywordTagForm form) {
        KeywordTagTable keywordTag = keywordTagRepository.save(new KeywordTagTable(form.getKeywordTagId(),form.getKeywordTagName()));
        return new KeywordTagView(keywordTag.getKeywordTagId(),keywordTag.getKeywordTagName());
    }
    
    @Override
    public KeywordTagView getKeywordTag(String keywordTagId) {
        KeywordTagTable keywordTag = keywordTagRepository.findById(keywordTagId);
        return new KeywordTagView(keywordTag.getKeywordTagId(),keywordTag.getKeywordTagName());
    }
    
    @Override
    public KeywordTagView putKeywordTag(KeywordTagForm form,String keywordTagId) {
        KeywordTagTable keywordTagPut = keywordTagRepository.findById(keywordTagId);
        keywordTagPut.setKeywordTagId(form.getKeywordTagId());
        keywordTagPut.setKeywordTagName(form.getKeywordTagName());
        KeywordTagTable keywordTag = keywordTagRepository.save(keywordTagPut);
        return new KeywordTagView(keywordTag.getKeywordTagId(),keywordTag.getKeywordTagName());
    }
    
    @Override
    public KeywordTagView deleteKeywordTag(KeywordTagForm form,String keywordtagId) {
        KeywordTagTable keywordtag = keywordTagRepository.findById(keywordtagId);
        keywordTagRepository.delete(keywordtag);
        return new KeywordTagView(keywordtag.getKeywordTagId(),keywordtag.getKeywordTagName());
    }
}
