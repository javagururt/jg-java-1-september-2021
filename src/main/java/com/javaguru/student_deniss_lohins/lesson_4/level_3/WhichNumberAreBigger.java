package com.javaguru.student_deniss_lohins.lesson_4.level_3;

import java.util.Scanner;

class WhichNumberAreBigger {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please, enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Please, enter third number: ");
        int thirdNumber = scanner.nextInt();


        if(firstNumber >= secondNumber && secondNumber >= thirdNumber){
            System.out.println(firstNumber);
        }else if(firstNumber < secondNumber && secondNumber > thirdNumber){
            System.out.println(secondNumber);
        }else if(firstNumber < secondNumber && secondNumber < thirdNumber){
            System.out.println(thirdNumber);
        }else{
            System.out.println("Numbers are equal");
        }

    }
}
