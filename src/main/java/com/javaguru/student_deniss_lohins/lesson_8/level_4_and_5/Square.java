package com.javaguru.student_deniss_lohins.lesson_8.level_4_and_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Square extends Shape{
    double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }
}
