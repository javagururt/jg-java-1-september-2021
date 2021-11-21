package com.javaguru.student_dmitrii_faierberg.lesson_8.level_7.task_32;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {
    @Test
    public void calulateTest(){
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        MathOperation multiplication = new Multiplication(arg1, arg2);
        double expected  = 50;
        assertEquals(expected, multiplication.calculate(), 0.001);

    }

}