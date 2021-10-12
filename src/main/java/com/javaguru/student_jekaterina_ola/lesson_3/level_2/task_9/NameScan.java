package com.javaguru.student_jekaterina_ola.lesson_3.level_2.task_9;

 /*Программа должна спрашивать как зовут пользователя,
        считывать его имя с консоли и выводить приветствие
        в виде: "Hello UserName!".

        Подсказка: строку с консоли можно считать используя
        обьект Scanner. Загуглите как это можно сделать:
        "как в Java считать строку с консоли". */

import java.util.Scanner;

public class NameScan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");

        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
    }}