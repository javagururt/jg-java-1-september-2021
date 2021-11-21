package com.javaguru.student_ruslan_pankratov.lesson_8.level_4;

import com.javaguru.teacher.codereview.CodeReview;

//Task_19
@CodeReview(approved = true)
class Triangle extends Shape{
    double side;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
       double area = side * side / 2;
       return area;

    }

    @Override
    double calculatePerimeter() {
        double perimeter = side * 3;
        return perimeter;
    }
}
