/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.promotionuser.service;

import com.camrin.shopping.promotionuser.form.PromotionUserForm;

import com.camrin.shopping.promotionuser.view.PromotionUserView;

/**
 *
 * @author HP
 */
public interface PromotionUserService {
    
    public PromotionUserView addPromotionForUser(PromotionUserForm form);
    
    public PromotionUserView getPromotionForUser(String promotionByUserId);
    
    public PromotionUserView putPromotionForUser(String promotionByUserId,PromotionUserForm form);
    
    public PromotionUserView deletePromotionForUser(String promotionByUserId);
    
    
    
    
    
    
    

}
