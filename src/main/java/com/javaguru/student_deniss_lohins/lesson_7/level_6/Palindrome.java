package com.javaguru.student_deniss_lohins.lesson_7.level_6;


import java.lang.*;


class Palindrome {

    boolean isPalindrome(String text) {
        String testString = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder reverse = new StringBuilder();
        reverse.append(testString);
        reverse.reverse();
        String reverseString = reverse.toString();
        char[] cleanChar = testString.toCharArray();
        if(cleanChar.length == 0){
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

