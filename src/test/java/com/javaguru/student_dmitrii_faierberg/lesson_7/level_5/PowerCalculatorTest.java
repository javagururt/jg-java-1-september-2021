package com.javaguru.student_dmitrii_faierberg.lesson_7.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorTest {
    PowerCalculator victim = new PowerCalculator();
    @Test
    public void testPowPositiveDegree(){
        double expected = 125;
        assertEquals(expected, victim.pow(5, 3), 0.01);

    }

    @Test
    public void testPowNegativeDegree(){
        double expected = 0.25;
        assertEquals(expected, victim.pow(2, -2), 0.01);

    }

    @Test
    public void testPowZeroDegree(){
        assertEquals(1, victim.pow(56, 0), 0.01);
    }

}