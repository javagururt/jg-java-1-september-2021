package com.javaguru.student_nikita_simans.homework.lesson_3;

public class SnakeDemo {
    public static void main(String[] args) {
        Snake snake = new Snake("Kaa", "Elapidae", false, 10);
        snake.printSnakeLength();
        snake.printSnakeName();
        snake.printSnakeSpecies();
        snake.printIsVenomous();
        System.out.println("----------------");
        snake.getCharacteristics();
        System.out.println("----------------");
        snake.lengthAfterYear();
    }
}
