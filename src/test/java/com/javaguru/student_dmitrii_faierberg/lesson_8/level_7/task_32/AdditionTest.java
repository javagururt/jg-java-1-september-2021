package com.javaguru.student_dmitrii_faierberg.lesson_8.level_7.task_32;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {
    @Test
    public void calculateTest(){
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        MathOperation addition = new Addition(arg1, arg2);
        double expected  = 15;
        assertEquals(expected, addition.calculate(), 0.001);
    }
}