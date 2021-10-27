package com.javaguru.student_ruslan_pankratov.lesson_3.level_3;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

//Task 11,12,13
@CodeReview(approved = true)
public class RobotOne {
    String name;

    RobotOne(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayYourName() {
        System.out.println("My name is " + name);
    }


}
