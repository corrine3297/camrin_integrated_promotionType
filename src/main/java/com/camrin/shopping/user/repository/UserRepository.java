/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.user.repository;

import com.camrin.shopping.user.entity.User;

import org.springframework.data.repository.Repository;

/**
 *
 * @author HP
 */
public interface UserRepository extends Repository<User, String>{
    
    public User findById(String userId);
    
    public User save(User user);
    
    public User delete(User user);    
    
    
    
}
