package com.javaguru.student_dmitrii_faierberg.lesson_7.level_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordService {

    public String findMostFrequentWord(String text) {
        String[] textArray;
        int[] wordCountArray;
        textArray = text.split(" ");
        wordCountArray = new int[textArray.length];

        countWordsInArray(textArray, wordCountArray);

        int max = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return textArray[max];
    }

    private void countWordsInArray(String[] textArray, int[] wordCountArray){
        int wordCounter = 0;
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            for (String s : textArray) {
                if (textArray[wordCount].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
            wordCounter = 0;
        }
    }
}