//Напишите программу, в которой:
// - запросите у пользователя с консоли длину массива
// - создайте массив указанной пользователем длины
// - заполните массив случайными числами
// - распечатайте на консоль все элементы массива.



package com.javaguru.student_rodions_sokolovs.lesson_5.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
import java.util.Scanner;
@CodeReview(approved = true)
public class Task_26 {
    public static void main(String[] args) {
        System.out.println("Write array: ");
        Random randomgenerator = new Random();
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        System.out.println("Аrray: ");
        int[] size = new int[numb];
        for (int i = 0; i < size.length; i++) {
            size[i] = randomgenerator.nextInt(100);
        }
        System.out.println("Your array: ");
        for (int result : size) {
            System.out.print(result + " ");
        }

    }

}

