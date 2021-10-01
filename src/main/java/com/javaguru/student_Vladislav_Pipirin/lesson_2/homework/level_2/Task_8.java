package com.javaguru.student_Vladislav_Pipirin.lesson_2.homework.level_2;

import java.util.Scanner;

//Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//Hello имя пользователя!
public class Task_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String userName = input.next();
        System.out.println("Hello " + userName);
    }
}