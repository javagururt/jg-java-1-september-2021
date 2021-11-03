package com.javaguru.student_dmitrii_faierberg.lesson_6.level_3_junior;

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
}