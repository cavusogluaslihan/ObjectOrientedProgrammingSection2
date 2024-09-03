package com.example.objectorientedprogrammingsection2.classes;

public class AddressesComposition {
    private String cityOfTheUser;
    private String provinceOfTheUser;

    public AddressesComposition() {
    }

    public AddressesComposition(String cityOfTheUser, String provinceOfTheUser) {
        this.cityOfTheUser = cityOfTheUser;
        this.provinceOfTheUser = provinceOfTheUser;
    }

    public String getCityOfTheUser() {
        return cityOfTheUser;
    }

    public void setCityOfTheUser(String cityOfTheUser) {
        this.cityOfTheUser = cityOfTheUser;
    }

    public String getProvinceOfTheUser() {
        return provinceOfTheUser;
    }

    public void setProvinceOfTheUser(String provinceOfTheUser) {
        this.provinceOfTheUser = provinceOfTheUser;
    }
}
