package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Car {
    private String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }
}
