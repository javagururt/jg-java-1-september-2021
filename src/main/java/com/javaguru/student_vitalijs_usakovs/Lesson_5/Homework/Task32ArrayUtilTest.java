package com.javaguru.student_vitalijs_usakovs.Lesson_5.Homework;

import java.util.Arrays;
import java.util.Random;

class Task32ArrayUtilTest {

    public static void main(String[] args) {
        Task32ArrayUtilTest test = new Task32ArrayUtilTest();
//        test.printArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }


    public void printArrayWithRandomNumbers() {
//       Task31ArrayUtil print = new Task31ArrayUtil();
//       int[] array = new int[5];
//       if (print.printArrayToConsole() == array) ;
//       return true;
    }


    public void shouldFindMaxNumber() {
        Task31ArrayUtil victim = new Task31ArrayUtil();
        int[] array = {12, 23, 46, 92, 88};
        if (victim.findMaxNumber(array) == 92) {
            System.out.println("ShouldFindMaxNumber - OK!");
        } else {
            System.err.println("ShouldFindMaxNumber - FAILED!");
        }
    }

    public void shouldFindMinNumber() {
        Task31ArrayUtil victim = new Task31ArrayUtil();
        int[] array = {12, 23, 46, 92, 88};
        if (victim.findMinNumber(array) == 12) {
            System.out.println("ShouldFindMinNumber - OK!");
        } else {
            System.err.println("ShouldFindMinNumber - FAILED!");
        }
    }
}


//Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализация метода работает правильно.
/*    public void shouldFindCorrectExistingNumber() {
        Task31ArrayUtil victim = new Task31ArrayUtil();

    }
 */