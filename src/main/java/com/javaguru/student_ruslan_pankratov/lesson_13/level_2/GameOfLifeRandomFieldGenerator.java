package com.javaguru.student_ruslan_pankratov.lesson_13.level_2;

class GameOfLifeRandomFieldGenerator {

    public boolean[][] generate(int fieldWidth, int fieldHeight){
       boolean[][] field = new boolean[fieldWidth][fieldHeight];
       int [][] number = new int[fieldWidth][fieldHeight];
        for (int i = 0; i <number.length ; i++) {
            for (int j = 0; j <number.length ; j++) {
                number[i][j] = (int) (Math.random() *2);
            }
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if(number[i][j] == 0){
                    field[i][j] = false;
                } else {
                    field[i][j] = true;
                }
            }
        }
         return field;
    }
}
