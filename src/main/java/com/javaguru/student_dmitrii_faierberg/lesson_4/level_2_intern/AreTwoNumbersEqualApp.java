package com.javaguru.student_dmitrii_faierberg.lesson_4.level_2_intern;

import java.util.Scanner;

class AreTwoNumbersEqualApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) System.out.println("Numbers are equal");
        else System.out.println("Numbers are different");
    }
}
