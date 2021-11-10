package com.javaguru.student_jekaterina_ola.lesson_5.level_2_intern.Task_11;

//Написать программу, в которой:
// - заполнить каждую ячейку массива числом, запрошенным у пользователя,
// - вывести значение каждой ячейки на консоль.
// - создать массив целых чисел длиной 3,

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Arrays;
import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(teacher = "используется только 1 сканнер")
public class ArrayTask11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        System.out.println("Please enter first number:");
        Scanner scanner = new Scanner(System.in);
        numbers[0] = scanner.nextInt();
        System.out.println("Please enter second number:");
        Scanner scanner1 = new Scanner(System.in);
        numbers[1] = scanner.nextInt();
        System.out.println("Please enter third number:");
        Scanner scanner2 = new Scanner(System.in);
        numbers[2] = scanner.nextInt();

        System.out.println(Arrays.toString(numbers));

    }
}