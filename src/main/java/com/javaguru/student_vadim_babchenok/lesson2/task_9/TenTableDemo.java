package com.javaguru.student_vadim_babchenok.lesson2.task_9;
/*Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.*/

import java.util.Scanner;

public class TenTableDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE, ENTER YUO DATE: " );
        int numberOne = input.nextInt();
        System.out.println(numberOne+"*1="+numberOne*1);
        System.out.println(numberOne+"*2="+numberOne*2);
        System.out.println(numberOne+"*3="+numberOne*3);
        System.out.println(numberOne+"*4="+numberOne*4);
        System.out.println(numberOne+"*5="+numberOne*5);
        System.out.println(numberOne+"*6="+numberOne*6);
        System.out.println(numberOne+"*7="+numberOne*7);
        System.out.println(numberOne+"*8="+numberOne*8);
        System.out.println(numberOne+"*9="+numberOne*9);
        System.out.println(numberOne+"*10="+numberOne*10);

    }
}
