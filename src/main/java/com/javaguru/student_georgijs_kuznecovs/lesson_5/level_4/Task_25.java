package com.javaguru.student_georgijs_kuznecovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        TaskService service = new TaskService();

        System.out.println("Please insert the length of array : ");
        Scanner sc = new Scanner(System.in);
        int array = sc.nextInt();

        int[] numbers = new int[array];

        service.userInsertNumber(numbers);

        System.out.println(Arrays.toString(numbers));

    }
}
