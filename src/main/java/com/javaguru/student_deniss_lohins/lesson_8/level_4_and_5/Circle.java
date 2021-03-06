package com.javaguru.student_deniss_lohins.lesson_8.level_4_and_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle extends Shape{
    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }

}
