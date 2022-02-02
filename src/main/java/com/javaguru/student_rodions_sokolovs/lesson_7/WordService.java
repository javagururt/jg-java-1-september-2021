package com.javaguru.student_rodions_sokolovs.lesson_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordService {
    public static String findMostFrequentWord(String text) {
        String[] arr = text.split(" ");
        String Word = "";
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int countWord = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    countWord++;
                }
            }
            if (countWord > maxCount) {
                maxCount = countWord;
                Word =arr[i] + " = " + maxCount;
            }
        }
        return Word;
    }
}

