package com.javaguru.student_vadim_babchenok.lesson4_home.Task3;

import java.util.Scanner;

/*Написать программу, которая запрашивает у пользователя
        целое число от 1 до 7 и выводит на консоль соотметствующий
        этому числу день недели.
        Пример:
        Ввод: 3
        Вывод: Wednesday
        Ввод: 5
        Вывод: Friday*/
public class TerzaDifferenza {
    public static void main(String[] args) {
        System.out.println("Если вы укажете число от 1 до 7 - будет указан соответствующий день недели! ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number == 1) {
            System.out.println("Вы ввели 1. Это понедельник");
        } else if (number == 2) {
            System.out.println("Вы ввели 2. Это вторник");
        } else if (number == 3) {
            System.out.println("Вы ввели 3. Это среда");
        } else if (number == 4) {
            System.out.println("Вы ввели 4. Это четверг");
        } else if (number == 5) {
            System.out.println("Вы ввели 5. Это пятница");
        } else if (number == 6) {
            System.out.println("Вы ввели 6. Это суббота");
        } else if (number == 7) {
            System.out.println("Вы ввели 7. Это воскресенье");
        } else {
            System.out.println("Вы ввели не правильное число!");
        }
    }
}



