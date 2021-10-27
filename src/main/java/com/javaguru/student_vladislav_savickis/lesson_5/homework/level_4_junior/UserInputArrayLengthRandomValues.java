package com.javaguru.student_vladislav_savickis.lesson_5.homework.level_4_junior;

import java.util.Random;
import java.util.Scanner;

class UserInputArrayLengthRandomValues {
    public static void main(String[] args) {
        int arrayLength;

        Scanner userInput = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Guten Tag! Please set length of the array: ");
        arrayLength = userInput.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++ ) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Values of array:");
        for (int i = 0; i < arrayLength; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
