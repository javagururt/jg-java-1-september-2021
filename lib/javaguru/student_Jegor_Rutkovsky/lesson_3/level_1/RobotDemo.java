package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_1;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;
import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "если переменная не используется то ее лучше удалить")
public class RobotDemo {
    public static void main(String[] args) {

        Robot robot1 = new Robot("ROBO");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("ROBOCOP");
        robot2.sayHello();
        robot2.sayYourName();

        Robot robot3 = new Robot("TERMINATOR");
        robot3.sayHello();
        robot3.sayYourName();

        Robot robot4 = new Robot("MACHINE");
        robot4.sayHello();
        robot4.sayYourName();

        Robot robot5 = new Robot("SIMPLE BOT");
        robot5.sayHello();
        robot5.sayYourName();
    }
}
