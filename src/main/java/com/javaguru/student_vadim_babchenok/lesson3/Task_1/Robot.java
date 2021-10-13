package com.javaguru.student_vadim_babchenok.lesson3.Task_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot {
    String name;

    public Robot() {
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    public void sayYourName(String n) {
        this.name = n;
        System.out.println("My name is " + this.name);
    }

    }




