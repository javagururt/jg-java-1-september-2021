package com.javaguru.student_vadim_babchenok.lesson5home.level2.task_14;

import java.util.Random;

/*Написать программу, в которой:
        - создать массив целых чисел длиной 3,
        - заполнить каждую ячейку массива случайным числом,
        - посчитать среднее значение и вывести его на консоль.*/
public class AverageInTheArray {
    public static void main(String[] args) {

        int[] nums = new int[3];
        int sum = 0;
        Random rand = new Random();

        for (int a=0; a<nums.length; a++) {
            nums[a] = rand.nextInt(10);
            sum=sum+nums[a];
            System.out.println("Значение ячейки равно " + nums[a] + ", а сумма равна " + sum);
        }

        double average = (double) sum/nums.length;

        System.out.println("Среднее значение равно " + average  );
    }
}
