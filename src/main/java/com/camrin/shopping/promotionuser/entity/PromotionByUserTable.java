/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.promotionuser.entity;

import com.camrin.shopping.user.entity.User;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author HP
 */

@Entity
@Table(name="promotion_by_user_table")
public class PromotionByUserTable implements Serializable{
    
    
     @Id
    @Column(name="promotion_by_user_id")
    private String promotionByUserId;
    
     
         
    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "user_id")
    private User userId;
    
    
    
    @Column(name="promotion_id")
    private String promotionId;

    public PromotionByUserTable(String promotionByUserId, User userId, String promotionId) {
        this.promotionByUserId = promotionByUserId;
        this.userId = userId;
        this.promotionId = promotionId;
    }

    public PromotionByUserTable() {
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
