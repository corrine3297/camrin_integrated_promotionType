/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.holiday.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.camrin.shopping.holiday.entity.Holiday;
import com.camrin.shopping.holiday.form.HolidayForm;
import com.camrin.shopping.holiday.repository.HolidayRepository;
import com.camrin.shopping.holiday.service.HolidayService;
import com.camrin.shopping.holiday.view.HolidayView;

/**
 *
 * @author jndjk
 */
@RestController
@RequestMapping("/holiday")
public class HolidayController {
    @Autowired
    HolidayService holidayservice;
    @PostMapping("")
    public HolidayView addHoliday(@RequestBody HolidayForm form) {
        return holidayservice.addHoliday(form);
    }
    
    @GetMapping("/{holidayId}")
    public HolidayView getHolidayById(@PathVariable String holidayId) {
        return holidayservice.getHoliday(holidayId);
    } 
    
    @DeleteMapping("/delete/{holidayId}")
    public HolidayView deleteHolidayById(@PathVariable String holidayId) {
        return holidayservice.deleteHoliday(holidayId);
    }
    
    @PutMapping("/update/{holidayId}")
    public HolidayView putHolidayById(@PathVariable String holidayId, @RequestBody HolidayForm form) {
        return holidayservice.putHoliday(holidayId, form);
    }
    
}
