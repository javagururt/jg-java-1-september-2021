package com.javaguru.student_dmitrii_faierberg.lesson_4.level_1_intern;

import java.util.Scanner;

class OddOrEvenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = number % 2 == 0 ? "even" : "odd";
        System.out.println(number + " is " + result);

    }
}
