package com.javaguru.student_nikita_simans.homework.lesson_5;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class ByUserGeneratedArray {
    public static void main(String[] args) {
        System.out.println("Please enter array length: ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Please enter number № " + (i + 1));
            numbers[i] = scanner.nextInt();;

        }

        for (int i = 0; i < arrayLength; i++) {
            System.out.println(numbers[i]);

        }
    }
}
