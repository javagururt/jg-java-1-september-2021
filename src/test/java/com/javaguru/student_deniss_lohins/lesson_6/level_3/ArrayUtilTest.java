package com.javaguru.student_deniss_lohins.lesson_6.level_3;


import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayUtilTest {

private ArrayUtil victim;
    @Test
    public void testDoesArrayContainsExactNumber() {
        victim = new ArrayUtil();
        int[] array = {1, 4, 829, -98, 555};
        assertTrue(victim.doesArrayContainsExactNumber(-98, array));

    }
    @Test
    public void testHowManyTimesContainsExactNumber(){
        victim = new ArrayUtil();
        int[] array = {1,2,3,1,2,3,1,1,3,2,0,0,54};
        assertEquals(3, victim.howManyTimesContainExactNumber(2, array));
    }

    @Test
    public void shoudlReplaceNumberInArray(){
        victim = new ArrayUtil();
        int[] array = {2,2,2,2,2,2,2,2,2};
        int[] resultArray = {2,2,2,2,6,2,2,2,2};
        victim.replace(array, 4, 6);
        assertEquals(resultArray[4], array[4]);
    }

    @Test
    public void shouldReplaceAllNumbersInArray(){
        victim = new ArrayUtil();
        int[] array = {1,2,3,1,2,3,1,1,3,2,0,0,54};
        victim.replaceAll(array, 2, 6);
        assertEquals(3, victim.howManyTimesContainExactNumber(6, array ));
    }

    @Test
    public void shouldReverseArray(){
        victim = new ArrayUtil();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] resultArray = {10,9,8,7,6,5,4,3,2,1};
        victim.reverseArray(array);
        assertEquals(resultArray[1], array[1]);
    }
    @Test
    public void testSortArray() {
        victim = new ArrayUtil();
        int[] array = {6,8,3,7,10,5,4,9,2,1};
        int[] resultArray = {1,2,3,4,5,6,7,8,9,10};
        victim.sortArray(array);
        assertEquals(resultArray[0], array[0]);
    }
}