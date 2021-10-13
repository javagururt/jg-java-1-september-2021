package com.javaguru.student_deniss_lohins.lesson_3.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Citroen", "Yellow", 15, 3000);
        car.properties();
    }
}
