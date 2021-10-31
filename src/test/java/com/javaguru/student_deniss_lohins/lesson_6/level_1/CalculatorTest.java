package com.javaguru.student_deniss_lohins.lesson_6.level_1;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    private Calculator victim;
    @Test
    public void shouldReturnTrue() {
        victim = new Calculator();
        assertTrue(victim.isEven(2));
    }

    @Test
    public void shouldReturnFalse() {
        victim = new Calculator();
        assertFalse(victim.isEven(3));
    }
}