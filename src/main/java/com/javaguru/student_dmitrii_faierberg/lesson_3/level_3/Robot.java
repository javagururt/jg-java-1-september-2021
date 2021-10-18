package com.javaguru.student_dmitrii_faierberg.lesson_3.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot {
    private String name;

    public Robot(String robotName){
        this.name = robotName;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void sayYourName(){
        System.out.println("My name is " + this.name);
    }

    public Robot() {
    }
}
