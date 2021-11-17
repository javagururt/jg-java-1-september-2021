package com.javaguru.student_jekaterina_ola.lesson_5.level_4_junior.Task_26;
//Напишите программу, в которой:
//        - запросите у пользователя с консоли длину массива
//        - создайте массив указанной пользователем длины
//        - заполните массив случайными числами
//        - распечатайте на консоль все элементы массива.


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args){
        System.out.println("Please enter array length: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = randomGenerator.nextInt(50);
        }
        System.out.println(Arrays.toString(array));

    }
}