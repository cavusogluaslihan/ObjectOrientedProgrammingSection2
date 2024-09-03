package com.example.objectorientedprogrammingsection2.mainmethods;

import com.example.objectorientedprogrammingsection2.classes.AddressesComposition;
import com.example.objectorientedprogrammingsection2.classes.UsersComposition;

public class CompositionMain {
    public static void main (String args[]){
        AddressesComposition addres = new AddressesComposition("ANKARA","CANKAYA");
        UsersComposition user = new UsersComposition("Asli",31246462,addres);

        System.out.println("Username     : " +user.getUsername());
        System.out.println("Phone Number : " +user.getPhoneNumber());
        System.out.println("City         : "+user.getAddress().getCityOfTheUser());
        System.out.println("Province     : "+ user.getAddress().getProvinceOfTheUser());


    }
}
