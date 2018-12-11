package com.wazn.ui.model;

public class AddUserRequest {

    private String userName;
    private String password;
    private String fullName;
    private String businessUnit;
    private Integer role;
    private String phoneNumber;
    private String address;
    private String email;

    public AddUserRequest() {
    }

    public AddUserRequest(String userName, String password, String fullName, String businessUnit, Integer role, String phoneNumber, String address, String email) {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.businessUnit = businessUnit;
        this.role = role;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
