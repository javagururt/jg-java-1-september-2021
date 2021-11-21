package com.javaguru.student_jekaterina_ola.lesson_5.level_5_middle.Task_31_33;

//Создайте в этом классе метод для создания
//        массива целых чисел указанной длины.
//В этом классе напишите автоматический тест
//        метода int[] createArray(int arrayLength)
//заполнения массива целых чисел случайными числами.

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
    }
