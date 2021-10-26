package com.javaguru.student_Jegor_Rutkovsky.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Random randomGenerator = new Random();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = randomGenerator.nextInt(10);
            System.out.println("["  +i+ "] = " +numbers[i]);
        }
        System.out.println("Массив со случайными числами: " + Arrays.toString(numbers));
        System.out.println();

        for (int i = 0; i < numbers.length; i++){
            numbers[i] += 2;
            System.out.println("["  +i+ "] = " +numbers[i]);
        }
        System.out.println("К каждому случайному числу прибавили 2: " + Arrays.toString(numbers));
    }
}
