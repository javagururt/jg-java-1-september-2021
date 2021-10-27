package com.javaguru.student_Jegor_Rutkovsky.lesson_5.level_4;
//Напишите программу, в которой:
//- запросите у пользователя с консоли длину массива
//- создайте массив указанной пользователем длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива.
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
@CodeReview(approved = true)
class ArrayFromConsoleRandom {
    public static void main(String[] args) {
        System.out.println("Enter array length:");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        Random randomGenerator = new Random();
        for (int i=0; i < array.length; i++){
            array[i] = randomGenerator.nextInt(10); // диапазон случайных чисел(10): 0-9
        }

        System.out.println(Arrays.toString(array));
    }
}
