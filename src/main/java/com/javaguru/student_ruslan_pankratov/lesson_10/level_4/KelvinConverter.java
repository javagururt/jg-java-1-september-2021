package com.javaguru.student_ruslan_pankratov.lesson_10.level_4;

import com.javaguru.teacher.codereview.CodeReview;

//task 11,12, 28
@CodeReview(approved = true)
class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}