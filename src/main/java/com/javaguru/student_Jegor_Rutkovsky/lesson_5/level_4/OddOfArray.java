package com.javaguru.student_Jegor_Rutkovsky.lesson_5.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;

//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите все нечётные числа в массиве и выведите их на консоль.
//  Task_30
@CodeReview(approved = true)
class OddOfArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        for (int i=0; i<array.length; i++){
            array[i] = random.nextInt(101);
        }
        System.out.println("Array["+array.length+"]: " + Arrays.toString(array));
        for (int i=0; i< array.length; i++){
            if (array[i] % 2 != 0){
                System.out.println("Even number of array is " +array[i]);
            }
        }
    }
}
