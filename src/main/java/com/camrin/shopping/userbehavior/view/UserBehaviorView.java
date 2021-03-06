/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.userbehavior.view;

import com.camrin.shopping.user.entity.User;

/**
 *
 * @author HP
 */
public class UserBehaviorView {
 
    private String userBehaviorId;
    
   
    private String userBehaviorDescription;
    
 
   private String userBehaviorKeyword;
 
    private User userId;

    public UserBehaviorView() {
    }

    public UserBehaviorView(String userBehaviorId, String userBehaviorDescription, String userBehaviorKeyword, User userId) {
        this.userBehaviorId = userBehaviorId;
        this.userBehaviorDescription = userBehaviorDescription;
        this.userBehaviorKeyword = userBehaviorKeyword;
        this.userId = userId;
    }

    public String getUserBehaviorId() {
        return userBehaviorId;
    }

    public String getUserBehaviorDescription() {
        return userBehaviorDescription;
    }

    public String getUserBehaviorKeyword() {
        return userBehaviorKeyword;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserBehaviorId(String userBehaviorId) {
        this.userBehaviorId = userBehaviorId;
    }

    public void setUserBehaviorDescription(String userBehaviorDescription) {
        this.userBehaviorDescription = userBehaviorDescription;
    }

    public void setUserBehaviorKeyword(String userBehaviorKeyword) {
        this.userBehaviorKeyword = userBehaviorKeyword;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
    
    
    
}
