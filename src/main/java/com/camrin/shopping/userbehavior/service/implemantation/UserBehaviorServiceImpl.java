/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.userbehavior.service.implemantation;

import com.camrin.shopping.userbehavior.form.UserBehaviorForm;
import com.camrin.shopping.userbehavior.view.UserBehaviorView;

import com.camrin.shopping.userbehavior.entity.UserBehaviorTable;
import com.camrin.shopping.userbehavior.repository.UserBehaviorRepository;
import com.camrin.shopping.userbehavior.service.UserBehaviorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */

@Service
public class UserBehaviorServiceImpl implements UserBehaviorService{
    
       @Autowired
       UserBehaviorRepository userBehaviorRepository;
    
       @Override
    public UserBehaviorView addUserBehavior(UserBehaviorForm form)
    {
        UserBehaviorTable userBehaviorTable = userBehaviorRepository.save(new UserBehaviorTable(form.getUserBehaviorId(),form.getUserBehaviorDescription(),form.getUserBehaviorKeyword(),form.getUserId()));
        
        return new UserBehaviorView(userBehaviorTable.getUserBehaviorId(),userBehaviorTable.getUserBehaviorDescription(),userBehaviorTable.getUserBehaviorKeyword(),userBehaviorTable.getUserId());
    }
    @Override
    public UserBehaviorView getUserBehavior(String userBehaviorId){
        
            UserBehaviorTable userBehaviorTable=userBehaviorRepository.findById(userBehaviorId);
            return new UserBehaviorView(userBehaviorTable.getUserBehaviorId(),userBehaviorTable.getUserBehaviorDescription(),userBehaviorTable.getUserBehaviorKeyword(),userBehaviorTable.getUserId());

    }
    
    
    @Override
    public UserBehaviorView putUserBehavior(String userBehaviorId,UserBehaviorForm form){
        UserBehaviorTable userBehaviorTabledb =userBehaviorRepository.findById(userBehaviorId);
        userBehaviorTabledb.setUserBehaviorId(form.getUserBehaviorId());
        userBehaviorTabledb.setUserBehaviorDescription(form.getUserBehaviorDescription());
        userBehaviorTabledb.setUserBehaviorKeyword(form.getUserBehaviorKeyword());
        userBehaviorTabledb.setUserId(form.getUserId());
                
                
           UserBehaviorTable userBehaviorTable=userBehaviorRepository.save(userBehaviorTabledb);
        return new UserBehaviorView(userBehaviorTable.getUserBehaviorId(),userBehaviorTable.getUserBehaviorDescription(),userBehaviorTable.getUserBehaviorKeyword(),userBehaviorTable.getUserId());
       
                
    }
    
    
    @Override
    public UserBehaviorView deleteUserBehavior(String userBehaviorId){
    
       UserBehaviorTable userBehaviorTable=userBehaviorRepository.findById(userBehaviorId);
       
        userBehaviorRepository.delete(userBehaviorTable);
        return new UserBehaviorView(userBehaviorTable.getUserBehaviorId(),userBehaviorTable.getUserBehaviorDescription(),userBehaviorTable.getUserBehaviorKeyword(),userBehaviorTable.getUserId());

    }
}
