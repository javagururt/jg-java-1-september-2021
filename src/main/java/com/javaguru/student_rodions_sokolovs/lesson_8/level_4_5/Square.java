package com.javaguru.student_rodions_sokolovs.lesson_8.level_4_5;

public class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    public double calculateArea() {
        double area = side * side;
        return area;
    }

    public double calculatePerimeter() {
        double perimetr = side * 4;
        return perimetr;

    }
}
