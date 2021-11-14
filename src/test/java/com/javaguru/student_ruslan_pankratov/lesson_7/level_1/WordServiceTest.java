package com.javaguru.student_ruslan_pankratov.lesson_7.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;


import static org.junit.Assert.*;
@CodeReview(approved = true)
public class WordServiceTest {
    @Test
    public void delimiterArrTest() {
        String arr = "cat dog cat dog";
        String[] result = WordService.delimiter(arr);
        String[] expectedResult = {"cat", "dog", "cat", "dog"};

        assertArrayEquals(result, expectedResult);
    }

    @Test
    public void countTest() {
        String arr = "cat dog cat dog";
        String result = WordService.findMostFrequentWord(arr);
        String expectedResult = "cat = 2";

        assertEquals(result, expectedResult);
    }

    @Test
    public void findMostFrequentWordTest() {
        String arr = "cat dog cat dog";
        String result = WordService.findMostFrequentWord(arr);
        String expectedResult = "cat = 2";

        assertEquals(result, expectedResult);

    }

}