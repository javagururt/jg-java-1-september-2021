package com.javaguru.student_rodions_sokolovs.lesson_8.level_4_5;

public class Triangle extends Shape {

    private double firstside;

    public Triangle(String name, double firstside) {
        super(name);
        this.firstside = firstside;
    }

    public double calculateArea() {
        double area = (firstside * firstside) / 2;
        return area;
    }

    public double calculatePerimeter() {
        double perimetr = firstside * 3;
        return perimetr;

    }
}