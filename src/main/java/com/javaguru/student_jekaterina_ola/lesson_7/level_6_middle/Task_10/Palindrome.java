package com.javaguru.student_jekaterina_ola.lesson_7.level_6_middle.Task_10;

//Написать программу, которая определяет, является ли строка палиндромом.
//метод возвращает true, если строка является палиндромом,
//        в противном случае возвращается false.
//
//        Ограничения:
//        - Логику проверки необходимо реализовать при помощи массивов;
//        - Регистр букв (верхний/нижний) при проверке необходимо игнорировать (LeVEl = level);

public class Palindrome {
    public boolean isPalindrome(String text){
        String textString = text.replaceAll("\\s+", " ").toLowerCase();
        StringBuilder reverse = new StringBuilder();
        reverse.append(textString);
        reverse.reverse();
        String reverseString = reverse.toString();
        char[] cleanChar = textString.toCharArray();
        if(cleanChar.length == 0) {
            return false;
        }
        char[] reverseChar = reverseString.toCharArray();
        int count = 0;
        for (int i = 0; i < cleanChar.length; i++) {
            if (cleanChar[i] == reverseChar[i]) {
                count++;
            } else {
                return false;
            }
        }
        if (count == cleanChar.length) {
            return true;
        } else {
            return false;
        }
    }
}
