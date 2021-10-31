package com.javaguru.student_vitalijs_usakovs.Lesson_5.Homework;

import java.util.Random;
import java.util.Scanner;

class Task26UserSuggestRandomNumbers {
    //Task 26

    public static void main(String[] args) {

        System.out.println("Please enter how many number's you want to enter : ");
        Random randomGen = new Random();
        Scanner input = new Scanner(System.in);
        int numberLength = input.nextInt();

        System.out.println("Please enter number's : ");
        int[] length = new int[numberLength];
        for (int i = 0; i < length.length; i++) {
            length[i] = randomGen.nextInt(100);
        }
        System.out.println("You've entered : ");
        for (int result : length) {
            System.out.println(result);
        }
    }
}