package com.javaguru.student_mihails_mihejevs.lesson_5.level_4_junior;
/*
Task_26
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 */
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
@CodeReview(approved = true)
public class ArrayLengthOfUserNumberOfRandom {

    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.print("Please enter array length: ");
        Scanner input = new Scanner(System.in);
        int[] array = new int[input.nextInt()];
        Random number = new Random();
        for (int i=0; i < array.length; i++) {
            array[i] = number.nextInt(1000);
        }
    System.out.println();
    System.out.println("Array[" + array.length + "]: " + Arrays.toString(array));
    }
}
