package com.javaguru.student_deniss_lohins.lesson_16.level_1;

import java.util.Scanner;

class MarsRoverControlManualTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter data");
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        MarsRover marsRover = new MarsRover(firstLine, secondLine);
        String moves = scanner.nextLine();
        String result = marsRover.moveRover(moves);
        System.out.println(result);


    }
}
