//Учимся работать со строками.
//
//        Тема: Считывание строк с консоли.
//
//        Программа должна спрашивать как зовут пользователя,
//        считывать его имя с консоли и выводить приветствие
//        в виде: "Hello UserName!".
//
//        Подсказка: строку с консоли можно считать используя
//        обьект Scanner. Загуглите как это можно сделать:
//        "как в Java считать строку с консоли".


package com.javaguru.student_rodions_sokolovs.lesson_3.level_2;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner str = new Scanner(System.in);

        String name = str.nextLine();
        System.out.println("Hello " + name + "!");
    }
}