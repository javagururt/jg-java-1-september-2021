package com.javaguru.student_jekaterina_ola.lesson_7.level_1_intern.Task_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.testFindMostFrequentWord();
        test.testWordCount();

    }

    public void testFindMostFrequentWord() {
        WordService testFindMostFrequentWordInString = new WordService();
        String result = testFindMostFrequentWordInString.findMostFrequentWord("Не напрасно дули ветры, Не напрасно шла гроза");
        if (result.equals("'напрасно,' 2")) {
            System.out.println("testFindMostFrequentWord - OK");
        } else {
            System.out.println("testFindMostFrequentWord - FAIL");
        }
    }

    public void testWordCount() {
        WordService testWordCountInString = new WordService();
        String[] testCountArray = {"Не", "напрасно", "дули", "ветры", "Не", "напрасно", "шла", "гроза"};
        int result1 = testWordCountInString.wordCount(testCountArray, "не");
        if (result1 == 2) {
            System.out.println("testWordCount - OK");
        } else {
            System.out.println("testWordCount - FAIl");
        }
    }
}

