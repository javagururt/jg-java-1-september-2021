package com.javaguru.student_jekaterina_ola.lesson_3.level_3.task_11;

import com.javaguru.student_jekaterina_ola.lesson_3.level_1.Robot;

public class RobotOneDemo {

    public static void main(String[] args) {
        RobotOne robotOne = new RobotOne("Rider");
        robotOne.sayHello();
        robotOne.sayYourName();
        System.out.println();

        RobotOne robotTwo = new RobotOne("John");
        robotTwo.sayHello();
        robotTwo.sayYourName();
        System.out.println();
    }
}
