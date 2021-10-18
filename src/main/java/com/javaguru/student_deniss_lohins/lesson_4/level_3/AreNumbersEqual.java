package com.javaguru.student_deniss_lohins.lesson_4.level_3;

import java.util.Scanner;

class AreNumbersEqual {

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
        if (firstNumber == secondNumber && secondNumber == thirdNumber){
            System.out.println("All numbers are equal");
        }else if(firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }

    }
}
/*
class Comparison(int firstNumber, int secontNumber, int thirdNumber){
    int firstNumber;
    int secondNumber;
    int thirdNumber;

Comparasion(){
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.thirdNumber = thirdNumber;
}


    if (firstNumber == secondNumber && secondNumber == thirdNumber){
        System.out.println("All numbers are equal");
    }else if(firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber){
        System.out.println("All numbers are different");
    }else{
        System.out.println("Neither all are equal or different");
    }
}
*/