package com.javaguru.student_Jegor_Rutkovsky.lesson_5.level_4;
//Напишите программу, в которой:
//- создайте массив произвольной длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива
//- найдите наибольшее число в массиве и выведите его на консоль.
//  Task_27
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;
@CodeReview(approved = true)
class MaxOfArray {
    public static void main(String[] args) {
        int maxOfArray = 0;
        int[] array = new int[5];
        Random random = new Random();
        for (int i=0; i<array.length; i++){
            array[i] = random.nextInt(101);
            if (maxOfArray < array[i]){
                maxOfArray = array[i];
            }
        }
        System.out.println("Array["+array.length+"]: " + Arrays.toString(array));
        System.out.println("Max number of array is " +maxOfArray);
    }
}
