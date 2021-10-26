package com.javaguru.student_vadim_babchenok.lesson5home.level2.Task_13;

import java.util.Random;

/*Написать программу, в которой:
        - создать массив целых чисел длиной 3,
        - заполнить каждую ячейку массива случайным числом,
        - посчитать сумму всех ячеек и вывести ее на консоль.*/
public class TripleRandomSumma {
    public static void main(String[] args) {
        int[] nums = new int[3];
        int sum = 0;
        Random rand = new Random();

        for (int a=0; a<nums.length; a++) {
            nums[a] = rand.nextInt(10);
            sum=sum+nums[a];
            System.out.println("Значение равно " + nums[a]);
        }

        System.out.println("Сумма равна " + sum );
        }
}

