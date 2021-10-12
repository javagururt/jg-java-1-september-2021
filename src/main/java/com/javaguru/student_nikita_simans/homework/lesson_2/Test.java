package com.javaguru.student_nikita_simans.homework.lesson_2;


public class Test {
    public static void main(String[] args) {
        String cardNumber = "001123123123";
        int i = Integer.parseInt(cardNumber.trim());
        int lastFourCharacters = i % 10000;
        System.out.println(i);
        System.out.println("********" + lastFourCharacters);
    }
}
