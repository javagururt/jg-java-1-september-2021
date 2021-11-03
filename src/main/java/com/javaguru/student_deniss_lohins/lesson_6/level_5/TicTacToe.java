package com.javaguru.student_deniss_lohins.lesson_6.level_5;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Scanner;
@CodeReview(approved = true)
class TicTacToe {


    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field[0].length; i++) {
            for (int j = 0; j < field[1].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }


    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean result = false;
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][0] == playerToCheck) {
                result = true;
            } else {
                result = false;
            }

        }
        return result;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean result = false;
        for (int i = 0; i < 3; i++) {
            if (field[0][i] == field[1][i] && field[1][i] == field[2][i] && field[0][i] == playerToCheck) {
                result = true;
            }

        }
        return result;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean result = false;
        if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[1][1] == playerToCheck) {
            result = true;
        }
        if (field[2][0] == field[1][1] && field[1][1] == field[0][2] && field[1][1] == playerToCheck) {
            result = true;
        }
        return result;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean result = false;
        if (isWinPositionForHorizontals(field, playerToCheck)) {
            result = true;
        }
        if (isWinPositionForVerticals(field, playerToCheck)) {
            result = true;
        }
        if (isWinPositionForDiagonals(field, playerToCheck)) {
            result = true;
        }
        return result;
    }

    public boolean isDrawPosition(int[][] field) {
        boolean result = false;
        if (isWinPosition(field, 0) == false) {
            if (isWinPosition(field, 1) == false) {
                if (isAllAreaFilled(field)) {
                    result = true;
                }
            }
        }
        return result;
    }

    private boolean isAllAreaFilled(int[][] field) {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == -1) {
                    count ++;
                }
            }
        }
        if (count == 0){
            result = true;
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Move getNextMove() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter X coorinate: ");
        int x = sc.nextInt();
        System.out.print("Please enter Y coordinate: ");
        int y = sc.nextInt();
        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(field[i]));
        }
        System.out.println("");
    }


    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    //Создайте main метод и запустите игру крестики нолики:

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
