package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Car {
    private String model;
    public Car(String newModel){
        this.model = newModel;
    }
    public String getModel(){
        return this.model;
    }
}
