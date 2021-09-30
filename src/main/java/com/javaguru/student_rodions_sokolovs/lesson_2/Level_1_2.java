//Написать консольную программу, которая запрашивает у пользователя два вещественных числа
//(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
//Вещественные числа можно запрашивать с консоли используя объект Scanner
//следующим образом:
//
//Scanner scanner = new Scanner(System.in);
//double firstDoubleNumber = scanner.nextDouble();


package com.javaguru.student_rodions_sokolovs.lesson_2;

import java.util.Scanner;

public class Level_1_2 {
    public static void main(String[] args) {
        System.out.println("Please enter first number: ");
        Scanner input = new Scanner(System.in);
        double firstnum = input.nextDouble();
        System.out.println("Please enter second number: ");
        double secondnum = input.nextDouble();

        double sumres = firstnum + secondnum;
        double subtrac = firstnum - secondnum;
        double divideres = firstnum / secondnum;
        double multiplyres = firstnum * secondnum;

        System.out.println("Sum result: " + sumres);
        System.out.println("Subtract result: " + subtrac);
        System.out.println("Divide result: " + divideres);
        System.out.println("Multiply result: " + multiplyres);

    }
}
