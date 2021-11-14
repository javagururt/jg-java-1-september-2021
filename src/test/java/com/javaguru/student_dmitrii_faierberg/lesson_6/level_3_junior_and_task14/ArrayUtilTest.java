package com.javaguru.student_dmitrii_faierberg.lesson_6.level_3_junior_and_task14;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {
    private ArrayUtil victim = new ArrayUtil();
    private int[] array = { 1, 2, 6 ,4, 7, 10, 6, 2, 2};
    @Test
    public void shouldReturnTrueIfNumberIs(){
        boolean result = victim.isNumberInArray(array, 7);
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseIfNoNumber() {
        boolean result = victim.isNumberInArray(array, 16);
        assertEquals(false, result);
    }

    @Test
     public void testCountNumberInArray1(){
        int result = victim.countHowOftenNumberInArray(array, 2);
        assertEquals(3, result);
    }

    @Test
    public void testCountNumberInArray2(){
        int result = victim.countHowOftenNumberInArray(array, 6);
        assertEquals(2, result);
    }

    @Test
    public void testCountNumberInArray3(){
        int result = victim.countHowOftenNumberInArray(array, 0);
        assertEquals(0, result);
    }

    @Test
    public void testReplaceFirstNumber(){
        int[] array = {1, 2, 2, 5, 2};
        victim.replace(array, 2, 12);
        assertArrayEquals(new int[]{1, 12, 2, 5, 2}, array);
    }

    @Test
    public void testReplaceAllNumbers(){
        int[] array = {1, 2, 2, 5, 2};
        victim.replaceAll(array, 2, 12);
        assertArrayEquals(new int[]{1, 12, 12, 5, 12}, array);
    }

    @Test
    public void testReverseArray(){
        int[] array = {1, 2, 2, 5, 2};
        victim.reverseArray(array);
        assertArrayEquals(new int[]{2, 5, 2, 2, 1}, array);
    }

    @Test
    public void testQuickSort(){
        int[] array = {5,1,6,2,5,7,5,23,8,4};
        victim.quickSort(array);
        assertArrayEquals(new int[]{1,2,4,5,5,5,6,7,8,23}, array);
    }
}