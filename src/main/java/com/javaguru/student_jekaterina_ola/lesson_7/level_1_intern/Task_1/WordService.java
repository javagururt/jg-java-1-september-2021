package com.javaguru.student_jekaterina_ola.lesson_7.level_1_intern.Task_1;

import com.javaguru.teacher.codereview.CodeReview;

//Hаписать метод, который найдёт слово,
//        которое в тексте встречается больше всего раз
@CodeReview(approved = true)
public class WordService {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String sampleText = new String("Не напрасно дули ветры, Не напрасно шла гроза");
        String word = wordService.findMostFrequentWord(sampleText);
        System.out.println("Max wod count = " + word + " times");
    }

    public String findMostFrequentWord(String text) {
        String addCharactersRemoval = text.trim();                  //без разделительных знаков
        String[] newString = addCharactersRemoval.split(" ");
        String maxWordCount = newString[0];                         //макс число встречающихся слов
        int maxCount = 0;

        for (int i = 0; i < newString.length; i++){
            int count = wordCount (newString, newString[i]);
            if (count > maxCount){
                maxCount = count;
                maxWordCount = newString[i];
            }
            if (count == 1){
                System.out.println("newString [" + i + "] = '" + newString[i] + "' " + count + " times.");
            } else {
                System.out.println("newString [" + i + "] = '" + newString[i] + "' " + count + " times.");
            }
        }
        return " '" + maxWordCount + " '" + maxCount;
    }

    public int wordCount (String[] textArray, String word){

        int times  = 0;
        for (int i = 0; i < textArray.length; i++){
            if (textArray[i].equals(word)){
                times++;
            }
        }
        return times;
    }
}