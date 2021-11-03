package com.javaguru.student_dmitrii_faierberg.lesson_6.level_1_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest{
    private Calculator victim = new Calculator();

    @Test
    public void shouldReturnTrue(){
        boolean result = victim.isEven(14);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalse(){
        boolean result = victim.isEven(9);
        assertEquals(false, result);
    }
}