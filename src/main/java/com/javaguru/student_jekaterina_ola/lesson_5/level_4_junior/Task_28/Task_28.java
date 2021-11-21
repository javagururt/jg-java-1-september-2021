package com.javaguru.student_jekaterina_ola.lesson_5.level_4_junior.Task_28;

//Напишите программу, в которой:
//        - создайте массив произвольной длины
//        - заполните массив случайными числами
//        - распечатайте на консоль все элементы массива
//        - найдите наименьшее число в массиве и выведите его на консоль.

import java.util.Arrays;
import java.util.Random;

public class Task_28 {
    public static void main (String[] args){
        int minOfArray = 0;
        int[] array = new int[5];
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = randomGenerator.nextInt(50);
            if (minOfArray < array[i]){
                minOfArray = array[i];
            }
        }
        System.out.println("Array["+array.length+"]" + Arrays.toString(array));
        System.out.println("Min number of array " + minOfArray);
    }
}

