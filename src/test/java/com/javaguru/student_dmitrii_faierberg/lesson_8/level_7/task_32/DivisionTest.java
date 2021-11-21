package com.javaguru.student_dmitrii_faierberg.lesson_8.level_7.task_32;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {
    @Test
    public void calculateTest(){
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        MathOperation division = new Division(arg1, arg2);
        double expected  = 2;
        assertEquals(expected, division.calculate(), 0.001);
    }

}