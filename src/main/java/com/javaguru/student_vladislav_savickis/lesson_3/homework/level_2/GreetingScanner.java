package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_2;

import java.util.Scanner;

public class GreetingScanner {
    public static void main(String[] args) {
        Scanner nameRequest = new Scanner(System.in);
        System.out.println("Please write your name. ^-^");
        String userName = nameRequest.nextLine();
        String userGreeting = "Hello " + userName + "!";
        System.out.println(userGreeting);
    }
}
