package com.javaguru.student_deniss_lohins.lesson_15.level_3_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TenissGamePointCounterTest {

    @Test
    public void wonPoint1() {
        TenissGamePointCounter victim = new TenissGamePointCounter("Player1", "Player2");
        victim.wonPoint("Player1");
        victim.wonPoint("player1");
        assertEquals(2, victim.playerOne.getScore(), 0.1);
    }

    @Test
    public void wonPoint2() {
        TenissGamePointCounter victim = new TenissGamePointCounter("Player1", "Player2");
        victim.wonPoint("Player1");
        victim.wonPoint("player2");
        victim.wonPoint("pLaYER1");
        assertEquals(2, victim.playerOne.getScore(), 0.1);
    }

    @Test
    public void wonPoint3() {
        TenissGamePointCounter victim = new TenissGamePointCounter("Player1", "Player2");
        victim.wonPoint("Player1");
        victim.wonPoint("player2");
        assertEquals(1, victim.playerTwo.getScore(), 0.1);
    }


    @Test
    public void score1() {
        TenissGamePointCounter victim = new TenissGamePointCounter("Player1", "Player2");
        assertTrue("Love - Love".equalsIgnoreCase(victim.score()));
    }

    @Test
    public void score2() {
        TenissGamePointCounter victim = new TenissGamePointCounter("Player1", "Player2");
        victim.wonPoint("player1");
        assertTrue("Fifteen - Love".equalsIgnoreCase(victim.score()));
    }

    @Test
    public void score3() {
        TenissGamePointCounter victim = new TenissGamePointCounter("Player1", "Player2");
        victim.wonPoint("player1");
        victim.wonPoint("player1");
        assertTrue("Thirty - Love".equalsIgnoreCase(victim.score()));
    }

    @Test
    public void score4() {
        TenissGamePointCounter victim = new TenissGamePointCounter("Player1", "Player2");
        victim.wonPoint("player1");
        victim.wonPoint("player1");
        victim.wonPoint("player1");
        assertTrue("Forty - Love".equalsIgnoreCase(victim.score()));
    }

    @Test
    public void score5() {
        TenissGamePointCounter victim = new TenissGamePointCounter("Player1", "Player2");
        victim.wonPoint("player1");
        victim.wonPoint("player1");
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        victim.wonPoint("player2");
        victim.wonPoint("player2");
        System.out.println(victim.score());
        assertTrue("Deuce".equalsIgnoreCase(victim.score()));
    }

    @Test
    public void score6() {
        TenissGamePointCounter victim = new TenissGamePointCounter("Player1", "Player2");
        victim.wonPoint("player1");
        victim.wonPoint("player1");
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        victim.wonPoint("player2");
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        assertTrue("Advantage player1".equalsIgnoreCase(victim.score()));
    }

    @Test
    public void score7() {
        TenissGamePointCounter victim = new TenissGamePointCounter("Player1", "Player2");
        victim.wonPoint("player2");
        victim.wonPoint("player1");
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        victim.wonPoint("player2");
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        System.out.println(victim.score());
        assertTrue("Advantage player2".equalsIgnoreCase(victim.score()));
    }

    @Test
    public void score8() {
        TenissGamePointCounter victim = new TenissGamePointCounter("Player1", "Player2");
        victim.wonPoint("player2");
        victim.wonPoint("player1");
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        victim.wonPoint("player2");
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        victim.wonPoint("player2");
        assertTrue("Win player2".equalsIgnoreCase(victim.score()));
    }
    @Test
    public void score9() {
        TenissGamePointCounter victim = new TenissGamePointCounter("Player1", "Player2");
        victim.wonPoint("player1");
        victim.wonPoint("player1");
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        victim.wonPoint("player2");
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        victim.wonPoint("player1");
        assertTrue("Win player1".equalsIgnoreCase(victim.score()));
    }
}