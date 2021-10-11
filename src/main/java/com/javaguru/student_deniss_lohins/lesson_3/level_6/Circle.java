package com.javaguru.student_deniss_lohins.lesson_3.level_6;

import static java.lang.Math.PI;

public class Circle {

    private double radius;
    private double calculatedArea;
    private double pi;

    public Circle(double radius){
        this.radius = radius;

    }
    void CalculateArea(){
        pi = PI;
        calculatedArea = pi * radius * radius;
    }
    void showProperties(){
        System.out.println("Circle area is " + calculatedArea);
    }
}
