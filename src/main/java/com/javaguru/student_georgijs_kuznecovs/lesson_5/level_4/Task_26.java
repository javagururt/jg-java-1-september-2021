package com.javaguru.student_georgijs_kuznecovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task_26 {
    public static void main(String[] args) {
        TaskService service = new TaskService();

//        service.userInsertArrayLength(array); - NE POLUCHAETSJA VINESTI V OTDELJNIJ KLASS TASKSERVICE

        System.out.println("Please insert the length of array : ");
        Scanner sc = new Scanner(System.in);
        int array = sc.nextInt();

        int[] numbers = new int[array];

        service.randomizer(numbers);


        System.out.println(Arrays.toString(numbers));

    }
}
