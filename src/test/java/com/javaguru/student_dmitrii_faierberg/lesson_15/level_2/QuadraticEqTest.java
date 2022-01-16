package com.javaguru.student_dmitrii_faierberg.lesson_15.level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {

    @Test
    public void shouldReturnTwoRoots(){
        QuadraticEq eq = new QuadraticEq();
        String actual = eq.calc(1, 1, -6);
        String expected = "x1 = " + -3.0 + ", x2 = " + 2.0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOneRoot(){
        QuadraticEq eq = new QuadraticEq();
        String actual = eq.calc(4, 12, 9);
        String expected = "x = " + -1.5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNoRoots(){
        QuadraticEq eq = new QuadraticEq();
        String actual = eq.calc(4, 1, 3);
        String expected = "Equation has no roots";
        assertEquals(expected, actual);
    }

}