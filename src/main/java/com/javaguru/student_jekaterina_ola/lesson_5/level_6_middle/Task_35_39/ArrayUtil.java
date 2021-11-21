package com.javaguru.student_jekaterina_ola.lesson_5.level_6_middle.Task_35_39;

//Создайте в классе ArrayUtil метод для
//        распечатки массива целых чисел на консоль.
//нахождения максимального числа в массиве целых чисел.
//нахождения минимального числа в массиве целых чисел.

import java.util.Random;

public class ArrayUtil {
    Random random = new Random();

    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public int[] fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = 1 + random.nextInt(50 - 1);
        return array;
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array [" + i + "] = " + array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public int findMinNumber(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
