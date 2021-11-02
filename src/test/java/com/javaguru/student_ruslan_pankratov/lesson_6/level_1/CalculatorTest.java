package com.javaguru.student_ruslan_pankratov.lesson_6.level_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void isEven() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(8);
        assertTrue(result);
    }


    @Test
    public void isEvenFalseTest() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(9);
        assertFalse(result);
    }


}