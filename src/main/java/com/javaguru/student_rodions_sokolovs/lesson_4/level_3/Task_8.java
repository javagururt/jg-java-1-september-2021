//Write a Java program that accepts three numbers and prints:
//- "All numbers are equal" if all three numbers are equal,
//- "All numbers are different" if all three numbers are different
//- "Neither all are equal or different" otherwise.
package com.javaguru.student_rodions_sokolovs.lesson_4.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        System.out.println("First Number: ");
        Scanner scanner = new Scanner(System.in);
        int firstnum = scanner.nextInt();
        System.out.println("Second Number: ");
        int secondnum = scanner.nextInt();
        System.out.println("Third Number: ");
        int thirdnum = scanner.nextInt();

        if ((firstnum == secondnum) & (secondnum == thirdnum)) {
            System.out.println("All numbers are equal");
        } else if (firstnum != secondnum && firstnum != thirdnum && secondnum != thirdnum) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}

