/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.holiday.service.implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.camrin.shopping.holiday.controller.HolidayController;
import com.camrin.shopping.holiday.entity.Holiday;
import com.camrin.shopping.holiday.form.HolidayForm;
import com.camrin.shopping.holiday.repository.HolidayRepository;
import com.camrin.shopping.holiday.service.HolidayService;
import com.camrin.shopping.holiday.view.HolidayView;

/**
 *
 * @author jndjk
 */
@Service
public class HolidayServiceImple implements HolidayService {
    @Autowired
    HolidayRepository holidayrepository;
    
    
    @Override
    public HolidayView addHoliday(HolidayForm form)
    {
         Holiday holiday = holidayrepository.save(new Holiday(form.getHolidayId(),form.getHolidayName(),form.getHolidayDescription(),form.getHolidayDate(),form.getHolidaySeason(),form.getHolidayDeleted(),form.getHolidayUpdated()));
        return new HolidayView(holiday.getHolidayId(),holiday.getHolidayName(),holiday.getHolidayDescription(),holiday.getHolidayDate(),holiday.getHolidaySeason(),holiday.getHolidayDeleted(),holiday.getHolidayUpdated());
    }
    
    @Override
     public HolidayView getHoliday(String holidayId){
       Holiday holiday  = holidayrepository.findById(holidayId);
       return new HolidayView(holiday.getHolidayId(),holiday.getHolidayName(),holiday.getHolidayDescription(),holiday.getHolidayDate(),holiday.getHolidaySeason(),holiday.getHolidayDeleted(),holiday.getHolidayUpdated());
     
     }
   
     
    @Override
    public HolidayView deleteHoliday(String holidayId){
    
        Holiday holiday  = holidayrepository.findById(holidayId);
        holidayrepository.delete(holiday);
        return new HolidayView(holiday.getHolidayId(),holiday.getHolidayName(),holiday.getHolidayDescription(),holiday.getHolidayDate(),holiday.getHolidaySeason(),holiday.getHolidayDeleted(),holiday.getHolidayUpdated());
        
    
    
    }
    
    @Override
    public HolidayView putHoliday(String holidayId,HolidayForm form) {
        Holiday holidaydb  = holidayrepository.findById(holidayId);
        holidaydb.setHolidayId(form.getHolidayId());
        holidaydb.setHolidayName(form.getHolidayName());
        holidaydb.setHolidayDescription(form.getHolidayDescription());
        holidaydb.setHolidayDate(form.getHolidayDate());
        holidaydb.setHolidaySeason(form.getHolidaySeason());
        holidaydb.setHolidayDeleted(form.getHolidayDeleted());
        holidaydb.setHolidayUpdated(form.getHolidayUpdated());
        Holiday holiday = holidayrepository.save(holidaydb);
        holiday =  holidayrepository.findById(holidayId);
         return new HolidayView(holiday.getHolidayId(),holiday.getHolidayName(),holiday.getHolidayDescription(),holiday.getHolidayDate(),holiday.getHolidaySeason(),holiday.getHolidayDeleted(),holiday.getHolidayUpdated());
    }
    
    
}
