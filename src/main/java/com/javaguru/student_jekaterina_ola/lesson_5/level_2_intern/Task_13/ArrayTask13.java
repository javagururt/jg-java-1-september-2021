package com.javaguru.student_jekaterina_ola.lesson_5.level_2_intern.Task_13;

//Написать программу, в которой:
//        - создать массив целых чисел длиной 3,
//        - заполнить каждую ячейку массива случайным числом,
//        - посчитать сумму всех ячеек и вывести ее на консоль.

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;
@CodeReview(approved = true)
public class ArrayTask13 {
    public static void main (String[] args){
        int[] numbers = new int[3];
        int sumArrays = 0;

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
            sumArrays += numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum of all arrays:" + sumArrays);
    }
}
