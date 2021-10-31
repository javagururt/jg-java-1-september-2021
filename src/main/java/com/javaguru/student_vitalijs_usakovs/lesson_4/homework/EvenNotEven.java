package com.javaguru.student_vitalijs_usakovs.lesson_4.homework;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class EvenNotEven {

    public static void main(String[] args) {
        System.out.println("Please enter number : ");
        Scanner input = new Scanner(System.in);
        int correctNumber = input.nextInt();

        int evenNumberResult = correctNumber % 2;
         switch (evenNumberResult){
             case 0:
                 System.out.println("You have enteres the an EVEN number.");
                 break;
             default:
                 System.out.println("You have entered NOTEVEN number.");
         }

    }
}
