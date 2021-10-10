package com.javaguru.student_Jegor_Rutkovsky.lesson_2.level_2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args){
        System.out.println("Please enter your name: ");
        Scanner myName = new Scanner(System.in);
        String name = myName.nextLine();

        System.out.println("Your name is " + name);
    }
}
