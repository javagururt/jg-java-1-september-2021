package com.javaguru.teacher.lesson_7.lessoncode;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.*;

public class DoubleTest {


    @Test
    public void shouldBeEquals() {
        double firstValue = 1.00;
        double secondValue = 1.0001;
        double thirdValue = 0.9999;

        assertEquals(firstValue, secondValue, 0.0001);
        assertEquals(firstValue, thirdValue, 0.0001);
    }
}
