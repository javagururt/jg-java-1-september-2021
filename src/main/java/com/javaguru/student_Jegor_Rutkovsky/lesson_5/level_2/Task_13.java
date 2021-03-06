package com.javaguru.student_Jegor_Rutkovsky.lesson_5.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;
@CodeReview(approved = true)
class Task_13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int sumArray = 0;
        Random randomGenerator = new Random();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = randomGenerator.nextInt(10);
            sumArray += numbers[i];
        }
        System.out.println("Массив со случайными числами: " + Arrays.toString(numbers));
        System.out.println("Сумма всех чисел из массива = " + sumArray);
    }
}
