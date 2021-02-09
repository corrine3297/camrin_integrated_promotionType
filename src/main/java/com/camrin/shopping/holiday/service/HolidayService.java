/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.holiday.service;
import com.camrin.shopping.holiday.form.HolidayForm;
import com.camrin.shopping.holiday.view.HolidayView;

/**
 *
 * @author jndjk
 */
public interface HolidayService {
    public HolidayView addHoliday(HolidayForm form);

    public HolidayView getHoliday(String holidayId);
    
    public HolidayView putHoliday(String holidayId,HolidayForm form);
    
    public HolidayView deleteHoliday(String holidayId);
    
    
}
