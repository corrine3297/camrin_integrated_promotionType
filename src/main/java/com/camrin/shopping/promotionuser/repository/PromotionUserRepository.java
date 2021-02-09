/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.promotionuser.repository;

import com.camrin.shopping.promotionuser.entity.PromotionByUserTable;

import org.springframework.data.repository.Repository;


/**
 *
 * @author HP
 */
public interface PromotionUserRepository extends Repository<PromotionByUserTable, String>{
    
    public PromotionByUserTable findById(String promotionByUserId);
    
    public PromotionByUserTable save(PromotionByUserTable promotionByUserTable);
    
    public PromotionByUserTable delete(PromotionByUserTable promotionByUserTable);
    
    
}
