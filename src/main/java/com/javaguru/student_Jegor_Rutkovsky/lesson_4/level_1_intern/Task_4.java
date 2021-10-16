package com.javaguru.student_Jegor_Rutkovsky.lesson_4.level_1_intern;

import java.util.Scanner;
/* Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.
 */
class Task_4 {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even");
        }
            else{
                System.out.println("Number " + number + " is odd");
            }
        }
}

