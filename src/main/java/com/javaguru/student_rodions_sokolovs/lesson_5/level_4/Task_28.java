//Напишите программу, в которой:
//        - создайте массив произвольной длины
//        - заполните массив случайными числами
//        - распечатайте на консоль все элементы массива
//        - найдите наименьшее число в массиве и выведите его на консоль.

package com.javaguru.student_rodions_sokolovs.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task_28 {
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
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
            }
        }
        System.out.println("Min number is : " + max);
    }
}
