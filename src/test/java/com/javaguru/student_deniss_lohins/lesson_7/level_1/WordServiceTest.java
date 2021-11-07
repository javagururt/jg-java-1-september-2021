package com.javaguru.student_deniss_lohins.lesson_7.level_1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class WordServiceTest {

    @Test
    public void findMostFrequentWord() {
        WordService victim = new WordService();
        String testString = "red red blue,orange,blUe,BlUe.Orange";
        String expectedResult = "Most frequent word is: blue. This word repeated 3 times.";
        String obtainedResult = victim.findMostFrequenceWord(testString);
        assertEquals(expectedResult, obtainedResult);

    }

    @Test
    public void convertStringToStringArray() {
        WordService victim = new WordService();
        String testString = "God is in the details";
        String[] result = victim.convertStringToStringArray(testString);
        assertTrue(result.length == 5);
        assertEquals("in", result[2]);
        
    }



    @Test
    public void nameCounter() {
        WordService victim = new WordService();
        String[] testArray = {"red", "blue", "white", "blue"};
        assertTrue(victim.nameCounter(testArray, "red")== 1);
        assertTrue(victim.nameCounter(testArray, "bluE") == 2);
    }


}