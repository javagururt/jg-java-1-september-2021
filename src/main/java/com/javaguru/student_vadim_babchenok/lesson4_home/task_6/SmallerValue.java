package com.javaguru.student_vadim_babchenok.lesson4_home.task_6;

import java.util.Scanner;
/*

*/
/*Написать программу, которая запрашивает у пользователя
        два целых числа и выводит на консоль наименьшее из них.*//*

public class SmallerValue {
    public static void main(String[] args) {
        System.out.println("Необходимо ввести два числа. Из двух чисел будет указано меньшее!");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int numberTwo = input.nextInt();
        if (number < numberTwo ){
            System.out.println("число " + number +" меньше чем число "+ numberTwo);
        }
        else if (number > numberTwo ){
            System.out.println ("число " + numberTwo + " меньше чем число "+ number);}
        else
        {
            System.out.println("Числа ровны");
        }
        }
    }
}
*/
