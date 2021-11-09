package com.javaguru.student_jekaterina_ola.lesson_5.level_2_intern.Task_15;

//Написать программу, в которой:
//        - создать массив целых чисел длиной 3,
//        - заполнить каждую ячейку массива случайным числом,
//        - вывести значение каждой ячейки на консоль,
//        - увеличить значение каждой ячейки на 2,
//        - вывести значение каждой ячейки на консоль.

import java.util.Arrays;
import java.util.Random;

public class ArrayTask15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + 2);
        }
    }
}
