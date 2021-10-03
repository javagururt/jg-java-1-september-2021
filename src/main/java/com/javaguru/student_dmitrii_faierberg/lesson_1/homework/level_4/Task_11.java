package com.javaguru.student_dmitrii_faierberg.lesson_1.homework.level_4;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result;
        System.out.println("Enter a + b or a / b (a and b are any numbers:");


        System.out.println("Enter first number:");
        int firstOperand = input.nextInt();

        System.out.println("Enter second number:");
        int secondOperand = input.nextInt();

        System.out.println("Enter the sign:");
        char sign = input.next().charAt(0);

        if (sign == '+') {
            result = firstOperand + secondOperand;
            System.out.println("The result of: " + firstOperand + " + " + secondOperand + " is:\n" +
                    result);
        } else if (sign == '/'){
            result = firstOperand / secondOperand;
            System.out.println("The result of: " + firstOperand + " / " + secondOperand + " is:\n" +
                    result);
        }
    }
}

