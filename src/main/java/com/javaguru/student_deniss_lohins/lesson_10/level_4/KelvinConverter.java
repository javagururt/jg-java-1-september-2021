package com.javaguru.student_deniss_lohins.lesson_10.level_4;

class KelvinConverter implements TemperatureConverter{
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

}
