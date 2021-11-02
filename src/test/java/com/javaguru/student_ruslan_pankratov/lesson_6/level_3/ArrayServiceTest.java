package com.javaguru.student_ruslan_pankratov.lesson_6.level_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayServiceTest {

    @Test
    public void containsTrue() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 3, 1, 3, 6};
        int numberToSearch = 6;

        boolean result = arrayService.contains(arr, numberToSearch);
        assertTrue(result);
    }

    @Test
    public void containsFalse() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 6};
        int numberToSearch = 10;

        boolean result = arrayService.contains(arr, numberToSearch);
        assertFalse(result);
    }

    @Test
    public void countOccurrencesTrueTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 3, 2, 3, 4, 3};
        int numberToSearch = 3;

        int result = arrayService.countOccurrences(arr, numberToSearch);
        int expectedresult = 4;
        assertEquals(result, expectedresult);

    }


    @Test
    public void countOccurrencesFalseTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {1, 2, 3, 4, 3, 2, 3, 4, 3};
        int numberToSearch = 8;

        int result = arrayService.countOccurrences(arr, numberToSearch);
        int expectedresult = 0;
        assertEquals(result, expectedresult);
    }

    @Test
    public void replaceFirstTrueTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 3, 5, 6, 6, 5};
        int numberToReplace = 6;
        int newNumber = 7;

        boolean result = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        assertTrue(result);
    }

    @Test
    public void replaceFirstFalseTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 3, 5, 6, 6, 5};
        int numberToReplace = 8;
        int newNumber = 7;

        boolean result = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        assertFalse(result);
    }

    @Test
    public void replaceAllTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 3, 2, 3, 5, 2};
        int oldNumber = 2;
        int newNumber = 10;

        int expectedResult = 3;
        int result = arrayService.replaceAll(arr, oldNumber, newNumber);
        assertEquals(result, expectedResult);
    }

    @Test
    public void replaceAllNegativeTest() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {2, 3, 2, 3, 5, 2};
        int oldNumber = 10;
        int newNumber = 13;

        int expectedResult = 0;
        int result = arrayService.replaceAll(arr, oldNumber, newNumber);
        assertEquals(result, expectedResult);
    }

    @Test
    public void revertTest() {
        ArrayService arrayService = new ArrayService();
        int[] result = {1, 2, 3, 4, 5, 6, 7};
        int[] expectedResult = {7, 6, 5, 4, 3, 2, 1};

        arrayService.revert(result);
        assertEquals(result[0], expectedResult[0]);
    }

    @Test
    public void sortTest() {
        ArrayService arrayService = new ArrayService();
        int[] result = {5, 3, 4, 2, 1, 6, 7, 2};
        arrayService.sort(result);
        int[] expectedResult = {1, 2, 2, 3, 4, 5, 6, 7};

        assertEquals(result[0], expectedResult[0]);
    }

}