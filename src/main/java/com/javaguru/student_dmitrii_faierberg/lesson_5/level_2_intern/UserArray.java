package com.javaguru.student_dmitrii_faierberg.lesson_5.level_2_intern;

import java.util.Scanner;

class UserArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        array[2] = scanner.nextInt();
        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
}
