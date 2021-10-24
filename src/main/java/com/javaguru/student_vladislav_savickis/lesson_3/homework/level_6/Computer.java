package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Computer {
    private String manufacturer;
    private String model;

    public Computer(String computerManufacturer, String computerModel) {
        this.manufacturer = computerManufacturer;
        this.model = computerModel;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }

}
