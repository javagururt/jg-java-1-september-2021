package com.javaguru.student_jekaterina_ola.lesson_8.level_4_junior;

//Реализуйте в нём абстрактные методы из класса
//        Shape: calculateArea() и calculatePerimeter().

public class Circle extends Shape {

    private double radius;
    Circle(String title, double radius) {
        super(title);
        this.radius = radius;

    }

    double calculateArea() {return Math.PI * radius * radius; }
    double calculatePerimeter() { return 2 * Math.PI *  radius; }
}
