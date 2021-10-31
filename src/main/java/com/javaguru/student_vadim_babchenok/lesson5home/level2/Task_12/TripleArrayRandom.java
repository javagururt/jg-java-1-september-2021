package com.javaguru.student_vadim_babchenok.lesson5home.level2.Task_12;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;

/*Написать программу, в которой:
        - создать массив целых чисел длиной 3,
        - заполнить каждую ячейку массива случайным числом,
        - вывести значение каждой ячейки на консоль.*/
@CodeReview(approved = true)
public class TripleArrayRandom {
    public static void main(String[] args) {
        int[] nums = new int[3];
        Random rand = new Random();

        for (int a = 0; a < nums.length; a++) {
            nums[a] = rand.nextInt(10);
            System.out.println("nums[" + a + "] = " + nums[a]);
        }
    }
}