package com.javaguru.student_Olga_T.lesson_6.level_5.tasks_19_23;
// https://vc.ru/dev/141885-poznaem-osnovy-java-i-sozdaem-krestiki-noliki

import javax.swing.*;
import java.awt.*;

class TicTacToeDemo {
    public static void main(String[] args) {

        JFrame window = new JFrame("TicTacToe");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setLayout(new BorderLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        TicTacToePainting game = new TicTacToePainting();
        window.add(game);
        System.out.println();
    }
}
