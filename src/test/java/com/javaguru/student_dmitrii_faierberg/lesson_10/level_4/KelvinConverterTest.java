package com.javaguru.student_dmitrii_faierberg.lesson_10.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class KelvinConverterTest {

    @Test
    public void convertTest(){
        TemperatureConverter converter = new KelvinConverter();
        assertEquals(303.15, converter.convert(30), 0.001);
    }

}