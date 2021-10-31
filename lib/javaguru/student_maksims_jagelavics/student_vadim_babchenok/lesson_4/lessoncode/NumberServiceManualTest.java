package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson_4.lessoncode;

import java.util.Scanner;

class NumberServiceManualTest {

    public static void main(String[] args) {
        NumberService service = new NumberService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number:");
        int secondNumber = scanner.nextInt();

        int max = service.maxOf(firstNumber, secondNumber);

        System.out.println("Result = " + max);
    }
}
