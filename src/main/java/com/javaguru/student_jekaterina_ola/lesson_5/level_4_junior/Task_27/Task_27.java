package com.javaguru.student_jekaterina_ola.lesson_5.level_4_junior.Task_27;

//Напишите программу, в которой:
//        - создайте массив произвольной длины
//        - заполните массив случайными числами
//        - распечатайте на консоль все элементы массива
//        - найдите наибольшее число в массиве и выведите его на консоль.

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;
@CodeReview(approved = true)
public class Task_27 {
    public static void main (String[] args){
        int maxOfArray = 0;
        int[] array = new int[5];
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = randomGenerator.nextInt(50);
            if (maxOfArray < array[i]){
                maxOfArray = array[i];
            }
        }
        System.out.println("Array["+array.length+"]" + Arrays.toString(array));
        System.out.println("Max number of array " + maxOfArray);
    }

}
