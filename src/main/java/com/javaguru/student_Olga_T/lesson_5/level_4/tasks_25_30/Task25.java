
package com.javaguru.student_Olga_T.lesson_5.level_4.tasks_25_30;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task25 {
    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner(System.in);
        System.out.println("Please enter arrays length: ");
        int userNumber = scannerNumber.nextInt();
        int[] userArray = new int[userNumber];
        System.out.println("Your entered number " + userNumber + ".");
        System.out.println("Now you need to enter as many numbers as you indicated in the entered number.");
        System.out.println("Do you want to continue or do you want to change the number?");
        System.out.println("Please enter 'Y' if you want to continue or please enter 'N' if you want to change the number.");
        System.out.println("Please enter your answer: 'Y'/'N' (no quotation marks, just enter a letter):");
        Scanner scannerLetter = new Scanner(System.in);
        String userAnswer = scannerLetter.nextLine();

        if (userAnswer.equals("Y") || userAnswer.equals("y")) {
            System.out.println("Your entered number was " + userNumber + ". You need to enter " + userNumber + " numbers.");
            for (int i = 0; i < userArray.length; i++) {
                System.out.println("Please enter " + (i + 1) + " number: ");
                userArray[i] = scannerNumber.nextInt();
            }

            for (int i = 0; i < userArray.length; i++) {
                System.out.println("userArray [" + i + "] = " + userArray[i]);
            }

        } else if (userAnswer.equals("N") || userAnswer.equals("n")) {
            System.out.println("Good bye. Restart the program.");
        }


    }
}

