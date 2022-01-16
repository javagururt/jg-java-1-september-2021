package com.javaguru.student_deniss_lohins.lesson_16.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumProblemTest {

    @Test
    public void findSumOfTwo() {
        TwoSumProblem victim = new TwoSumProblem();
        int[] testArray = {1, 2, 5, 8};
        int testNumber = 7;
        String obtainedResult = victim.findSumOfTwo(testArray, testNumber);
        String expectedresult = "[1 2]";
        assertEquals(expectedresult, obtainedResult);
    }

    @Test
    public void findSumOfTwo2() {
        TwoSumProblem victim = new TwoSumProblem();
        int[] testArray = {1, 2, 5, 8, 10, 11, 20, 21};
        int testNumber = 26;
        String obtainedResult = victim.findSumOfTwo(testArray, testNumber);
        String expectedresult = "[2 7]";
        assertEquals(expectedresult, obtainedResult);
    }

}