package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_3_intern;

import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {

        System.out.println("Please enter first number: ");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        System.out.println("Please enter second number: ");
        int secondNum = sc.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNum = sc.nextInt();

        if (firstNum > secondNum && firstNum > thirdNum){
            System.out.println("The greatest number is: " + firstNum);
        }else if (secondNum > firstNum && secondNum > thirdNum){
            System.out.println("The greatest number is: " + secondNum);
        }else
            System.out.println("The greatest number is: " + thirdNum);
    }
}
