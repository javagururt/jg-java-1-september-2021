package com.javaguru.student_mihails_mihejevs.lesson_3.level_1;

class RobotDemo {

    public static void main(String[] args) {

        Robot exemplar1 = new Robot();
        exemplar1.sayHello();
        exemplar1.sayYourName();

        Robot exemplar2 = new Robot();
        exemplar1.sayHello();
        exemplar2.sayYourName();

        Robot exemplar3 = new Robot();
        exemplar3.sayHello();
        exemplar3.sayYourName();
    }
}


/* YEGOR
import com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_1.Robot;
import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

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
*/