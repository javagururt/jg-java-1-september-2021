package com.javaguru.student_deniss_lohins.lesson_10.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class KelvinConverterTest {

    @Test
    public void convert() {
        TemperatureConverter victim = new KelvinConverter();
        double actualResult = victim.convert(0);
        assertEquals(273.15, actualResult, 0.01);
    }
}