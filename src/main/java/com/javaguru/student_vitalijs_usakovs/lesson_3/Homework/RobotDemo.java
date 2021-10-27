package com.javaguru.student_vitalijs_usakovs.lesson_3.Homework;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {

    Robot robot1 = new Robot("ROBO");
    robot1.sayHello();
    robot1.sayYourName();

    Robot robot2 = new Robot("ROBERT");
    robot2.sayHello();
    robot2.sayYourName();

    Robot robot3 = new Robot("ROBERTISIMO");
    robot3.sayHello();
    robot3.sayYourName();

/*
       Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();
*/
    }
}