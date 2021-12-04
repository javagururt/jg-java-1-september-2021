package com.javaguru.student_deniss_lohins.lesson_10.level_4;

class FahrenheitConverter implements TemperatureConverter{
    @Override
    public double convert(double celsiusTemperature) {
        return (1.8 * celsiusTemperature + 32);
    }

}
