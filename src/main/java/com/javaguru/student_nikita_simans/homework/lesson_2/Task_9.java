package com.javaguru.student_nikita_simans.homework.lesson_2;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {
        System.out.println("Input a number:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(userInput + " " + "x" + " " + i + " " + "=" + " " + userInput * i);
        }
    }
}
