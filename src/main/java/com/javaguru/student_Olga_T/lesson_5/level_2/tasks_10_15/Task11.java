package com.javaguru.student_Olga_T.lesson_5.level_2.tasks_10_15;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
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
