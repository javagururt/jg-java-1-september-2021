package com.javaguru.student_mihails_mihejevs.lesson_3.level_3;

class Robot {
    private String name;

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