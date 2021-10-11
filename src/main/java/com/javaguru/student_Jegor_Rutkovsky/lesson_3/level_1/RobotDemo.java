package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_1;

import com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_1.Robot;

public class RobotDemo {
    public static void main(String[] args) {
        Robot myRobot1 = new Robot(); // создайте экземпляр класса Robot вызвав конструктор класса
        // сохраните ссылку (указатель) на только, что созданный
        // виртуальный обьект класса Robot в переменную,
        // она нам понадобиться для дальнейшего использования.
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
