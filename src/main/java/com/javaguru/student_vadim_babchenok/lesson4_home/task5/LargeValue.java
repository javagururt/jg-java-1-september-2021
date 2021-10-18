package com.javaguru.student_vadim_babchenok.lesson4_home.task5;

import java.util.Scanner;

/*Написать программу, которая запрашивает у пользователя
        два целых числа и выводит на консоль наибольшее из них.
        Нельзя пользоваться классом Math, можно использовать только if else.*/
public class LargeValue {
    public static void main(String[] args) {
        System.out.println("Необходимо ввести два числа. Из двух чисел будет указано большее!");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int numberTwo = input.nextInt();
        if (number > numberTwo ){
            System.out.println("число " + number +" больше чем число "+ numberTwo);
        }
        else {
            System.out.println ("число " + numberTwo + " больше чем число "+ number);
        }
    }
}
