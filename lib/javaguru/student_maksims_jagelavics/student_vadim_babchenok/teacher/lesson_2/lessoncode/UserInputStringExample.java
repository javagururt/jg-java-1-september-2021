package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.lesson_2.lessoncode;

import java.util.Scanner;

class UserInputStringExample {

    public static void main(String[] args) {
        System.out.println("Hello, please enter something:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Your input = " + userInput);
        if (userInput.equalsIgnoreCase("+")) {
            System.out.println(" WOW ");
        }
    }
}
