package com.javaguru.student_georgijs_kuznecovs.lesson_2;

import                                                    java.util.Scanner;

public class L2Task8 {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String theName = sc.nextLine();

        System.out.println("Hello " + theName + "!");
 /*       if (theName.equalsIgnoreCase("+")) {              НЕ ПОНИМАЮ, ДЛЯ ЧЕГО ЭТА СТРОКА
            System.out.println(" WOW ");
        }  */
    }
}
