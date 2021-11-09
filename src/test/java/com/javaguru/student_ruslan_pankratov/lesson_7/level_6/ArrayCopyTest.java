package com.javaguru.student_ruslan_pankratov.lesson_7.level_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCopyTest {
    @Test
    public void copyInRange() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int[] result = arrayCopy.copyInRange(arr, 14, 3);
        int[] expectedResult = {1, 2, 3, 14, 15, 16, 17, 18};

        assertArrayEquals(result, expectedResult);

    }
}