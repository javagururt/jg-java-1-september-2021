package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_3;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotLevelThree {
    String name;

    public RobotLevelThree(String robotName) { this.name = robotName; }
    void sayHello(){
        System.out.println("Hello!");
    }
    void sayYourName(){ System.out.println("My name is " + name); }
}
