package com.efficacious.restaurantuserapp.Model;

import com.google.gson.annotations.SerializedName;

public class GetCustomer {
    @SerializedName("Register_Id")
    private Integer registerId;
    @SerializedName("First_Name")
    private String firstName;
    @SerializedName("Middle_Name")
    private String middleName;
    @SerializedName("Last_Name")
    private String lastName;
    @SerializedName("Email_Id")
    private String emailId;
    @SerializedName("Address_1")
    private String address1;
    @SerializedName("Address_2")
    private String address2;
    @SerializedName("Address_3")
    private String address3;
    @SerializedName("Mobile_No")
    private String mobileNo;

    public GetCustomer() {
    }

    public GetCustomer(Integer registerId, String firstName, String middleName, String lastName, String emailId, String address1, String address2, String address3, String mobileNo) {
        this.registerId = registerId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.mobileNo = mobileNo;
    }

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
