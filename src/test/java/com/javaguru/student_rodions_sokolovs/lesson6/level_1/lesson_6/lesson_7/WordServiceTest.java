package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.lesson_7;
import com.javaguru.student_rodions_sokolovs.lesson_7.WordService;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordServiceTest {
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
