package com.javaguru.student_rodions_sokolovs.lesson_8.level_4_5;

public class Rectangle extends Shape {

    private double firstside;
    private double secondside;

    public Rectangle(String name, double firstside, double secondside) {
        super(name);
        this.firstside = firstside;
        this.secondside = secondside;

    }

    public double calculateArea() {
        double area = firstside * secondside;
        return area;
    }

    public double calculatePerimeter() {
        double perimetr = 2 * (firstside + secondside);
        return perimetr;

    }
}

