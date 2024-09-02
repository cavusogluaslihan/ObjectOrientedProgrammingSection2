package com.example.objectorientedprogrammingsection2.classes.Finals;

public class ColoursExample {
    public static final int WHITE = 255255255;
    public static final int BLACK = 000 ;
    public static final int RED = 25500;

    public void paint (int selectedColour){
        if (selectedColour == 255255255) {
            System.out.println("It has been painted white.");
        }
        if (selectedColour == 000) {
            System.out.println("It has been painted black.");
        }
        if (selectedColour == 25500) {
            System.out.println("It has been painted red.");
        }
    }

}
