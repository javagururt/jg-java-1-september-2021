package com.javaguru.student_dmitrii_faierberg.lesson_10.level_4;

class KelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemp) {
        return celsiusTemp + 273.15;
    }
}
