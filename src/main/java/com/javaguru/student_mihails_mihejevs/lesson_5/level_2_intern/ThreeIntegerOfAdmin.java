package com.javaguru.student_mihails_mihejevs.lesson_5.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

/*
Task_10
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива любым числом,
 - вывести значение каждой ячейки на консоль.

 */
@CodeReview(approved = true)
public class ThreeIntegerOfAdmin {
    public static void main(String[] args) {

        int[] threeInteger = new int[3];
        threeInteger[0] = 14;
        threeInteger[1] = 36;
        threeInteger[2] = 25;

        for(int i = 0; i < threeInteger.length; i++) {
            System.out.println(threeInteger[i]);
        }


    }
}




