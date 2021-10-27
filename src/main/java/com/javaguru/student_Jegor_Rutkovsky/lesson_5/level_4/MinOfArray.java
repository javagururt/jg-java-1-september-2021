package com.javaguru.student_Jegor_Rutkovsky.lesson_5.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;

//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите наименьшее число в массиве и выведите его на консоль.
//  Task_28
@CodeReview(approved = true)
class MinOfArray {
    public static void main(String[] args) {
        int minOfArray;
        int[] array = new int[5];
        Random random = new Random();
        for (int i=0; i<array.length; i++){
            array[i] = random.nextInt(101);
            }
        minOfArray = array[0];
        for (int i=0; i<array.length; i++){
            if (minOfArray >= array[i]){
                minOfArray = array[i];
            }
        }
        System.out.println("Array["+array.length+"]: " + Arrays.toString(array));
        System.out.println("Min number of array is " +minOfArray);
    }
}
