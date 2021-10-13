package com.javaguru.student_deniss_lohins.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Baloon {
    private double volume;
    private double mass;
    private String colour;


    public Baloon(double volume, double mass, String colour) {
        this.volume = volume;
        this.mass = mass;
        this.colour = colour;
    }

    void properties() {
        System.out.println("Baloon volume is: " + volume + " cubic centimeters");
        System.out.println("Baloon mass is: " + mass + " grams");
        System.out.println("Baloon colour is: " + colour);
    }
}
