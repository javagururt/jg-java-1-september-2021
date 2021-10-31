package com.javaguru.student_deniss_lohins.lesson_6.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {

    private TicTacToe victim;

    @Test
    public void isWinPositionForHorizontals() {
        victim = new TicTacToe();
        int[][] field = {
                {-1, -1, -1},
                {1, 0, 1},
                {0, 0, 0}
        };
        assertFalse(victim.isWinPositionForHorizontals(field, 1));
        assertTrue(victim.isWinPositionForHorizontals(field, 0));
    }

    @Test
    public void isWinPositionForVerticals() {
        victim = new TicTacToe();
        int[][] field = {
                {1, -1, 1},
                {1, 0, 1},
                {0, 0, 1}
        };
        assertTrue(victim.isWinPositionForVerticals(field, 1));
        assertFalse(victim.isWinPositionForVerticals(field, 0));

    }

    @Test
    public void isWinPositionForDiagonals() {
        victim = new TicTacToe();
        int[][] field = {
                {1, -1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        assertTrue(victim.isWinPositionForDiagonals(field, 1));
        assertFalse(victim.isWinPositionForDiagonals(field, 0));
    }

    @Test
    public void isWinPosition() {
        victim = new TicTacToe();
        int[][] field = {
                {1, -1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        assertTrue(victim.isWinPosition(field, 1));
        assertFalse(victim.isWinPosition(field, 0));
    }

    @Test
    public void isDrawPosition() {
        victim = new TicTacToe();
        int[][] field = {
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0}
        };
        assertTrue(victim.isDrawPosition(field));
    }

    @Test
    public void createField() {
        victim = new TicTacToe();
        int [][] expectedField = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };
        assertEquals(expectedField, victim.createField());
    }


    @Test
    public void printFieldToConsole() {
        victim = new TicTacToe();
        int[][] field = {
                {1, -1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        victim.printFieldToConsole(field);
    }
}