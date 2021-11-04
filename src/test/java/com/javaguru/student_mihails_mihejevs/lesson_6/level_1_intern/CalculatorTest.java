package com.javaguru.student_mihails_mihejevs.lesson_6.level_1_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator victim;

    @Test
    public void shouldEven() {
victim = new Calculator();
        assertTrue(victim.isEven(4));

    }
}