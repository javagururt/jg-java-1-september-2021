package com.javaguru.teacher.lesson_4.lessoncode;

import java.util.Scanner;

class ConditionalOperatorAnd {

    public static void main(String[] args) {
        System.out.println("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int from = 10;
        int to = 20;

        if (isInRange(number, from, to) || isZero(number)) {
            System.out.println("A");
        }
    }

    private static boolean isZero(int number) {
        return number == 0;
    }

    private static boolean isInRange(int number,
                                     int from,
                                     int to) {
        return number > from && number < to;
    }
}
