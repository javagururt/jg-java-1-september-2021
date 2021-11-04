package com.javaguru.student_Jegor_Rutkovsky.lesson_6.level_5_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] arr = { {1,-1,3},
                        {-1,0,6},
                        {7,0,9} };
        System.out.println(arr[0][0]+""+arr[1][0]+""+arr[2][0]);

        System.out.println(arr[0][1]+""+arr[1][1]+""+arr[2][1]);

        System.out.println(arr[0][2]+""+arr[1][2]+""+arr[2][2]);

        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = { {-1,1,1},
                          { 1,0,1},
                          { 1,0,1} };

        System.out.println(ticTacToe.isWinPositionForVerticals(array, 1));

        ticTacToe.printFieldToConsole(arr);
    }

}
