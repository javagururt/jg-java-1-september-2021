package com.javaguru.student_vadim_babchenok.lesson5home.level2.Task_15;
/*Написать программу, в которой:
        - создать массив целых чисел длиной 3,
        - заполнить каждую ячейку массива случайным числом,
        - вывести значение каждой ячейки на консоль,
        - увеличить значение каж
        дой ячейки на 2,
        - вывести значение каждой ячейки на консоль.*/
import java.util.Random;
import java.util.Scanner;

public class IncreaseArray {
    public static void main(String[] args) {

        int[] nums = new int[3];
        int sum = 0;
        Random rand = new Random();

        for (int a=0; a<nums.length; a++) {
            nums[a] = rand.nextInt(10);
            sum=nums[a]*2;
            System.out.println("Значение ячейки равно " + nums[a] + ", а её двойное значение равно " + sum);
        }


    }
}
