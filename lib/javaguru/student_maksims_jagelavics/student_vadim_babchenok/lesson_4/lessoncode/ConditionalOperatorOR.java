package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson_4.lessoncode;

import java.util.Scanner;

class ConditionalOperatorOR {
    public static void main(String[] args) {
        System.out.println("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 10 || number < 20) {
            System.out.println("A");
        }
    }
}
