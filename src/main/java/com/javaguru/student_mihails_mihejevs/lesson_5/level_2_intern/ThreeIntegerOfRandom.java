package com.javaguru.student_mihails_mihejevs.lesson_5.level_2_intern;
/*
Task_12
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль.
 */
import java.util.Random;

public class ThreeIntegerOfRandom {

    public static void main(String[] args) {

        int[] inputThreeIntegerOfRandom = new int[3];

        Random randomGenerator = new Random();
        for (int i = 0; i < inputThreeIntegerOfRandom.length; i++) {
            inputThreeIntegerOfRandom[i] = randomGenerator.nextInt(1000);
            System.out.println(inputThreeIntegerOfRandom[i]);
        }
    }
}
