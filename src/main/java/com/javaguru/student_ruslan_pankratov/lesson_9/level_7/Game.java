package com.javaguru.student_ruslan_pankratov.lesson_9.level_7;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        int[][] field = {
                {0, 0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0}

        };
        game.startGame(field);


    }

    void nextMove(int x, int y, int[][] field, int numberPlayer) {
        field[x - 1][y - 1] = numberPlayer;
    }

    void print(int[][] field) {
        for (int i = 0; i < field.length; i++) {

            for (int j = 0; j < field.length + 1; j++) {
                System.out.print("|" + field[i][j] + "|");
            }
            System.out.println("");
        }
    }

    void startGame(int[][] field) {
        print(field);
        while (true) {
            Draw draw = new Draw();
            WinningPositions winningPositions = new WinningPositions();
            System.out.println("Player 1");
            Scanner playerOne = new Scanner(System.in);
            int x = playerOne.nextInt();
            int y = playerOne.nextInt();
            nextMove(x, y, field, 1);
            print(field);
            if (winningPositions.winPosition(field, 1)) {
                System.out.println("Player 1 win");
                break;
            } else if (draw.draw(field)) {
                System.out.println("Draw");
                break;
            }

            System.out.println("Player 2");
            Scanner playerTwo = new Scanner(System.in);
            int xTwo = playerTwo.nextInt();
            int yTwo = playerTwo.nextInt();
            nextMove(xTwo, yTwo, field, 2);
            print(field);
            if (winningPositions.winPosition(field, 2)) {
                System.out.println("Player 2 win");
                break;
            } else if (draw.draw(field)) {
                System.out.println("Draw");
                break;
            }
        }
    }
}