package com.javaguru.student_vadim_babchenok.lesson5home.level2.task_11;

import java.util.Scanner;

/*Написать программу, в которой:
        - создать массив целых чисел длиной 3,
        - заполнить каждую ячейку массива числом, запрошенным у пользователя,
        - вывести значение каждой ячейки на консоль.*/
public class TripleArrayPlus {
    public static void main(String[] args) {
        int[] nums = new int[3];
        Scanner scan = new Scanner(System.in);
        for (int a = 0; a < nums.length; a++) { //принимает три итерации длины массива
            System.out.println("Введите " + a + " значение");
            nums[a] = scan.nextInt();//предлагает ввести число
        }

        for (int a = 0; a < nums.length; a++) {
            System.out.println("nums[" + a + "] = " + nums[a]);
        }
    }
}