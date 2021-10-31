package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson4_home.task_8;

import java.util.Scanner;


public class DifferentNumber {
    public static void main(String[] args) {
        System.out.println("Enter three numbers and press start!");
        Scanner input = new Scanner(System.in);
        int number= input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();

        if (number == numberTwo && numberTwo == numberThree) {
            System.out.println("All numbers are equal");//44,44,44
        }
        else if (number != numberTwo &&
                numberTwo != numberThree &&
                number != numberThree ) {                        //44,43,42
            System.out.println("All numbers are different");

        }
        else {
            System.out.println("Neither all are equal or different");//44,44,43
        }

    }
}
