package com.javaguru.student_ruslan_pankratov.lesson_4.level_1;

import java.util.Scanner;

//Task_3
class Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write from 1 to 7");
        int result = scanner.nextInt();
        switch (result) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
