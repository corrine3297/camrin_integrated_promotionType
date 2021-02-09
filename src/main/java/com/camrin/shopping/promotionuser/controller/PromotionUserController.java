/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.promotionuser.controller;

import com.camrin.shopping.promotionuser.form.PromotionUserForm;
import com.camrin.shopping.promotionuser.view.PromotionUserView;
import com.camrin.shopping.promotionuser.service.PromotionUserService;

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
@RequestMapping("/promotionUser")
public class PromotionUserController {
    
     @Autowired
     PromotionUserService promotionUserService;
     @PostMapping("")
     
     public PromotionUserView addPromotionUser(@RequestBody PromotionUserForm form){
     return promotionUserService.addPromotionForUser(form);
     }
     
     @GetMapping("/{promotionByUserId}")
     public PromotionUserView getPromotionUserById(@PathVariable String promotionByUserId){
         return promotionUserService.getPromotionForUser(promotionByUserId);
         
         
     }
     
     @PutMapping("/update/{promotionByUserId}")
     public PromotionUserView putPromotionUserById(@PathVariable String promotionByUserId,@RequestBody PromotionUserForm form){
         return promotionUserService.putPromotionForUser(promotionByUserId, form);
         
     }
     
     
     @DeleteMapping("/delete/{promotionByUserId}")
     public PromotionUserView deletePromotionUserById(@PathVariable String promotionByUserId){
         return promotionUserService.deletePromotionForUser(promotionByUserId);
     }

}
