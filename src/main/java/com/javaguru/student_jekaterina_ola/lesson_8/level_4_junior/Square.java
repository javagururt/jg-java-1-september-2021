package com.javaguru.student_jekaterina_ola.lesson_8.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Square extends Shape {
    double side;

    Square(String title, double side){
        super (title);
        this.side = side;
    }

    double calculateArea() { return 4 * side; }
    double calculatePerimeter() { return side * side; }
}
