package com.javaguru.student_dmitrii_faierberg.lesson_6.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoDimensionalArrayTest {
    int[][] array = { {1, 2, 3, 4}, {1, 2, 2, 2}};
    TwoDimensionalArray victim = new TwoDimensionalArray();
    @Test
    public void testSumOfElements(){
        int result = victim.sumAllTheElementsOfArray(array);
        assertEquals(17, result);
    }
}