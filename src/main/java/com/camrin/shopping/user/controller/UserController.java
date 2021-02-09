/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.user.controller;

import com.camrin.shopping.user.form.UserForm;
import com.camrin.shopping.user.service.UserService;
import com.camrin.shopping.user.view.UserView;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author HP
 */

@RestController
@RequestMapping("/user")
public class UserController {
    
    
    
     @Autowired
     UserService userService;
    @PostMapping("")
    public UserView addUser(@RequestBody UserForm form)
    {
        return userService.adduser(form);
    }
    @GetMapping("/{userId}")
    public UserView getUserById(@PathVariable String userId){
    
        return userService.getUser(userId);
    }
    @PutMapping("/update/{userId}")
    public UserView putUserById(@PathVariable String userId,@RequestBody UserForm form){
    
    return userService.putUser(userId, form);
    }

    
    @DeleteMapping("/delete/{userId}")
    public UserView deleteUserById(@PathVariable String userId){
    
    return userService.deleteUser(userId);
    }  
    
    
    
}
