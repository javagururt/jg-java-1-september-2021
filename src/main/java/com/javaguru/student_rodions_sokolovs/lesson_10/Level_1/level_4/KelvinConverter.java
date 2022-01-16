package com.javaguru.student_rodions_sokolovs.lesson_10.Level_1.level_4;

public class KelvinConverter implements TemperatureConverter {

    public double convert(double celsiusTemp) {
        return celsiusTemp + 273.15;
    }
}
