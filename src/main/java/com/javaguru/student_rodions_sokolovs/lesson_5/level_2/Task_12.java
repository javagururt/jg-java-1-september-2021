//Написать программу, в которой:
//        - создать массив целых чисел длиной 3,
//        - заполнить каждую ячейку массива случайным числом,
//        - вывести значение каждой ячейки на консоль.
package com.javaguru.student_rodions_sokolovs.lesson_5.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
public class Task_12 {
    public static void main(String[] args) {
        int[] numb = new int[3];
        Random randomgenerator = new Random();
        for (int i = 0; i < numb.length; i++) {
            numb[i] = randomgenerator.nextInt(100);
        }
        for (int i = 0; i < numb.length; i++) {
            System.out.println("numb[" + i + "] = " + numb[i]);
        }


    }
}
