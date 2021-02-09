/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.userbehavior.service;

import com.camrin.shopping.userbehavior.view.UserBehaviorView;
import com.camrin.shopping.userbehavior.form.UserBehaviorForm;
/**
 *
 * @author HP
 */
public interface UserBehaviorService {
    
    public UserBehaviorView addUserBehavior(UserBehaviorForm form);
    
    public UserBehaviorView getUserBehavior(String userBehaviorId);
    
    public UserBehaviorView putUserBehavior(String userBehaviorId,UserBehaviorForm form);

    public UserBehaviorView deleteUserBehavior(String userBehaviorId);
           
}
