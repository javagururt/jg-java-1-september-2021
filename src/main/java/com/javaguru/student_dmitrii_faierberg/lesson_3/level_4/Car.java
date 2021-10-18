package com.javaguru.student_dmitrii_faierberg.lesson_3.level_4;

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
