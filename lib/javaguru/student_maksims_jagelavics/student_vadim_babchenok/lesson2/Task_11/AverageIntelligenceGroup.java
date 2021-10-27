package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson2.Task_11;
/*Напишите программу, которая запрашивает у пользователя
        три целых числа и выводит их среднее арифметическое
        (складывает все числа и делит на их количество).*/

import java.util.Scanner;

public class AverageIntelligenceGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter any three integers:  ");
        int numberOne = input.nextInt();

        System.out.print( "Enter any second integers:  ");
        int numberOne2 = input.nextInt();

        System.out.print( "Enter any third integers:  ");
        int numberOne3 = input.nextInt();

        System.out.print("The average value of three values is: "
                + (numberOne + numberOne2 + numberOne3) / 3);


    }

}
