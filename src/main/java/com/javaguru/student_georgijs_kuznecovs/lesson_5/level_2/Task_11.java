package com.javaguru.student_georgijs_kuznecovs.lesson_5.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Scanner;
@CodeReview(approved = true)
class Task_11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        System.out.println("Please enter first number: ");
        Scanner sc = new Scanner(System.in);
        numbers[0] = sc.nextInt();
        System.out.println("Please enter second number: ");
        numbers[1] = sc.nextInt();
        System.out.println("Please enter third number: ");
        numbers[2] = sc.nextInt();

        System.out.println(Arrays.toString(numbers));
    }
}
