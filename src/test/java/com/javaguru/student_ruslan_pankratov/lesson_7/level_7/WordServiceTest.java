package com.javaguru.student_ruslan_pankratov.lesson_7.level_7;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class WordServiceTest {
    @Test
    public void findMostFrequentWord() {
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord("1 2 3 1 2 3 1 1 2 1 win win 1");
        String expectedResult = "Самое частое слово или число = 1 было использовано: 6 раз";

        assertEquals(result, expectedResult);
    }
}