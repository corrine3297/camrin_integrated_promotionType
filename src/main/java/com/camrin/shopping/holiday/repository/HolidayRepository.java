/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.holiday.repository;
import org.springframework.data.repository.Repository;
import com.camrin.shopping.holiday.entity.Holiday;
/**
 *
 * @author jndjk
 */
public interface HolidayRepository extends Repository<Holiday, String> {

 public Holiday save(Holiday holiday);
    
    public Holiday findById(String holidayId);
    
    public Holiday delete(Holiday holiday);
        
}
