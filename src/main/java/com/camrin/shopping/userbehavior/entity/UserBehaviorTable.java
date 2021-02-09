/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.userbehavior.entity;


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
@Table(name="user_behavior_table")
public class UserBehaviorTable implements Serializable {
    
    @Id
    @Column(name = "user_behavior_id")
    private String userBehaviorId;
    
    @Column(name = "user_behavior_description")
    private String userBehaviorDescription;
    
    
    @Column(name = "user_behavior_keyword")
   private String userBehaviorKeyword;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    public UserBehaviorTable(String userBehaviorId, String userBehaviorDescription, String userBehaviorKeyword, User userId) {
        this.userBehaviorId = userBehaviorId;
        this.userBehaviorDescription = userBehaviorDescription;
        this.userBehaviorKeyword = userBehaviorKeyword;
        this.userId = userId;
    }

    public UserBehaviorTable() {
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
