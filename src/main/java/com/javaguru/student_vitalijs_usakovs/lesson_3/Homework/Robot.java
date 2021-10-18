package com.javaguru.student_vitalijs_usakovs.lesson_3.Homework;

public class Robot {
    private String name;

    public void sayHello(){
        System.out.println("Hello!");
    }

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

 }