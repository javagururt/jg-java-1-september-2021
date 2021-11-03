package com.javaguru.student_Jegor_Rutkovsky.lesson_6.level_5_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {

    @Test
    public void isWinPositionForHorizontals() {
        TicTacToe victim = new TicTacToe();
        int[][] arr = {{1,-1,-1},
                        {0,0,-1},
                        {1,1,1}};
        assertTrue(victim.isWinPositionForHorizontals(arr, 1));
    }

   @Test
    public void isWinPositionForVerticals() {
        TicTacToe victim = new TicTacToe();
        int[][] arr = {{-1,1,0},
                        {1,0,0},
                        {1,0,0}};
        assertTrue(victim.isWinPositionForVerticals(arr, 0));
    }

    @Test
    public void isWinPositionForDiagonals() {
        TicTacToe victim = new TicTacToe();
        int[][] arr = { {0,-1, 1},
                        {0, 1, 0},
                        {1,-1, 1}};
        assertTrue(victim.isWinPositionForDiagonals(arr, 1));
    }

    @Test
    public void isWinPosition() {
        TicTacToe victim = new TicTacToe();
        int[][] arr = { {0,-1, 1},
                        {0, 1, 0},
                        {1,-1, 1}};
        assertTrue(victim.isWinPosition(arr, 1));
    }

    @Test
    public void isDrawPosition() {
        TicTacToe victim = new TicTacToe();
        int[][] arr = { {0,0,1},
                        {1,1,0},
                        {0,1,0} };
        assertTrue(victim.isDrawPosition(arr));
    }

    @Test
    public void createField() {
        TicTacToe victim = new TicTacToe();
        int[][] result = { {-1,-1,-1},
                           {-1,-1,-1},
                           {-1,-1,-1} };
        assertArrayEquals(result, victim.createField());
    }


}