package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_2_intern;

import java.util.Scanner;

class GreatestNumber {
    public static void main(String[] args) {

        System.out.println("Please enter first number: ");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        System.out.println("Please enter second number: ");
        int secondNum = sc.nextInt();

        if (firstNum > secondNum){
            System.out.println("The greatest number is: " + firstNum);
        }else
            System.out.println("The greatest number is: " + secondNum);
    }
}
