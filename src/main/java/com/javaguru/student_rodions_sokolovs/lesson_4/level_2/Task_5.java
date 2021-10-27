//Написать программу, которая запрашивает у пользователя
//        два целых числа и выводит на консоль наибольшее из них.
//        Нельзя пользоваться классом Math, можно использовать только if else.
//TASK 5-6-7
package com.javaguru.student_rodions_sokolovs.lesson_4.level_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Write a first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstnum = scanner.nextInt();
        System.out.println("Write a second number: ");
        int secondnum = scanner.nextInt();

        if (firstnum > secondnum) {
            System.out.println("The largest number is: " + firstnum);
            System.out.println("The smallest number is: " + secondnum);
            System.out.println("Numbers are different");
        } else if (secondnum > firstnum) {
            System.out.println("The largest number is: " + secondnum);
            System.out.println("The smallest number is: " + firstnum);
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equals");
        }
    }
}
