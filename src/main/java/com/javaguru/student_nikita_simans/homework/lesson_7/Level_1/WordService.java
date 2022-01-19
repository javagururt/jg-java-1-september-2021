package com.javaguru.student_nikita_simans.homework.lesson_7.Level_1;

public class WordService {

    public String findMostFrequentWord(String sample) {
        return mostFrequentWordCountResult(sample);

    }


     String[] stringToArray(String sample) {
     String[] returnedArray = sample.split("[ ,.?!:;]");
     return returnedArray;
    }

    int wordCounter(String[] stringArray, String word) {
        int count = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }

    String mostFrequentWord(String string) {
        String[] array = stringToArray(string);
        String word = null;
        int count = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter = wordCounter(array, array[i]);
            if (counter > count) {
                word = array[i];
                count = counter;
            }
        }
        return word;
    }

    int mostFrequentWordCount(String string) {
        String[] array = stringToArray(string);
        String word = null;
        int count = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter = wordCounter(array, array[i]);
            if (counter > count) {
                word = array[i];
                count = counter;
            }
        }
        return count;
    }

    String mostFrequentWordCountResult(String string) {

        String word = mostFrequentWord(string);
        int count = mostFrequentWordCount(string);

        String result = "Frequentest word: " + word + "." + " Repetition counter: " + count;
        return result;
    }
























}
