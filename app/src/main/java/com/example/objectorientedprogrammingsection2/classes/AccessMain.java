package com.example.objectorientedprogrammingsection2.classes;

public class AccessMain {
    public static void main(String args[]){
        Students s1 = new Students();

        s1.setStudentName("Ali");
        s1.setStudentId(1215312);
        //s1.info();
        System.out.println(s1.getStudentName());

        int id = s1.getStudentId();
        System.out.println(id);


        Products p = new Products("Tv", 30);

        System.out.println(p.getProductName());
        System.out.println(p.getProductStock());

    }
}
