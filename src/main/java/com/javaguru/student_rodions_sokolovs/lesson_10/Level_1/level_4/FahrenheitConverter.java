package com.javaguru.student_rodions_sokolovs.lesson_10.Level_1.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FahrenheitConverter implements TemperatureConverter {
    public double convert(double celsiusTemp) {
        return (1.8 * celsiusTemp + 32);
    }
}
