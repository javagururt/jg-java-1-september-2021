package com.javaguru.student_rodions_sokolovs.lesson_6.level_3;
//Добавьте в класс ArrayUtil метод для проверки сколько раз содержит массив целых чисел указынное число.
//Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализация метода работает правильно.

//Добавьте в класс ArrayUtil метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.
//Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализация метода работает правильно.

//Добавьте в класс ArrayUtil метод для замены вхождений указанного числа в массиве целых чисел на другое число.
//Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализация метода работает правильно.

import com.javaguru.teacher.codereview.CodeReview;

//Добавьте в класс ArrayUtil метод для переворота массива целых чисел.
//Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализация метода работает правильно.
@CodeReview(approved = true)
public class ArrayUtil {
    public boolean Full(int numb, int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numb) {
                result = true;
                break;
            }
        }
        return result;
    }

    public int Full2(int numb, int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numb) {
                count++;
            }
        }
        return count;
    }

    public boolean Replace1(int numb, int newnumb, int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numb) {
                array[i] = newnumb;
                result = true;
            }
        }
        return result;
    }

    public int ReplaceAll(int numb, int newnumb, int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numb) {
                array[i] = newnumb;
                result = result + 1;
            }
        }
        return result;
    }

    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public void Sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = array[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i + 1; j < array.length; j++) {
                //Если находим, запоминаем его индекс
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }
}