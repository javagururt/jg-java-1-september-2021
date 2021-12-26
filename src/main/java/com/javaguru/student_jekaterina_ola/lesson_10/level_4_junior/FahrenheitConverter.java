package com.javaguru.student_jekaterina_ola.lesson_10.level_4_junior;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
