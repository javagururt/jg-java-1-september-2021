package com.javaguru.student_ruslan_pankratov.lesson_10.level_4;

//Task_12
class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
