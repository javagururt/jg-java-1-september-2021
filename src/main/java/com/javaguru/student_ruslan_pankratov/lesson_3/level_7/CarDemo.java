package com.javaguru.student_ruslan_pankratov.lesson_3.level_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Прежде чем вы сможете заехать на заправку, вы должны расстратить " +
                "весь свой бензин, числа пишутся не меньше 10-ти");
        car.start();
    }
}

