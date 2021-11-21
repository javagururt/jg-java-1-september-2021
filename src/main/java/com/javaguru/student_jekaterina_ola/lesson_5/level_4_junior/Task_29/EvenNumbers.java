package com.javaguru.student_jekaterina_ola.lesson_5.level_4_junior.Task_29;

//Напишите программу, в которой:
//        - создайте массив произвольной длины
//        - заполните массив случайными числами
//        - распечатайте на консоль все элементы массива
//        - найдите все чётные числа в массиве и выведите их на консоль.

import java.util.Arrays;
import java.util.Random;

public class EvenNumbers {
    public static void main(String[] args) {
        int minOfArray = 0;
        int[] array = new int[5];
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(50);
        }
        System.out.println("Array[" + array.length + "]" + Arrays.toString(array));
        for (int i=0; i < array.length; i++){
            if (array[i] % 2 == 0);
            System.out.println("Even numbers of array " + array[i]);
        }
    }
}
