package com.javaguru.student_deniss_lohins.lesson_4.level_2;

import java.util.Scanner;

class NumberComparison {

    private int firstNumber;
    private int secondNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please, enter second number: ");
        int secondNumber = scanner.nextInt();
        if(firstNumber != secondNumber){
            System.out.println("Numbers are different");
        }else{
            System.out.println("Numbers are equals");
        }
    }
}
