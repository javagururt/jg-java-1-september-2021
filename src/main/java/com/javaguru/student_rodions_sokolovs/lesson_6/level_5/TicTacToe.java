
package com.javaguru.student_rodions_sokolovs.lesson_6.level_5;


import com.javaguru.student_rodions_sokolovs.lesson_6.level_6.Move;

import java.util.Scanner;

public class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean result = true;
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][2] == playerToCheck) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;

    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean result = true;
        for (int i = 0; i < 3; i++) {
            if (field[0][i] == field[1][i] && field[1][i] == field[2][i] && field[2][i] == playerToCheck) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;

    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean result = false;
        if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[2][2] == playerToCheck) {
            result = true;
        } else if (field[2][0] == field[1][1] && field[1][1] == field[0][2] && field[2][0] == playerToCheck) {
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
        } else if (isWinPositionForDiagonals(field, playerToCheck)) {
            result = true;
        }
        return result;
    }

    public boolean isDrawPosition(int[][] field){
        boolean result = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1){
                    result = false;
                }
            }
        }
        return result;
    }

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[1].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирите ход для x: ");
        int x = scanner.nextInt();
        System.out.println("Выбирите ход для y: ");
        int y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.println("|" + field[i][0] + "|" + field[i][1] + "|" + field[i][2] + "|");
        }
        System.out.println();

    }

    public void play() {
        int[][] field = createField();
        while (true) {
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
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

}

