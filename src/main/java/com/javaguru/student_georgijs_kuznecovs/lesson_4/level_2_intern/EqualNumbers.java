package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_2_intern;

import java.util.Scanner;

class EqualNumbers {
    public static void main(String[] args) {

        System.out.println("Please enter first number: ");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        System.out.println("Please enter second number: ");
        int secondNum = sc.nextInt();

        if (firstNum == secondNum){
            System.out.println("Numbers are equals");
        }else
            System.out.println("Numbers are different");
    }
}
