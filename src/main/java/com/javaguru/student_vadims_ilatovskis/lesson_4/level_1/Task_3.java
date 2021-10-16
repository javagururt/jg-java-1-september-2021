package com.javaguru.student_vadims_ilatovskis.lesson_4.level_1;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {
        System.out.println("Hello, please enter integer number from 1 to 7 and press 'Enter'");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1){System.out.println("Its Monday");}
        if (number == 2){System.out.println("Its Tuesday");}
        if (number == 3){System.out.println("Its Wednesday");}
        if (number == 4){System.out.println("Its Thursday");}
        if (number == 5){System.out.println("Its Friday");}
        if (number == 6){System.out.println("Its Saturday");}
        if (number == 7){System.out.println("Its Sunday");}
    }
}
