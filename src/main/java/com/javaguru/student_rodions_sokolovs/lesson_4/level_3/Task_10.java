//        Написать программу, которая запрашивает у пользователя
//        три целых числа и выводит на консоль наибольшее из них.
//
//        PS: перед решением этой задачи распишите на бумаге
//        или в комментарии все возможные варианты (комбинации).
//        Это поможет вам правильно написать программу!
//        Нельзя пользоваться классом Math.

package com.javaguru.student_rodions_sokolovs.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("First Number: ");
        Scanner scanner = new Scanner(System.in);
        int firstnum = scanner.nextInt();
        System.out.println("Second Number: ");
        int secondnum = scanner.nextInt();
        System.out.println("Third Number: ");
        int thirdnum = scanner.nextInt();

        if (firstnum > secondnum && firstnum > thirdnum) {
            System.out.println("Наибольшее число: " + firstnum);
        } else if (secondnum > firstnum && secondnum > thirdnum) {
            System.out.println("Наибольшее число: " + secondnum);
        } else {
            System.out.println("Наибольшее число: " + thirdnum);
        }

    }
}
