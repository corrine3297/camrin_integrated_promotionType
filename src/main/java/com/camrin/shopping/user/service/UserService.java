/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.user.service;

import com.camrin.shopping.user.view.UserView;
import com.camrin.shopping.user.form.UserForm;

/**
 *
 * @author HP
 */
public interface UserService {
    
    public UserView adduser(UserForm form);
    
    public UserView getUser(String userId);
            
    public UserView putUser(String userId,UserForm form);
            
            
    public UserView deleteUser(String userId);

}
