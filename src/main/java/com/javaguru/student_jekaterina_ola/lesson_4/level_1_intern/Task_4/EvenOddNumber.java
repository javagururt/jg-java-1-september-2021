package com.javaguru.student_jekaterina_ola.lesson_4.level_1_intern.Task_4;
/*Написать программу, которая запрашивает у пользователя
        целое число и выводит на консоль чётное оно или нет.

        Подсказка: используйте для определения чётное число или нет
        операцию остаток от деления (%). Если остаток от деления на 2
        равен нулю то число чётное, иначе не чётное.*/

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Result is even number:" );}
        else {
            System.out.println("Result is odd number: " );
        }
    }
}
