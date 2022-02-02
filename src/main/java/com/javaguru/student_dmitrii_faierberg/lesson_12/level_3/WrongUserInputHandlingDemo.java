package com.javaguru.student_dmitrii_faierberg.lesson_12.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.InputMismatchException;
import java.util.Scanner;
@CodeReview(approved = true)
class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter integer");
            try {
                int number = sc.nextInt();
                System.out.println(number);
                break;
            } catch (InputMismatchException exception){
                System.out.println("This is not integer. Try again.");
            }
        } while (true);
    }
}
