package com.javaguru.student_jekaterina_ola.lesson_5.level_4_junior;

//Напишите программу, в которой:
//        - запросите у пользователя с консоли длину массива
//        - создайте массив указанной пользователем длины
//        - заполните массив числами полученными от пользователя
//        - распечатайте на консоль все элементы массива.

import java.util.Scanner;

public class Task_25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[i] " + " ");
        }
    }
}


