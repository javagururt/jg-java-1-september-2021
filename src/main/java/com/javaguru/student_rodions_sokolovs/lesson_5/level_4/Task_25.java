//Напишите программу, в которой:
// - запросите у пользователя с консоли длину массива
// - создайте массив указанной пользователем длины
// - заполните массив числами полученными от пользователя
// - распечатайте на консоль все элементы массива.
package com.javaguru.student_rodions_sokolovs.lesson_5.level_4;

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        System.out.println("Write array: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        System.out.println("Аrray: ");
        int[] size = new int[numb];
        for (int i = 0; i < size.length; i++) {
            size[i] = scanner.nextInt();
        }
        System.out.println("Your array: ");
        for (int result : size) {
            System.out.print(result + " ");
        }

    }

}
