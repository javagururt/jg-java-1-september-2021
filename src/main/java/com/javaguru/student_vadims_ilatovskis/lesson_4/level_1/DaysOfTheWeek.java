package com.javaguru.student_vadims_ilatovskis.lesson_4.level_1;

import java.util.Scanner;
//task_3
class DaysOfTheWeek {
    public static void main(String[] args) {
        System.out.println("Hello, please enter integer number from 1 to 7 and press 'Enter'");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1){System.out.println("Its Monday");}
        else if (number == 2){System.out.println("Its Tuesday");}
        else if (number == 3){System.out.println("Its Wednesday");}
        else if (number == 4){System.out.println("Its Thursday");}
        else if (number == 5){System.out.println("Its Friday");}
        else if (number == 6){System.out.println("Its Saturday");}
        else if (number == 7){System.out.println("Its Sunday");}
        else {System.out.println("You entered wrong number");}
    }
}
