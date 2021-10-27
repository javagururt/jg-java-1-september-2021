package com.javaguru.teacher.lesson_6.lessoncode;

import java.util.Scanner;

class NumberServiceManualTest {

    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number:");
        int number = scanner.nextInt();
        System.out.println("Power:");
        int power = scanner.nextInt();

        int result = numberService.power(number, power);
        System.out.println("Result: " + result);
    }
}
