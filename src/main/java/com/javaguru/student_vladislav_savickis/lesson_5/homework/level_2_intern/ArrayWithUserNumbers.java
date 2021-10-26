package com.javaguru.student_vladislav_savickis.lesson_5.homework.level_2_intern;

import java.util.Scanner;

class ArrayWithUserNumbers {
    public static void main(String[] args) {

        System.out.println("Guten Tag! Please fill the array.");
        Scanner userInput = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++ ) {
            System.out.println(i+1 +" number: ");
            numbers[i] = userInput.nextInt();
        }
        System.out.println("Values of array with user input numbers:");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
