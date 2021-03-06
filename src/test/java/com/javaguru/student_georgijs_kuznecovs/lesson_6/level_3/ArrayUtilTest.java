package com.javaguru.student_georgijs_kuznecovs.lesson_6.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class ArrayUtilTest {

    private ArrayUtil victim;

    @Test
    public void shouldFindNumber() {
        victim  = new ArrayUtil();
        int[] array = {1, 2, 3, 4, 5, 6};
        assertTrue(victim.findNumber(6, array));

    }

    @Test
    public void shouldCountNumbers() {
        victim  = new ArrayUtil();
        int[] array = {1, 2, 6, 4, 5, 6};
        assertEquals(2, victim.countNumbers(6, array));
    }

    @Test
    public void shouldReplaceNumber() {
        victim = new ArrayUtil();
        int[] array = {1, 2, 6, 4, 5, 6};
        victim.replace(array, 0, 18);
        int[] newArray = {18, 2, 6, 4, 5, 6};

        assertArrayEquals(newArray, array);


    }

    @Test
    public void shouldReplaceAllNumbers() {
        victim = new ArrayUtil();
        int[] array = {1, 2, 6, 4, 5 ,6};
        victim.replaceAll(array, 6, 18);
        int[] newArray = {1, 2, 18, 4, 5, 18};

        assertArrayEquals(newArray, array);
    }

    @Test
    public void shouldReverseArray() {
        victim = new ArrayUtil();
        int[] array = {1, 2, 3, 18, 4, 5 ,6};
        victim.reverse(array);
        int[] newArray = {6, 5, 4, 18, 3, 2, 1};

        assertArrayEquals(newArray, array);
    }

    @Test
    public void shouldSortArray() {
        victim = new ArrayUtil();
        int[] array = {1, 3, 4, 18, 6, 2 ,5};
        victim.sort(array);
        int[] newArray = {1, 2, 3, 4, 5, 6, 18};

        assertArrayEquals(newArray, array);
    }
}

