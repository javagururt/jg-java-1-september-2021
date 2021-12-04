package com.javaguru.student_deniss_lohins.lesson_10.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitConverterTest {

    @Test
    public void convert() {
        TemperatureConverter victim = new FahrenheitConverter();
        double actual = victim.convert(200);
        assertEquals(392, actual, 0.01);

    }
}