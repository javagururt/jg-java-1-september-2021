package com.javaguru.student_mihails_mihejevs.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
       double area1 = circle1.calculateArea();
       System.out.println("Circle1 area is " + area1);
    }
}
