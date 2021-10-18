package com.javaguru.student_Olga_T.lesson_3.level_3.tasks_11_13;

public class Robot {
    private String name;

    public Robot() {
    }


    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}

