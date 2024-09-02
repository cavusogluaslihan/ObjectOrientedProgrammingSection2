package com.example.objectorientedprogrammingsection2.classes;

public class Students {

    private String studentName;
    private int studentId ;

    public void setStudentName(String studentName){
        this.studentName = studentName; // atama işlemi

    }

    public String getStudentName(){
        return this.studentName;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public int getStudentId(){
        return this.studentId;
    }

    public void info(){
        System.out.println("Student Name : "+studentName);
        System.out.println("Student ID   : "+ studentId);

    }

}
