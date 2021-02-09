/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.userbehavior.repository;

import org.springframework.data.repository.Repository;

import com.camrin.shopping.userbehavior.entity.UserBehaviorTable;
/**
 *
 * @author HP
 */
public interface UserBehaviorRepository extends Repository<UserBehaviorTable, String> {
    
  public UserBehaviorTable findById(String userBehaviorId);
  
  public UserBehaviorTable save(UserBehaviorTable userBehaviorTable);
  
  public UserBehaviorTable delete(UserBehaviorTable userBehaviorTable);
}
