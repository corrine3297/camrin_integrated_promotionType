/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.promotionuser.view;

import com.camrin.shopping.user.entity.User;

/**
 *
 * @author HP
 */
public class PromotionUserView {
    
    private String promotionByUserId;
    private User userId;
    private String promotionId;

    public PromotionUserView() {
    }

    public PromotionUserView(String promotionByUserId, User userId, String promotionId) {
        this.promotionByUserId = promotionByUserId;
        this.userId = userId;
        this.promotionId = promotionId;
    }

    public String getPromotionByUserId() {
        return promotionByUserId;
    }

    public User getUserId() {
        return userId;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionByUserId(String promotionByUserId) {
        this.promotionByUserId = promotionByUserId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }
    
    
    

    
}
