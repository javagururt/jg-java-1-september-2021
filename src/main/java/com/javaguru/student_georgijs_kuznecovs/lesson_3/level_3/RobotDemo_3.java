package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo_3 {
    public static void main (String[] args) {
        RobotLevelThree robot1 = new RobotLevelThree("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        RobotLevelThree robot2 = new RobotLevelThree("John");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
