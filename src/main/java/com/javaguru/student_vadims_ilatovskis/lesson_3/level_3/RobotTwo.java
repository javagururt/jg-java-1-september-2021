package com.javaguru.student_vadims_ilatovskis.lesson_3.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotTwo {
    public RobotTwo(String robotName){
        this.name = robotName;
    }
    private String name;
    public void sayHello(){System.out.println("Hello!");}
    public void sayYourName(){System.out.println("My name is " + this.name);}




}
