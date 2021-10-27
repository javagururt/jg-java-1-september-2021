package com.javaguru.student_nikita_simans.homework.lesson_5;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class RandomArrayWithUserDefinedLength {
    public static void main(String[] args) {
        System.out.println("Please enter array length: ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = (int) (Math.random() * 100);

        }

        for (int i = 0; i < arrayLength; i++) {
            System.out.println(numbers[i]);

        }
    }
}
