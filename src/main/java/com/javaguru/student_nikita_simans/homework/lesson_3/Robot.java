package com.javaguru.student_nikita_simans.homework.lesson_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot {
    private String name;
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
    public Robot(String robotName) {
        this.name = robotName;
    }
}
