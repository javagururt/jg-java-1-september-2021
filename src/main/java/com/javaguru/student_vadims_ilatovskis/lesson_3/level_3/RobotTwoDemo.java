package com.javaguru.student_vadims_ilatovskis.lesson_3.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotTwoDemo {
    public static void main(String[] args) {
        RobotTwo robot1 = new RobotTwo("Terminator");
        robot1.sayHello();
        robot1.sayYourName();

        RobotTwo robot2 = new RobotTwo("T1000");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
