/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.user.service.implemantation;

import com.camrin.shopping.user.form.UserForm;
import com.camrin.shopping.user.view.UserView;

import com.camrin.shopping.user.entity.User;
import com.camrin.shopping.user.repository.UserRepository;
import com.camrin.shopping.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserRepository userRepository;
     
    @Override
    public UserView adduser(UserForm form){
    
        User user=userRepository.save(new User(form.getUserId(),form.getUserFirstName(),form.getUserMiddleName(),form.getUserLastName(),form.getUserEmailId(),form.getUserPhoneNo(),form.getUserGender(),form.getUserUpdated(),form.getUserDeleted(),form.getUserUsername(),form.getUserPassword()));
    
        return new UserView(user.getUserId(),user.getUserFirstName(),user.getUserMiddleName(),user.getUserLastName(),user.getUserEmailId(),user.getUserPhoneNo(),user.getUserGender(),user.getUserUpdated(),user.getUserDeleted(),user.getUserUsername(),user.getUserPassword());
    
    }
    
    public UserView getUser(String userId){
    
    User user=userRepository.findById(userId);
    return new UserView(user.getUserId(),user.getUserFirstName(),user.getUserMiddleName(),user.getUserLastName(),user.getUserEmailId(),user.getUserPhoneNo(),user.getUserGender(),user.getUserUpdated(),user.getUserDeleted(),user.getUserUsername(),user.getUserPassword());

    }
            
    public UserView putUser(String userId,UserForm form){
    
        User userdb=userRepository.findById(userId);
        userdb.setUserId(form.getUserId());
        userdb.setUserFirstName(form.getUserFirstName());
        userdb.setUserMiddleName(form.getUserMiddleName());
        userdb.setUserLastName(form.getUserLastName());
        userdb.setUserEmailId(form.getUserEmailId());
        userdb.setUserPhoneNo(form.getUserPhoneNo());
        userdb.setUserGender(form.getUserGender());
        userdb.setUserUpdated(form.getUserUpdated());
        userdb.setUserDeleted(form.getUserDeleted());
        userdb.setUserUsername(form.getUserUsername());
        userdb.setUserPassword(form.getUserPassword());
        User user=userRepository.save(userdb);
            return new UserView(user.getUserId(),user.getUserFirstName(),user.getUserMiddleName(),user.getUserLastName(),user.getUserEmailId(),user.getUserPhoneNo(),user.getUserGender(),user.getUserUpdated(),user.getUserDeleted(),user.getUserUsername(),user.getUserPassword());

    }
            
            
    public UserView deleteUser(String userId){
    
    User user=userRepository.findById(userId);
    userRepository.delete(user);
    return new UserView(user.getUserId(),user.getUserFirstName(),user.getUserMiddleName(),user.getUserLastName(),user.getUserEmailId(),user.getUserPhoneNo(),user.getUserGender(),user.getUserUpdated(),user.getUserDeleted(),user.getUserUsername(),user.getUserPassword());

    }
    
}
