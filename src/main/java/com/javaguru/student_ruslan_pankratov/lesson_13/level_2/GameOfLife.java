package com.javaguru.student_ruslan_pankratov.lesson_13.level_2;

import java.util.concurrent.TimeUnit;

class GameOfLife {
    public static void main(String[] args) {
        GameOfLife game = new GameOfLife();
        game.run();
    }
    private GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
    private GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    public void run() {
        boolean[][] field = generator.generate(50, 50);
        while(true) {
            ui.show(field);
            sleepForSeconds(1);
            field = calculator.calculate(field);
        }
    }

    private void sleepForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }

}