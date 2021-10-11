package com.javaguru.student_dmitrii_faierberg.lesson_3.level_2;

import java.util.Scanner;

public class WorkWithString {
    public static void main(String[] args) {
        String myName = "Dmitry";
        System.out.println(myName);

        System.out.println("-------------------------");

        String greeting = "Hi " + myName + "!";
        System.out.println(greeting);

        System.out.println("-------------------------");

        Scanner input = new Scanner(System.in);
        System.out.print("Ваше имя: ");
        String userName = input.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
