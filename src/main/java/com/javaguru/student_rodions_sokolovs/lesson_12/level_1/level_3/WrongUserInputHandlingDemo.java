package com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_3;

import java.util.Scanner;

public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean integer = true;
        while (integer) {
            System.out.println("Please enter integer: ");
            String input = scanner.nextLine();
            if (!isNumeric(input)) {
                System.err.println("Retry!: ");
            } else{
                integer = false;
                System.out.println("Congrats!");
            }
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double i = Double.parseDouble(strNum);
        } catch (NumberFormatException i) {
            return false;
        }
        return true;
    }
}
