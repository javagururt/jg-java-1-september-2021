package com.javaguru.student_dmitrii_faierberg.lesson_7.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordService {
    public String findMostFrequentWord(String text) {
        String[] words = wordsFromString(text);
        String currentWord;
        String result = "";
        int maxFrequency = 0;
        int length = words.length;
        int counter;

        for(int i = 0; i < length; i++){
            counter = 1;
            currentWord = words[i];
            for (int j = i + 1; j < length; j++){
                if (words[j].equals(currentWord)){
                    counter++;
                }
            }
            if (maxFrequency < counter){
                maxFrequency = counter;
                result = currentWord;
            }
        }
        return result;
    }

    public String[] wordsFromString(String text){
        String word = "";
        int lengthOfWords = lengthOfWords(text);
        String[] words = new String[lengthOfWords];
        int wordsIndex = 0;

        for (int i = 0; i < text.length(); i++){
            if (i == text.length()-1){
                word += text.charAt(i);
                words[wordsIndex] = word;
                wordsIndex++;
            } else if (text.charAt(i) != ' '){
                word += text.charAt(i);
            } else {
                words[wordsIndex] = word;
                wordsIndex++;
                word = "";
            }
        }
        return words;
    }

    public int lengthOfWords(String text){
        int lengthOfWords = 1;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' '){
                lengthOfWords++;
            }
        }
        return lengthOfWords;
    }
}
