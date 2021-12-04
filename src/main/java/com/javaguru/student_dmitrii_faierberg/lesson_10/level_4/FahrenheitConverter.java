package com.javaguru.student_dmitrii_faierberg.lesson_10.level_4;

class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemp) {
        return 1.8 * celsiusTemp + 32;
    }
}
