package com.javaguru.student_vadim_babchenok.lesson4_home.Task1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Difference {
    public static void main(String[] args) {
        System.out.println("Введи любое целое число");
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        if ( number >0){
            System.out.print("Это число положительное");
        }else {
            System.out.print("Это число отрицательное");
        }
    }
}
