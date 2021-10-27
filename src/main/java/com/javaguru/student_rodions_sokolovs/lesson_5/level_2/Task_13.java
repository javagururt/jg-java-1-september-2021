//Написать программу, в которой:
// - создать массив целых чисел длиной 3,
// - заполнить каждую ячейку массива случайным числом,
// - посчитать сумму всех ячеек и вывести ее на консоль.


package com.javaguru.student_rodions_sokolovs.lesson_5.level_2;

import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {
        System.out.println("Task 12");
        int[] numb = new int[3];
        Random randomgenerator = new Random();
        for (int i = 0; i < numb.length; i++) {
            numb[i] = randomgenerator.nextInt(100);
        }
        for (int i = 0; i < numb.length; i++) {
            System.out.println("numb[" + i + "] = " + numb[i]);
        }
        System.out.println("Task 13");

        int sum = 0;
        for (int array : numb) {
            sum = sum + array;
        }
        System.out.println("Sum of arrays = " + sum);

        System.out.println("Task 14");

        double average = sum / numb.length;
        System.out.println("Average of arrays = " + average);

        System.out.println("Task 15");

        for (int i = 0; i < numb.length; i++) {
            numb[i] = numb[i] + 2;
            System.out.println("numb[" + i + "] = " + numb[i]);
        }
    }
}
