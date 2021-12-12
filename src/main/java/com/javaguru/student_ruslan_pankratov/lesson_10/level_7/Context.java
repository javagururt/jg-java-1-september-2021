package com.javaguru.student_ruslan_pankratov.lesson_10.level_7;

import com.javaguru.teacher.codereview.CodeReview;

//Task_25
@CodeReview(approved = true)
class Context {

    private Animals animals;

    public Context(Animals animals) {
        this.animals = animals;
    }


    public double convertingToHumanAgeMethod(double age) {
        return animals.ageСonverter(age);
    }
}
