package com.javaguru.student_ruslan_pankratov.lesson_7.level_5;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class PowerCalculatorTest {

    @Test
    public void exponentiationTest() {
        int result = PowerCalculator.exponentiation(5, 6);
        int expectedResult = 15625;

       assertEquals(result,expectedResult);

    }
}