package com.javaguru.student_jekaterina_ola.lesson_7.level_6_middle.Task_10_12;

import com.javaguru.teacher.codereview.CodeReview;

//Разработать класс с методом, который копирует числа в заданном диапазоне
//        из одного массива в другой:
//
//        int[] copyInRange(int[] in, int numberFrom, int numberTo)
//
//        Данный метод должен вернуть новый массив, который содержит
//        только те числа, которые больше или равны numberFrom и меньше или равны numberTo.
//        Размер выходного массива должен быть равен количеству элементов в нём.
@CodeReview(approved = true)
public class ArrayCopy {

    int[] copyInRange (int[] in, int numberFrom, int numberTo) {
        int size = 0;

        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom) {
                size++;
            } else if (in[i] <= numberTo) {
                size++;
            }
        }

        int[] result = new int[size];
        int filled = 0;

        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom) {
                result[filled] = in[i];
                filled++;
            } else if (in[i] <= numberTo) {
                result[filled] = in[i];
                filled++;
            }
        }
        return result;
    }
}
