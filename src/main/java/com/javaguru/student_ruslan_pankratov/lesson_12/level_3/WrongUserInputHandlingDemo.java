package com.javaguru.student_ruslan_pankratov.lesson_12.level_3;

import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        WrongUserInputHandlingDemo wrongUserInputHandlingDemo = new WrongUserInputHandlingDemo();
        wrongUserInputHandlingDemo.method();
    }
    void method(){

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите целочисленное число");
            String number = scanner.nextLine();
            if (number.matches("[0-9]*")) {//regex
                System.out.println("ваше число = " + number);
                break;
            }
        }
    }
}
