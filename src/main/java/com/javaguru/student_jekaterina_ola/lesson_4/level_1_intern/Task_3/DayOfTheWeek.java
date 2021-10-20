package com.javaguru.student_jekaterina_ola.lesson_4.level_1_intern.Task_3;

//Написать программу, которая запрашивает у пользователя
//        целое число от 1 до 7 и выводит на консоль соотметствующий
//        этому числу день недели.


import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 7");
        int dayOfTheWeek = scanner.nextInt();

        switch (dayOfTheWeek) {

            case 1:
                System.out.println("Monday: ");
                break;
            case 2:
                System.out.println("Tuesday: ");
                break;
            case 3:
                System.out.println("Wednesday: ");
                break;
            case 4:
                System.out.println("Thursday: ");
                break;
            case 5:
                System.out.println("Friday: ");
                break;
            case 6:
                System.out.println("Saturday: ");
                break;
            case 7:
                System.out.println("Sunday: ");
                break;
            default:
                System.out.println("No result: ");
                break;
        }
    }
}

