package com.javaguru.student_deniss_lohins.lesson_7.level_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCopyTest {

    @Test
    public void mustReturnTwoUnitArray(){
        ArrayCopy victim = new ArrayCopy();
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedArray = {5, 6};
        int [] obtainedresult = victim.copyInRange(testArray, 5, 6);
        assertArrayEquals(expectedArray, obtainedresult);
    }
    @Test
    public void mustReturnFullArray(){
        ArrayCopy victim = new ArrayCopy();
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] obtainedresult = victim.copyInRange(testArray, 1, 20);
        assertArrayEquals(expectedArray, obtainedresult);
    }

    @Test
    public void mustReturnEmptyArray(){
        ArrayCopy victim = new ArrayCopy();
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedArray = {};
        int [] obtainedresult = victim.copyInRange(testArray, 20, 30);
        assertArrayEquals(expectedArray, obtainedresult);
    }

}