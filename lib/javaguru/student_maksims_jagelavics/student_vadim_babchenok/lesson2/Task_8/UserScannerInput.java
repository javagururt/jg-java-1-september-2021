package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson2.Task_8;

/*Написать консольную программу, которая запрашивает
 имя пользователя и выводит на консоль текст:
 Hello имя пользователя!*/

import java.util.Scanner;

public class UserScannerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( );
        String phrase1 = input.nextLine();
        System.out.println("Hello     " + phrase1);
    }
}

