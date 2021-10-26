package com.javaguru.student_mihails_mihejevs.lesson_5.level_2_intern;
/*
Task_13
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать сумму всех ячеек и вывести ее на консоль.
 */
import java.util.Random;

public class SumOfThreeIntegerOfRandom {

    public static void main(String[] args) {

        int sum = 0;

        int[] inputThreeIntegerOfRandom = new int[3];
        Random randomGenerator = new Random();
            for (int i = 0; i < inputThreeIntegerOfRandom.length; i++) {
                inputThreeIntegerOfRandom[i] = randomGenerator.nextInt(1000);
                sum = inputThreeIntegerOfRandom[i] + sum;
        }
            System.out.println(sum);
    }
}