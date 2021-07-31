package com.imorse.imorsedemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Company {
    @SerializedName("compony_name")
    @Expose
    private String componyName;
    @SerializedName("contact_no")
    @Expose
    private String contactNo;
    @SerializedName("email_id")
    @Expose
    private String emailId;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("advertising_banner")
    @Expose
    private String advertisingBanner;

    /**
     * No args constructor for use in serialization
     *
     */
    public Company() {
    }

    /**
     *
     * @param componyName
     * @param address
     * @param emailId
     * @param advertisingBanner
     * @param contactNo
     */
    public Company(String componyName, String contactNo, String emailId, String address, String advertisingBanner) {
        super();
        this.componyName = componyName;
        this.contactNo = contactNo;
        this.emailId = emailId;
        this.address = address;
        this.advertisingBanner = advertisingBanner;
    }

    public String getComponyName() {
        return componyName;
    }

    public void setComponyName(String componyName) {
        this.componyName = componyName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdvertisingBanner() {
        return advertisingBanner;
    }

    public void setAdvertisingBanner(String advertisingBanner) {
        this.advertisingBanner = advertisingBanner;
    }

}
