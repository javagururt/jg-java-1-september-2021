package com.javaguru.student_ruslan_pankratov.lesson_5.level_7;

import com.javaguru.student_ruslan_pankratov.lesson_5.level_5.ArrayUtil;

import java.util.Scanner;

//super_task_1
class ArrayOfNumberRandomRefactoring {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите размер массива");
        int number = scanner.nextInt();
        int[] result = arrayUtil.createArray(number);
        arrayUtil.fillArrayWithRandomNumbers(result);
    }
}
