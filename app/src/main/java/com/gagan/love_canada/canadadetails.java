package com.gagan.love_canada;

import java.io.Serializable;

public class canadadetails implements Serializable {
    private int placeid;
    private String placename;
    private String address;
    private String city;
    private String province;
    private String description;

public canadadetails(){

}
    public canadadetails(int placeid, String placename, String address, String city, String province, String description) {
        this.placeid = placeid;
        this.placename = placename;
        this.address = address;
        this.city = city;
        this.province = province;
        this.description = description;
    }

    public int getplaceid() {
        return placeid;
    }

    public void setplaceid(int placeid) {
        this.placeid = placeid;
    }

    public String getplacename() {
        return placename;
    }

    public void setplacename(String placename) {
        this.placename = placename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
