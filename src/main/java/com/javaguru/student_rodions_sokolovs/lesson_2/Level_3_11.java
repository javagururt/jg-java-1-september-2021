//Напишите программу, которая запрашивает у пользователя
//        три целых числа и выводит их среднее арифметическое
//        (складывает все числа и делит на их количество).

package com.javaguru.student_rodions_sokolovs.lesson_2;
import java.util.Scanner;
public class Level_3_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First numbers:");
        double firstnum = scanner.nextDouble();
        System.out.println("Please Enter Second numbers:");
        double secondnum = scanner.nextDouble();
        System.out.println("Please Enter Third numbers:");
        double thirdnum = scanner.nextDouble();

        double arfnum = (firstnum + secondnum + thirdnum) / 3;
        System.out.println("Cреднее арифметическое = " + arfnum);

    }
}