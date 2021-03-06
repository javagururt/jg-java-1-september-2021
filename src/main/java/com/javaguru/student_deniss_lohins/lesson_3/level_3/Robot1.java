package com.javaguru.student_deniss_lohins.lesson_3.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Robot1 {

    private String name;

    public Robot1(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + name);
    }
}
