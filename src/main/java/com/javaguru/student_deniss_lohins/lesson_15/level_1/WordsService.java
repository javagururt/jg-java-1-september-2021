package com.javaguru.student_deniss_lohins.lesson_15.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordsService {

    public int countRepetitions(String[] words, String wordToCountInArray) {
        int numberOfRepetitionsOfTheSearchWord = 0;
        for (String word : words) {
            if (word.equals(wordToCountInArray)) {
                numberOfRepetitionsOfTheSearchWord++;
            }
        }
        return numberOfRepetitionsOfTheSearchWord;
    }

}

