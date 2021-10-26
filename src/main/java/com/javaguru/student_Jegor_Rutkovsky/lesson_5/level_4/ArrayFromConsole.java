package com.javaguru.student_Jegor_Rutkovsky.lesson_5.level_4;

import java.util.Scanner;
import java.util.Arrays;

class ArrayFromConsole {
    public static void main(String[] args) {
        System.out.println("Enter array length:");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i=0; i < array.length; i++){
            System.out.println("Enter number for array[" +i+ "]:");
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));
    }
}
