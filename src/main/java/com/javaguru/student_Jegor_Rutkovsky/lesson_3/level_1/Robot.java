package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot {

    String name;
    public Robot() {
    }

    public Robot(String robotName) {
        name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!"); // тут напишите команду распечатки на консоли строки "Hello!"
    }

    public void sayYourName() {
        System.out.println("My name is " +name); // тут напишите команду распечатки на консоли строки "My name is ROBO"
    }
}
