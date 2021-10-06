package com.javaguru.student_ruslan_pankratov.lesson_3.level_3;

//Task 11,12,13

public class RobotDemoOne {

    public static void main(String[] args) {
        RobotOne robotOne = new RobotOne("Rider");
        robotOne.sayHello();
        robotOne.sayYourName();

        RobotOne robotOne2 = new RobotOne("John");
        robotOne2.sayHello();
        robotOne2.sayYourName();
    }
}
