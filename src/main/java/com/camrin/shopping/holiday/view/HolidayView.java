/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.holiday.view;

/**
 *
 * @author jndjk
 */
public class HolidayView {
    private String holidayId; 
    private String holidayName ;
    private String holidayDescription ;
    private String holidayDate ;
    private String holidaySeason ;
    private String holidayDeleted ;
    private String holidayUpdated ;

    public HolidayView(String holidayId, String holidayName, String holidayDescription, String holidayDate, String holidaySeason, String holidayDeleted, String holidayUpdated) {
        this.holidayId = holidayId;
        this.holidayName = holidayName;
        this.holidayDescription = holidayDescription;
        this.holidayDate = holidayDate;
        this.holidaySeason = holidaySeason;
        this.holidayDeleted = holidayDeleted;
        this.holidayUpdated = holidayUpdated;
    }

    public HolidayView() {
    }

    public String getHolidayId() {
        return holidayId;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public String getHolidayDescription() {
        return holidayDescription;
    }

    public String getHolidayDate() {
        return holidayDate;
    }

    public String getHolidaySeason() {
        return holidaySeason;
    }

    public String getHolidayDeleted() {
        return holidayDeleted;
    }

    public String getHolidayUpdated() {
        return holidayUpdated;
    }

    public void setHolidayId(String holidayId) {
        this.holidayId = holidayId;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public void setHolidayDescription(String holidayDescription) {
        this.holidayDescription = holidayDescription;
    }

    public void setHolidayDate(String holidayDate) {
        this.holidayDate = holidayDate;
    }

    public void setHolidaySeason(String holidaySeason) {
        this.holidaySeason = holidaySeason;
    }

    public void setHolidayDeleted(String holidayDeleted) {
        this.holidayDeleted = holidayDeleted;
    }

    public void setHolidayUpdated(String holidayUpdated) {
        this.holidayUpdated = holidayUpdated;
    }
    
}
