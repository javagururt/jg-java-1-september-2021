//Write a program that accepts three numbers from the user and prints:
//- "increasing" if the numbers are in increasing order,
//- "decreasing" if the numbers are in decreasing order,
//- "Neither increasing or decreasing order" otherwise.
package com.javaguru.student_rodions_sokolovs.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println("First Number: ");
        Scanner scanner = new Scanner(System.in);
        int firstnum = scanner.nextInt();
        System.out.println("Second Number: ");
        int secondnum = scanner.nextInt();
        System.out.println("Third Number: ");
        int thirdnum = scanner.nextInt();

        if ((firstnum < secondnum) & (secondnum < thirdnum)) {
            System.out.println("Increasing");
        } else if ((firstnum > secondnum) & (secondnum > thirdnum)) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
