package com.javaguru.student_nikita_simans.homework.lesson_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {

    public static void  main(String[] args){
        Robot robot1 = new Robot("Ivan");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("Pasha");
        robot2.sayHello();
        robot2.sayYourName();

        Robot robot3 = new Robot("Artur");
        robot3.sayHello();
        robot3.sayYourName();
    }

}
