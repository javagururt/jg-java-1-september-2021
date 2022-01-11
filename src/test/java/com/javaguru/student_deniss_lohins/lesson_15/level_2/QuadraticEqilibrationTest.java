package com.javaguru.student_deniss_lohins.lesson_15.level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqilibrationTest {

    @Test
    public void testIfDiskriminantIsZero(){
    QuadraticEqilibration victim = new QuadraticEqilibration();
    double[] obtainedResult = victim.calc(4, -20, 25);
    double expectedresult = 2.5;
    assertEquals(expectedresult, obtainedResult[0], 0.01);
    }

    @Test
    public void testIfDiscriminantIsPositive1(){
        QuadraticEqilibration victim = new QuadraticEqilibration();
        double[] obtainedResult = victim.calc(1, 4, 3);
        double[] expectedresult = {-3, -1};
        assertEquals(expectedresult[0], obtainedResult[0], 0.01);
        assertEquals(expectedresult[1], obtainedResult[1], 0.01);
    }

    @Test
    public void testIfDiscriminantIsPositive2(){
        QuadraticEqilibration victim = new QuadraticEqilibration();
        double[] obtainedResult = victim.calc(1, -70, 600);
        double[] expectedresult = {10, 60};
        assertEquals(expectedresult[0], obtainedResult[0], 0.01);
        assertEquals(expectedresult[1], obtainedResult[1], 0.01);
    }

    @Test
    public void testIfdiscriminantIsNegateive(){
        QuadraticEqilibration victim = new QuadraticEqilibration();
        double[] obtainedResult = victim.calc(4, 0, 9);
        assertEquals(0, obtainedResult.length);
    }

}