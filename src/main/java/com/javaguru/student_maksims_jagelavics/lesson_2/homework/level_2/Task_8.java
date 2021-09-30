package com.javaguru.student_maksims_jagelavics.lesson_2.homework.level_2;

//Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//Hello имя пользователя!

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter user name:");
        String username = input.next();
        System.out.println();
        System.out.println("Hello, " + username + "!");
    }

}