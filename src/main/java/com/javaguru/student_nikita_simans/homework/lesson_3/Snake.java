package com.javaguru.student_nikita_simans.homework.lesson_3;

import java.util.Arrays;

public class Snake {
    private String snakeName;
    private String snakeSpecies;
    private Boolean isVenomous;
    private int snakeLength;
    //String lengthValue = "";

    public Snake(String snakeName, String snakeSpecies, Boolean isVenomous, int snakeLength) {
        this.isVenomous = isVenomous;
        this.snakeLength = snakeLength;
        this.snakeName = snakeName;
        this.snakeSpecies = snakeSpecies;
    }

    public void getCharacteristics() {
        //moreThatOneMeter();
        String firstLetter = snakeSpecies.substring(0, 1);
        String[] vocals = {"A", "E", "I", "O", "U", "Y", "a", "e", "i", "o", "u", "y"};
        boolean isVocal = Arrays.stream(vocals).anyMatch(firstLetter::equals);
        if (isVocal) {
            System.out.println("This is an " + snakeSpecies + ".");
        } else {
            System.out.println("This is a " + snakeSpecies + ".");
        }
        //System.out.println("This is " + snakeSpecies + ".");
        System.out.println("Its name is " + snakeName + ".");
        if (snakeLength == 0) {
            System.out.println("It is very small yet.");
        } else {
            System.out.println("It is " + snakeLength + moreThatOneMeter() + " long.");
        }
        if (isVenomous) {
            System.out.println(snakeName + " is venomous. Be careful!");
        } else {
            System.out.println(snakeName + " is not venomous. But you must be careful with snakes.");
        }

    }

    public void printSnakeName() {
        System.out.println("Snake name is " + snakeName + ".");
    }

    public void printSnakeSpecies() {
        String firstLetter = snakeSpecies.substring(0, 1);
        String[] vocals = {"A", "E", "I", "O", "U", "Y", "a", "e", "i", "o", "u", "y"};
        boolean isVocal = Arrays.stream(vocals).anyMatch(firstLetter::equals);
        if (isVocal) {
            System.out.println("This is an " + snakeSpecies + ".");
        } else {
            System.out.println("This is a " + snakeSpecies + ".");
        }

    }


    public void printIsVenomous() {
        if (isVenomous) {
            System.out.println("It is venomous.");
        } else {
            System.out.println("It is not venomous.");
        }
    }

    public void printSnakeLength() {
       // moreThatOneMeter();
        if (snakeLength == 0) {
            System.out.println("It is very small yet");
        } else {
            System.out.println("It is " + snakeLength + moreThatOneMeter() + " long.");
        }
    }
    public String moreThatOneMeter() {
        String lengthValue = "";
        if (snakeLength > 1) {
            lengthValue = " meters";
            return lengthValue;
        } else {
            lengthValue = " meter";
            return lengthValue;
        }
    }
    public void lengthAfterYear(){
        snakeLength++;
        //moreThatOneMeter();
        System.out.println("After one year " + snakeName + " will be " + snakeLength + moreThatOneMeter() + " long.");

    }
}
