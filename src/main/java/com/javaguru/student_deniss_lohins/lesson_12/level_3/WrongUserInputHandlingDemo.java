package com.javaguru.student_deniss_lohins.lesson_12.level_3;

import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean enteredInteger = true;
        while (enteredInteger) {
            System.out.println("Please enter integer: ");
            String input = scanner.nextLine();
            if (!isNumeric(input)) {
                System.err.println("You made a mistake!");
               } else{
                enteredInteger = false;
                System.out.println("You entered integer. Thank you!");
            }
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
