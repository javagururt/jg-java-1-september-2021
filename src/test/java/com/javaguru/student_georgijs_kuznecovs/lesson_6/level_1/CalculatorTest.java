package com.javaguru.student_georgijs_kuznecovs.lesson_6.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class CalculatorTest {

    private Calculator victim;

    @Test
    public void isEvenTest() {
        victim = new Calculator();

        assertTrue(victim.isEven(10));

    }
}