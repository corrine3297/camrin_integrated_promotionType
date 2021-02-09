/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.brand.repository;

import com.camrin.shopping.brand.entity.Brand;

import org.springframework.data.repository.Repository;
/**
 *
 * @author HP
 */
public interface BrandRepository extends Repository<Brand, String>{
    
    public Brand findById(String brandId);
    
     public Brand save(Brand brand);
     
     public Brand delete(Brand brand);

}
