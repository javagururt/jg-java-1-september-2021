//Написать программу, которая запрашивает у пользователя
//        целое число от 1 до 7 и выводит на консоль соотметствующий
//        этому числу день недели.
//
//        Пример:
//        Ввод: 3
//        Вывод: Wednesday
//
//        Ввод: 5
//        Вывод: Friday


package com.javaguru.student_rodions_sokolovs.lesson_4.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Write a Number! (1 to 7): ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
    }
}

