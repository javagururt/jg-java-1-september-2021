package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson3.Task_1;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Robot robot1 = new Robot();
        Robot robot2 = new Robot();
        Robot robot3 = new Robot();

        robot.sayHello();
        robot.sayYourName("ROBO");

        robot1.sayHello();
        robot1.sayYourName("ROBO1");

        robot2.sayHello();
        robot2.sayYourName("ROBO2");

        robot3.sayHello();
        robot3.sayYourName("ROBO3");
    }
}




