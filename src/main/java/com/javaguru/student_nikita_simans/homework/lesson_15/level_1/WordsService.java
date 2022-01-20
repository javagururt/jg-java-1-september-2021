package com.javaguru.student_nikita_simans.homework.lesson_15.level_1;

class WordsService {

    public int countRepetitions(String[] words, String searchWord) {
        int numberOfRepetitions = 0;
        for (String word : words) {
            if (word.equals(searchWord)) {
                numberOfRepetitions++;
            }
        }
        return numberOfRepetitions;
        
    }

}
