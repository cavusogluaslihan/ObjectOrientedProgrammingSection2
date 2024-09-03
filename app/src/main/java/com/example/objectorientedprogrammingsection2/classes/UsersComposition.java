package com.example.objectorientedprogrammingsection2.classes;

public class UsersComposition {

    private String username;
    private int phoneNumber;

    private AddressesComposition address;

    public UsersComposition() {
    }

    public UsersComposition(String username, int phoneNumber, AddressesComposition address) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AddressesComposition getAddress() {
        return address;
    }

    public void setAddress(AddressesComposition address) {
        this.address = address;
    }
}
