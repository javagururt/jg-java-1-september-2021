package com.javaguru.student_ruslan_pankratov.lesson_5.level_7;

import com.javaguru.student_ruslan_pankratov.lesson_5.level_5.ArrayUtil;

import java.util.Scanner;

//super_task_1
class ArrayOfNumberRefactoring {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите размер массива");
        int num = scanner.nextInt();
        System.out.println("Напишите ваши числа массива");
        int[] result = arrayUtil.createArray(num);
        for (int i = 0; i < result.length; i++) {
            result[i] = scanner.nextInt();
        }
        arrayUtil.printArrayToConsole(result);
    }
}
