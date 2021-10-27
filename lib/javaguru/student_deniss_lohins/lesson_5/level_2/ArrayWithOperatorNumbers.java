package com.javaguru.student_deniss_lohins.lesson_5.level_2;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.
 */
@CodeReview(approved = true)
class ArrayWithOperatorNumbers {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.print("Please enter array[" + i + "] value :");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
