/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.repository;

import com.camrin.shopping.productservice.entity.KeywordCategoryTable;
import org.springframework.data.repository.Repository;

/**
 *
 * @author ANISH
 */
public interface KeywordCategoryRepository extends Repository<KeywordCategoryTable, String>{
    
    public KeywordCategoryTable save(KeywordCategoryTable keywordCategoryTable);
    
    public KeywordCategoryTable findById(String keywordCategoryId);
    
    public KeywordCategoryTable delete(KeywordCategoryTable keywordCategoryTable);
}
