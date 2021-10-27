package com.javaguru.student_dmitrii_faierberg.lesson_5.level_4_junior;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class ArrayWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Elements are: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


    }
}
