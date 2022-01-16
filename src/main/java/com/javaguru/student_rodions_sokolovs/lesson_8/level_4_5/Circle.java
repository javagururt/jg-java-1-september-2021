package com.javaguru.student_rodions_sokolovs.lesson_8.level_4_5;

public class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double calculateArea() {
        return (Math.PI * radius * radius);
    }

    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }

}