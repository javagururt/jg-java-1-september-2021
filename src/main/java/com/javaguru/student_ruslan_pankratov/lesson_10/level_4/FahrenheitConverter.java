package com.javaguru.student_ruslan_pankratov.lesson_10.level_4;

import com.javaguru.teacher.codereview.CodeReview;

//Task_12
@CodeReview(approved = true)
class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
