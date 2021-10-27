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
        Random rand = new Random();

        for (int a=0; a<nums.length; a++) { //zapolnaet znachenija massiva
            nums[a] = rand.nextInt(10);
            System.out.println(" значение ячейки равно " + nums[a]);
        }

        for (int a=0; a<nums.length; a++) { //kazduju jaicheku * 2
            nums[a] = nums[a]*2;
            System.out.println("Удвоенное значение ячейки равно " + nums[a]);
        }
    }
}
