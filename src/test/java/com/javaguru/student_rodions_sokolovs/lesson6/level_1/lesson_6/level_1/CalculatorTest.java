package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.level_1;

import com.javaguru.student_rodions_sokolovs.lesson_6.level_1.Calculator;
import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
@CodeReview(approved = true)
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