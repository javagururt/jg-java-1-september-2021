package com.javaguru.student_dmitrii_faierberg.lesson_7.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class  WordServiceTest {
    WordService victim = new WordService();

    @Test
    public void testLengthOfWords(){
        int expected = 6;
        String text = "Someday I will be a programmer";
        assertEquals(expected, victim.lengthOfWords(text));
    }

    @Test
    public void testWordsFromString(){
        String[] expected = {"Someday", "I", "will", "be", "a", "programmer"};
        String text = "Someday I will be a programmer";
        assertArrayEquals(expected, victim.wordsFromString(text));
    }

    @Test
    public void testMostFrequentWord1(){
        String text = "potato spaghetti carrot spaghetti potato spaghetti";
        String expected = "spaghetti";
        assertEquals(expected, victim.findMostFrequentWord(text));
    }

    @Test
    public void testMostFrequentWord2(){
        String text = "potato spaghetti carrot spaghetti potato";
        String expected = "potato";
        assertEquals(expected, victim.findMostFrequentWord(text));
    }

}