package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_4;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Phone {
    private String model;

    public Phone(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }
}
