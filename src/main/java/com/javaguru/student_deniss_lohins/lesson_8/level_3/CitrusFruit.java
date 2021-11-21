package com.javaguru.student_deniss_lohins.lesson_8.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CitrusFruit extends Fruit{
    double acidity;

    public CitrusFruit(String colour, double weight, double acidity) {
        super(colour, weight);
        this.acidity = acidity;
    }
}
