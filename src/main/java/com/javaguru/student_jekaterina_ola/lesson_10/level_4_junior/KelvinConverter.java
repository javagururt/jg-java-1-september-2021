package com.javaguru.student_jekaterina_ola.lesson_10.level_4_junior;

public class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
