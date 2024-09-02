package com.example.objectorientedprogrammingsection2.classes;

public class Staff {
    private String nameOfTheStaff;
    private int ageOfTheStaff;
    public static int counter;

    public Staff() {
        counter++;
    }

    public Staff(String nameOfTheStaff, int ageOfTheStaff) {
        counter++;
        this.nameOfTheStaff = nameOfTheStaff;
        this.ageOfTheStaff = ageOfTheStaff;
    }

    public String getNameOfTheStaff() {
        return nameOfTheStaff;
    }

    public void setNameOfTheStaff(String nameOfTheStaff) {
        this.nameOfTheStaff = nameOfTheStaff;
    }

    public int getAgeOfTheStaff() {
        return ageOfTheStaff;
    }

    public void setAgeOfTheStaff(int ageOfTheStaff) {
        this.ageOfTheStaff = ageOfTheStaff;
    }

}
