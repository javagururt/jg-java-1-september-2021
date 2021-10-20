package com.javaguru.student_dmitrii_faierberg.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI * radius * radius;
    }
}
