package com.javaguru.student_deniss_lohins.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(25.98896);
        circle.CalculateArea();
        circle.showProperties();
    }
}
