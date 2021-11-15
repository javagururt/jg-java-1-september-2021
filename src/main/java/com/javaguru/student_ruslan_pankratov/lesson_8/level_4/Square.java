package com.javaguru.student_ruslan_pankratov.lesson_8.level_4;

//Task_17
class Square extends Shape {
    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        double area = side * side;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = side * 4;
        return perimeter;

    }
}
