package com.javaguru.student_Jegor_Rutkovsky.lesson_6.level_1;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator victim;

    @Test
    public void shouldReturnEvenNumber() {
        victim = new Calculator();
        assertTrue(victim.isEven(10));
    }
}

