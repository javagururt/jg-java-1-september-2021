//Напишите программу, в которой:
//        - создайте массив произвольной длины
//        - заполните массив случайными числами
//        - распечатайте на консоль все элементы массива
//        - найдите все чётные числа в массиве и выведите их на консоль.


package com.javaguru.student_rodions_sokolovs.lesson_5.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
import java.util.Scanner;
@CodeReview(approved = true)
public class Task_29 {
    public static void main(String[] args) {
        System.out.println("Write array: ");
        Random randomgenerator = new Random();
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int[] array = new int[numb];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomgenerator.nextInt(100);
            System.out.println("array[" + i + "] = " + array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Even number: " + array[i]);
            }
        }
    }
}

