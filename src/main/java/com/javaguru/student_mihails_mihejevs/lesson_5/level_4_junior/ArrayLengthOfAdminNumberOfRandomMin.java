package com.javaguru.student_mihails_mihejevs.lesson_5.level_4_junior;
/*
Task_28
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведите его на консоль.
 */

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;
@CodeReview(approved = true)
public class ArrayLengthOfAdminNumberOfRandomMin {

    public static void main(String[] args) {
        int minOfArray = 0;
        int[] array = new int[4];
        Random number = new Random();
        for (int i=0; i < array.length; i++) {
            array[i] = number.nextInt(1000);
            minOfArray = array[0] ;
            if (minOfArray > array[i]) {
                minOfArray = array[i];
            }
        }
        System.out.println();
        System.out.println("Array[" + array.length + "]: " + Arrays.toString(array));
        System.out.println("Min element of array: " + minOfArray);
    }
}
