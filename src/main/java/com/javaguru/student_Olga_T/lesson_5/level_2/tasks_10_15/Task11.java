package com.javaguru.student_Olga_T.lesson_5.level_2.tasks_10_15;

import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        Scanner scanner = new Scanner(System.in);

        for ( int i = 0; i < myArray.length; i++) {
            System.out.println("Please enter " + (i + 1) + " number: ");
            myArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("bestOfArrays [" + i + "] = " + myArray[i]);
        }
    }

}
