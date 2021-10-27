package com.javaguru.student_mihails_mihejevs.lesson_5.level_4_junior;
/*
Task_25
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLengthAndNumberOfUser {

    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.print("Please enter array length: ");
        Scanner input = new Scanner(System.in);
        int[] array = new int[input.nextInt()];
        for (int i=0; i < array.length; i++) {
            System.out.print("Please enter number for array[" + i + "] " + (i+1) + " of " + array.length + ": ");
        array[i] = input.nextInt();
        }
    System.out.println();
    System.out.println("Array[" + array.length + "]: " + Arrays.toString(array));
    }
}
