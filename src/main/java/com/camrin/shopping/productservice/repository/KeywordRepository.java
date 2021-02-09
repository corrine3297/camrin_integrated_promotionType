/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.repository;

import com.camrin.shopping.productservice.entity.KeywordTable;
import org.springframework.data.repository.Repository;

/**
 *
 * @author ANISH
 */
public interface KeywordRepository extends Repository<KeywordTable, String>{
    
    public KeywordTable save(KeywordTable keywordTable);
    
    public KeywordTable findById(String keywordId);
    
    public KeywordTable delete(KeywordTable keywordTable);
}
