/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.promotionuser.service.implementation;

import com.camrin.shopping.promotionuser.entity.PromotionByUserTable;
import com.camrin.shopping.promotionuser.form.PromotionUserForm;
import com.camrin.shopping.promotionuser.view.PromotionUserView;
import com.camrin.shopping.promotionuser.repository.PromotionUserRepository;
import com.camrin.shopping.promotionuser.service.PromotionUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class PromotionUserServiceImpl implements PromotionUserService {
      @Autowired
      PromotionUserRepository promotionUserRepository;
    
    @Override  
    public PromotionUserView addPromotionForUser(PromotionUserForm form){
        
        PromotionByUserTable promotionByUserTable = promotionUserRepository.save(new PromotionByUserTable(form.getPromotionByUserId(),form.getUserId(),form.getPromotionId()) );
        
        return new PromotionUserView(promotionByUserTable.getPromotionByUserId(),promotionByUserTable.getUserId(),promotionByUserTable.getPromotionId());
    }
    
    
    @Override
    public PromotionUserView getPromotionForUser(String promotionByUserId){
    
        
        PromotionByUserTable promotionByUserTable=promotionUserRepository.findById(promotionByUserId);
        return new PromotionUserView(promotionByUserTable.getPromotionByUserId(),promotionByUserTable.getUserId(),promotionByUserTable.getPromotionId());
     
    
    }
    
    
    
    @Override
    public PromotionUserView putPromotionForUser(String promotionByUserId,PromotionUserForm form){
        
        PromotionByUserTable promotionByUserTabledb = promotionUserRepository.findById(promotionByUserId);
        
        promotionByUserTabledb.setPromotionByUserId(form.getPromotionByUserId());
        promotionByUserTabledb.setUserId(form.getUserId());
        promotionByUserTabledb.setPromotionId(form.getPromotionId());
        
        
        PromotionByUserTable promotionByUserTable=promotionUserRepository.save(promotionByUserTabledb);
        return new PromotionUserView(promotionByUserTable.getPromotionByUserId(),promotionByUserTable.getUserId(),promotionByUserTable.getPromotionId());

        
    }
    
    
    @Override
    public PromotionUserView deletePromotionForUser(String promotionByUserId){
        
        
        PromotionByUserTable promotionByUserTable=promotionUserRepository.findById(promotionByUserId);
        promotionUserRepository.delete(promotionByUserTable);
        return new PromotionUserView(promotionByUserTable.getPromotionByUserId(),promotionByUserTable.getUserId(),promotionByUserTable.getPromotionId());

        
    }
    
    
}
