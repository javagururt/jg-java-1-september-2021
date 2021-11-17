package com.javaguru.student_dmitrii_faierberg.lesson_7.level_7;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class WordServiceTest {
    WordService victim = new WordService();
    @Test
    public void testFindMostFrequentWord () {
        String text = "car dog hot dog fog gold";
        String expected = "dog";
        assertEquals(expected, victim.findMostFrequentWord(text));
    }
}