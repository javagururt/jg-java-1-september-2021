package com.javaguru.teacher.lesson_7.lessoncode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysTest {

    @Test
    public void shouldCompareArrays() {
        int[] firstArray = {1, 2, 3};
        int[] expected = {1, 2, 3};

        assertArrayEquals(expected, firstArray);
    }
}
