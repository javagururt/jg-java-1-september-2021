package com.javaguru.student_Jegor_Rutkovsky.lesson_6.level_3_4;

import org.junit.Test;

import static org.junit.Assert.*;

//Task_9 - Task_14 (LESSON_6 LEVEL_3-4)
public class ArrayUtilTest {

    @Test
    public void sortNumbersInArray(){
        ArrayUtil victim = new ArrayUtil();
        int[] arr = {2, 5, 4, 1, 3};
        int[] expectedArr = {1, 2, 3, 4, 5};
        victim.sortNumbersInArray(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void overturnArray(){
        ArrayUtil victim = new ArrayUtil();
        int[] actualArr = {1, 2, 3, 4, 5, 6, 7};
        int[] expectedArr = {7, 6, 5, 4, 3, 2, 1};
        victim.overturnArray(actualArr);
        assertArrayEquals(expectedArr, actualArr);
    }

    @Test
    public void replaceAllInArray(){
        ArrayUtil victim = new ArrayUtil();
        int[] actual = {3, 2, 3, 4, 3};
        int[] expected = {10, 2, 10, 4, 10};
        victim.replaceAllInArray(actual, 3, 10);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findNumberInArray() {
        ArrayUtil victim = new ArrayUtil();
        int[] array = {1, 10, 20, 30};
        assertTrue(victim.findNumberInArray(array, 10));

    }
    @Test
    public void howManySearchNumbersInArray(){
        ArrayUtil victim = new ArrayUtil();
        int[] array = {5, 5, 6, 6,};
        assertEquals(2, victim.howManySearchNumbersInArray(array, 5));
    }

    @Test
    public void createArray() {
        ArrayUtil victim = new ArrayUtil();
        int[] actualArr = victim.createArray(5);
        assertEquals(5, actualArr.length);
    }

    @Test
    public void fillArrayWithRandomNumbers() {      // ******** НЕ УМЕЕМ *********
    }

    @Test
    public void printArrayToConsole() {     //Не знаю как проверить вывод сообщения на консоль
    }

    @Test
    public void findMaxNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(5, victim.findMaxNumber(arr));
    }

    @Test
    public void findMinNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(1, victim.findMinNumber(arr));
    }
}