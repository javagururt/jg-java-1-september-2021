package com.javaguru.student_vitalijs_usakovs.lesson_4.homework;

import java.util.Scanner;

class DayNumber {
    public static void main(String[] args) {
        System.out.println("Please, enter number from 1 to 7 : ");
        Scanner input = new Scanner(System.in);
        int dayNumber = input.nextInt();

        switch (dayNumber){
            case 1:
                System.out.println("You have entered number 1. 1 equals to monday.");
                break;
            case 2:
                System.out.println("You have entered number 2. 2 equals to tuesday.");
                break;
            case 3:
                System.out.println("You have entered number 3. 3 equals to wednesday.");
                break;
            case 4:
                System.out.println("You have entered number 4. 4 equals to thursday.");
                break;
            case 5:
                System.out.println("You have entered number 5. 5 equals to friday.");
                break;
            case 6:
                System.out.println("You have entered number 6. 6 equals to saturday.");
                break;
            case 7:
                System.out.println("You have entered number 7. 7 equals to sunday.");
                break;
            default:
                System.out.println("You have entered wrong number. Please enter number from 1 to 7.");
                break;
        }
    }
}
