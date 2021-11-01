package com.javaguru.student_deniss_lohins.lesson_6.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoDimensionalArrayTest {

private TwoDimensionalArray victim;

    @Test
    public void fill2DArrayWithrandomNumbers() {
        victim = new TwoDimensionalArray();
        int [][] array = victim.createArray(2,2);
        victim.fill2DArrayWithrandomNumbers(array);
        assertNotEquals(0, array[0][0]);
    }

    @Test
    public void sumOf2DArray() {
        victim = new TwoDimensionalArray();
        int[][] array = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        int sum = victim.sumOf2DArray(array);
        assertEquals(20, sum);
    }
}