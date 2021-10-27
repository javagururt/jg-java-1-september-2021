package com.javaguru.student_mihails_mihejevs.lesson_5.level_4_junior;
/*
Task_30
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведите их на консоль.
 */

import java.util.Arrays;
import java.util.Random;

public class ArrayLengthOfAdminNumberOfRandomOdd {

    public static void main(String[] args) {
        int[] array = new int[5];
        Random number = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = number.nextInt(1000);
        }
        System.out.println();
        System.out.println("Array[" + array.length + "]: " + Arrays.toString(array));
        System.out.print("Odd number of array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print("  " + array[i]);
            }
        }
        System.out.println();
    }
}
