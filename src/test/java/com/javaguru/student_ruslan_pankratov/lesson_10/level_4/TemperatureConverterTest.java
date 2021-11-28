package com.javaguru.student_ruslan_pankratov.lesson_10.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {
    @Test
    public void kelvinConverterTest() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double result = kelvinConverter.convert(100);
        double expectedResult = 373.15;

        assertEquals(expectedResult, result, 0.0001);//delta определяет размер насколько можно ошибиться, чем меньше
        // нулей, тем больше можно сделать ошибку
    }

    @Test
    public void fahrenheitConverterTest() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double result = fahrenheitConverter.convert(100);
        double expectedResult = 212.0;

        assertEquals(expectedResult, result, 0.00000001);
    }


}