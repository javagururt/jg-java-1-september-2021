package com.javaguru.student_Olga_T.lesson_3.level_2.tasks_7_10;

import java.util.Scanner;

public class StringNames {
    public static void main(String[] args) {
        String myName = "Olga";                                                                                // task 7
        System.out.println(myName);                                                                            // task 7

        String greeting = "Hi, " + myName + "!";                                                               // task 8
        System.out.println(greeting);                                                                          // task 8

        System.out.println("Enter your name");                                                                 // task 9
        Scanner inputUserName = new Scanner(System.in);                                                        // task 9
        String userName = inputUserName.nextLine();                                                            // task 9
        System.out.println("Hello, " + userName + "!");                                                        // task 9


        System.out.println("The length of your name is: " + userName.length());                               // task 10
        System.out.println("Enter your friend`s name");                                                       // task 10
        String userFriendsName = inputUserName.nextLine();                                                    // task 10
        System.out.println("Your friend`s name is: " + userFriendsName);                                      // task 10
        System.out.println("The length of your friend`s name is: " + userFriendsName.length());               // task 10
        if (userName.length() > userFriendsName.length()) {                                                   // task 10
            System.out.println("Ваше имя длиннее имени вашего друга/вашей подруги.");                         // task 10
        } else {                                                                                              // task 10
            if (userName.length() < userFriendsName.length()) {                                               // task 10
                System.out.println("Ваше имя короче имени вашего друга/вашей подруги.");                      // task 10
            } else {                                                                                          // task 10
                System.out.println("В ваших именах одинаковое количество букв.");                             // task 10
            }                                                                                                 // task 10
        }                                                                                                     // task 10
        if (userName.equalsIgnoreCase(userFriendsName)) {                                                     // task 10
            System.out.println("Ваши имена одинаковые.");                                                     // task 10
        }                                                                                                     // task 10


    }
}



