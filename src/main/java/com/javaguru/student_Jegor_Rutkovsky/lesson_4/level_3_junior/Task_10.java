package com.javaguru.student_Jegor_Rutkovsky.lesson_4.level_3_junior;
//выводит на консоль наибольшее из них.



import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Second Number");
        int secondNumber = scanner.nextInt();
        System.out.println("Third Number");
        int thirdNumber = scanner.nextInt();
        int max = maxOfThree(firstNumber, secondNumber, thirdNumber);
        System.out.println("Max number is " + max);
    }

    public static int maxOfThree(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        }
        else if (firstNumber == secondNumber && firstNumber > thirdNumber){
            return  firstNumber;
        }
        else {
            return thirdNumber;
        }
    }
}


