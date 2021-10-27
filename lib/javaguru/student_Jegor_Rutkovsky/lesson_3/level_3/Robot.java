package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_3;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot {

    private String name;

    public Robot(String robotName){
        this.name = robotName;
    }
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " +this.name);
    }

}
