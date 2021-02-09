/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.userbehavior.controller;


import com.camrin.shopping.userbehavior.view.UserBehaviorView;
import com.camrin.shopping.userbehavior.service.UserBehaviorService;
import com.camrin.shopping.userbehavior.form.UserBehaviorForm;



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
@RequestMapping("/userbehavior")
public class UserBehaviorController {
    
    
      @Autowired
      
      UserBehaviorService userBehaviorService;
       @PostMapping("")
       public UserBehaviorView addUserBehavior(@RequestBody UserBehaviorForm form)
       {
           return userBehaviorService.addUserBehavior(form);
       }
      
      @GetMapping("/{userBehaviorId}")
      public UserBehaviorView getUserBehaveById(@PathVariable String userBehaviorId)
      {
          return userBehaviorService.getUserBehavior(userBehaviorId);
      }
      

      @PutMapping("/update/{userBehaviorId}")
       public UserBehaviorView putUserBehaveById(@PathVariable String userBehaviorId,@RequestBody UserBehaviorForm form)
       {
           return userBehaviorService.putUserBehavior(userBehaviorId, form);
       }
       
       @DeleteMapping("/delete/{userBehaviorId}")
       public UserBehaviorView deleteUserBehaveById(@PathVariable String userBehaviorId){
        
           return userBehaviorService.deleteUserBehavior(userBehaviorId);
       }

    
    
    
    
}
