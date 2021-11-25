package com.javaguru.teacher.lesson_10_interfaces.lessoncode;

import java.util.Scanner;

class UserConsoleInput {

    UserInputDTO getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int a = scanner.nextInt();
        System.out.println("Please enter second number:");
        int b = scanner.nextInt();
        return new UserInputDTO(a, b);
    }
}
