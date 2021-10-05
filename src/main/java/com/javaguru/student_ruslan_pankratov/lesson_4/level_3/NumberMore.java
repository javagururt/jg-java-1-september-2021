package com.javaguru.student_ruslan_pankratov.lesson_4.level_3;

import java.util.Scanner;

//Task_10
class NumberMore {
    public static void main(String[] args) {
        System.out.println("Write three integers");
        methodLoop();
    }

    static void methodLoop() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int largestNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largestNumber < arr[i]) {
                largestNumber = arr[i];
            }
        }
        System.out.println(largestNumber);
    }
}