package com.javaguru.student_deniss_lohins.lesson_7.level_5;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import org.junit.Test;

import static org.junit.Assert.*;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "лучше использовать assertEquals")
public class PowerCalculatorTest {

    @Test
    public void powerToZerro() {
        PowerCalculator victim = new PowerCalculator();
        assertTrue(victim.power(2, 0) == 1.00);
    }

    @Test
    public void powerToPositiveNumber(){
        PowerCalculator victim = new PowerCalculator();
        assertTrue(victim.power(2, 8) == 256.00);
    }

    @Test
    public void powerToNegativeNumber(){
        PowerCalculator victim = new PowerCalculator();
        assertTrue(victim.power(2, -2) == 0.25);
    }
}