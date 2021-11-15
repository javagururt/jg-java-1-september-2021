package com.javaguru.student_ruslan_pankratov.lesson_8.level_4;

class Rectangle extends Shape {
    private double sideOne;
    private double sideTwo;

    public Rectangle(String title, double sideOne, double sideTwo) {
        super(title);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    double calculateArea() {
        double area = sideOne * sideTwo;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = (sideOne * 2) + (sideTwo * 2);
        return perimeter;
    }
}
