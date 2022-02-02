package com.javaguru.student_ruslan_pankratov.lesson_13.level_2;

class GameOfLifeConsoleUI {
    //Показ поля на консоли! Для этого у класса GameOfLifeConsoleUI будет метод:
    public void show(boolean[][] field){
        for (int i = 0; i < field.length ; i++) {
            for (int j = 0; j < field.length ; j++) {
                if (field[i][j]){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
