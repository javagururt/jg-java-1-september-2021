package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_1;

class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Rider");
        robot1.sayHallo();
        robot1.sayYourName();
        System.out.println();

        Robot robot2 = new Robot("John");
        robot2.sayHallo();
        robot2.sayYourName();
        System.out.println();

        Robot robot3 = new Robot("Tim");
        robot3.sayHallo();
        robot3.sayYourName();
    }
}
