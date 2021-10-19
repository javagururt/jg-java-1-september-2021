package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_1;

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args){

        System.out.println("Please enter number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i % 2 == 0) {
            System.out.print("The number is even");
        } else {
            System.out.print("The number is odd");
        }
    }
}
