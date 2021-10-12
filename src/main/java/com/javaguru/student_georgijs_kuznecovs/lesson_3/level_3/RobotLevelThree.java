package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_3;

class RobotLevelThree {
    String name;

    public RobotLevelThree(String robotName) { this.name = robotName; }
    void sayHello(){
        System.out.println("Hello!");
    }
    void sayYourName(){ System.out.println("My name is " + name); }
}
