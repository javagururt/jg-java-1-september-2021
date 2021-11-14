package com.javaguru.student_deniss_lohins.lesson_7.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordService {

    public String findMostFrequenceWord(String text) {
         return mostFrequenceWordAndCount(text);
    }

    String[] convertStringToStringArray(String text) {
        String stringToConvert = text;
        String[] stringArrayToReturn = stringToConvert.split("[ ,.@?!]");
        return stringArrayToReturn;
    }

    int nameCounter(String[] stringArray, String name) {
        int count = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equalsIgnoreCase(name)) {
                count++;
            }
        }
        return count;
    }


    String mostFrequenceWordAndCount(String string) {
        String[] array = convertStringToStringArray(string);
        String name = null;
        int count = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter = nameCounter(array, array[i]);
            if (counter > count) {
                name = array[i];
                count = counter;
            }
        }
        String result = "Most frequent word is: " + name + ". This word repeated " + count + " times.";
        return result;
    }
}
