package com.javaguru.student_dmitrii_faierberg.lesson_3.level_1;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();
    }
}
