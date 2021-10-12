package com.javaguru.student_ruslan_pankratov.lesson_3.level_4;

import com.javaguru.teacher.codereview.CodeReview;

//Task_16
@CodeReview(approved = true)
class Car {

    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}