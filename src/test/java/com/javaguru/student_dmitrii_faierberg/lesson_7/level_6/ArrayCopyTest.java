package com.javaguru.student_dmitrii_faierberg.lesson_7.level_6;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class ArrayCopyTest {
    ArrayCopy victim = new ArrayCopy();
    @Test
    public void testArrayCopy(){
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected = { 2, 3, 4, 5};
        assertArrayEquals(expected, victim.copyInRange(array, 1, 4));

        expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, victim.copyInRange(array, 0, 8));
    }
}