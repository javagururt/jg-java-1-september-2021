package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_1;

public class RobotDemo {
    public static void main (String[] args){
        Robot robo = new Robot();

        robo.greeting = "Hello!";
        robo.sayHello();

        robo.name = "My name is ROBO";
        robo.sayName();

        Robot android = new Robot();

        android.greeting = "Hello!";
        android.sayHello();

        android.name = "My name is ANDROID";
        android.sayName();

        Robot vedro = new Robot();

        vedro.greeting = "Hello!";
        vedro.sayHello();

        vedro.name = "My name is VEDRO";
        vedro.sayName();

    }

}
