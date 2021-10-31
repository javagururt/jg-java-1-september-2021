package com.javaguru.student_deniss_lohins.lesson_3.level_3;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotDemo2 {
    public static void main(String[] args) {
        Robot1 robot1 = new Robot1("Rider");
        robot1.sayHello();
        robot1.sayYourName();
        Robot1 robot2 = new Robot1("John");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
