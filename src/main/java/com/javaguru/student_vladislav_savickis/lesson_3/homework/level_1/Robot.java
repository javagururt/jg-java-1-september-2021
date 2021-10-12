package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Robot {
    private String name;
    public void sayHallo() {
        System.out.println("Hello!");
    }
    public Robot(String robotName) {
        this.name = robotName;
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
