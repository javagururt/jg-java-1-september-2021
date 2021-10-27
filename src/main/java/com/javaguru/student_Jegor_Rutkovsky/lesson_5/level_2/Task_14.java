package com.javaguru.student_Jegor_Rutkovsky.lesson_5.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;
@CodeReview(approved = true)
class Task_14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        double sumArray = 0;
        double average;
        Random randomGenerator = new Random();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = randomGenerator.nextInt(10);
            sumArray += numbers[i];
        }
        average = sumArray / numbers.length;
        System.out.println("Массив со случайными числами: " + Arrays.toString(numbers));
        System.out.println("Сумма всех чисел из массива = " + sumArray);
        System.out.println("Среднее значение из массива = " + average);
    }
}
