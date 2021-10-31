package com.javaguru.student_vladislav_savickis.lesson_5.homework.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class UserInputArrayLengthAndValues {
    public static void main(String[] args) {
        int arrayLength;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Guten Tag! Please set length of the array: ");
        arrayLength = userInput.nextInt();
        int[] numbers = new int[arrayLength];
        System.out.println("Please fill the array.");
        for (int i = 0; i < arrayLength; i++ ) {
            System.out.println(i+1 +" number: ");
            numbers[i] = userInput.nextInt();
        }
        System.out.println("Values of array:");
        for (int i = 0; i < arrayLength; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}