//Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//Hello имя пользователя!


package com.javaguru.student_rodions_sokolovs.lesson_2;


import java.util.Scanner;

public class Level_2_8 {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String firstname = input.nextLine();
        System.out.println("Hello! " + firstname);
    }
}
