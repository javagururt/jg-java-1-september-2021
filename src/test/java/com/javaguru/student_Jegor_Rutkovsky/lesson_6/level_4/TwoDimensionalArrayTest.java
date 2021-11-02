package com.javaguru.student_Jegor_Rutkovsky.lesson_6.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoDimensionalArrayTest {


    @Test
    public void sumOfAllArrayNumbers() {
        TwoDimensionalArray victim = new TwoDimensionalArray();
        int[][] array = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        assertEquals(45, victim.sumOfAllArrayNumbers(array));
        }
}