package com.example.objectorientedprogrammingsection2.mainmethods;

import com.example.objectorientedprogrammingsection2.classes.MathCaseStudy;
import com.example.objectorientedprogrammingsection2.classes.Staff;

public class StaticMain {
    public static void main(String args[]){

     //   MathCaseStudy m = new MathCaseStudy();
    // m.sum(3,4);

        // eğer class static olursa şu şekilde daha kolay erişilebilir:

       int result = MathCaseStudy.sum(3,5);
       System.out.println(result);


        Staff s1 = new Staff("ali", 32);
        Staff s2 = new Staff("aynur", 26);
        Staff s3 = new Staff("sema", 35);
        Staff s4 = new Staff("yasin", 42);


        System.out.println(Staff.counter);
    }
}
