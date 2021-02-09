/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.user.view;

/**
 *
 * @author HP
 */
public class UserView {
    private String userId;
    private String userFirstName;
    private String userMiddleName;
    private String userLastName;
    private String userEmailId;
    private String userPhoneNo;
    private String userGender;
    private String userUpdated;
    private String userDeleted;
    private String userUsername;
    private String userPassword;

    public UserView() {
    }

    public UserView(String userId, String userFirstName, String userMiddleName, String userLastName, String userEmailId, String userPhoneNo, String userGender, String userUpdated, String userDeleted, String userUsername, String userPassword) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userMiddleName = userMiddleName;
        this.userLastName = userLastName;
        this.userEmailId = userEmailId;
        this.userPhoneNo = userPhoneNo;
        this.userGender = userGender;
        this.userUpdated = userUpdated;
        this.userDeleted = userDeleted;
        this.userUsername = userUsername;
        this.userPassword = userPassword;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserMiddleName() {
        return userMiddleName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public String getUserPhoneNo() {
        return userPhoneNo;
    }

    public String getUserGender() {
        return userGender;
    }

    public String getUserUpdated() {
        return userUpdated;
    }

    public String getUserDeleted() {
        return userDeleted;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public void setUserMiddleName(String userMiddleName) {
        this.userMiddleName = userMiddleName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public void setUserPhoneNo(String userPhoneNo) {
        this.userPhoneNo = userPhoneNo;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public void setUserUpdated(String userUpdated) {
        this.userUpdated = userUpdated;
    }

    public void setUserDeleted(String userDeleted) {
        this.userDeleted = userDeleted;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    
    
}
