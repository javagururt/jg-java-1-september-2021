package com.javaguru.student_jekaterina_ola.lesson_5.level_2_intern.Task_14;

//Написать программу, в которой:
//        - создать массив целых чисел длиной 3,
//        - заполнить каждую ячейку массива случайным числом,
//        - посчитать среднее значение и вывести его на консоль.

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;
@CodeReview(approved = true)
public class ArrayTask14 {
    public static void main (String[] args){
        int[] numbers = new int[3];
        double sumArrays = 0;
        double average;

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
            sumArrays += numbers[i];
        }

        average = sumArrays / numbers.length;
        System.out.println("Random numbers generator: " + Arrays.toString(numbers));
        System.out.println("Sum of all numbers: " + sumArrays);
        System.out.println("Average of all numbers: " + average);

    }
}
