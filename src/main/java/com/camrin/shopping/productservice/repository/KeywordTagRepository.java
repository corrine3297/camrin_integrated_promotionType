/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.repository;

import com.camrin.shopping.productservice.entity.KeywordTagTable;
import org.springframework.data.repository.Repository;

/**
 *
 * @author ANISH
 */
public interface KeywordTagRepository extends Repository<KeywordTagTable, String>{
    
    public KeywordTagTable save(KeywordTagTable keywordTagTable);
    
    public KeywordTagTable findById(String keywordTagId);
    
    public KeywordTagTable delete(KeywordTagTable keywordTagTable);
}
