package com.javaguru.student_Olga_T.lesson_7.level_x.task_extra;

// https://www.youtube.com/watch?v=NzxrIBwZa4s (часть 1)
// https://www.youtube.com/watch?v=nni5XO_0rJQ (часть 2)
// https://www.youtube.com/watch?v=wrKqaWwoUWw (часть 3)
// https://editor.0lik.ru/photoeditor-online-new.html рисовать

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

class GameWindow extends JFrame {
    private static GameWindow gameWindow;
    private static Image backgroundGalaxy;
    private static Image backgroundSky;
    private static Image drop;
    private static Image gameOver;
    private static Image start;
    private static Image restart;
    private static Image gameRulesText;
    //   private static Image gameRulesButton;      // 110x49px
    private static long lastFrameTime;
    private static float dropY = -150;
    private static float dropX;
    private static float dropV = 320; // Скорость вылетания первого хомяка.
    private static int score = 0;
    private static float restartX = 300;
    private static float restartY = 300;
    boolean startPage = true;
    private static float startX = 346;
    private static float startY = 250;

    public static void main(String[] args) throws IOException {
        backgroundGalaxy = ImageIO.read(GameWindow.class.getResourceAsStream("galaxy.png"));
        backgroundSky = ImageIO.read(GameWindow.class.getResourceAsStream("sky.png"));
        drop = ImageIO.read(GameWindow.class.getResourceAsStream("hamster.png"));
        gameOver = ImageIO.read(GameWindow.class.getResourceAsStream("game_over.png"));
        start = ImageIO.read(GameWindow.class.getResourceAsStream("start.png"));
        restart = ImageIO.read(GameWindow.class.getResourceAsStream("restart.png"));
        gameRulesText = ImageIO.read(GameWindow.class.getResourceAsStream("game_rules_text.png"));
        //   ImageIO.read(GameWindow.class.getResourceAsStream("game_rules.png"));

        gameWindow = new GameWindow();
        JLabel record = new JLabel(score + " hamsters caught.");
        record.setPreferredSize(new Dimension(160, 25));
        record.setFont(new Font(score + " hamsters caught.", Font.PLAIN, 19));
        record.setOpaque(true);
        record.setBackground(Color.white);
        gameWindow.setSize(900, 600);
        gameWindow.setResizable(false);
        lastFrameTime = System.nanoTime();
        gameWindow.setTitle("Hamsters galaxy");
        gameWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        GameField gameField = new GameField();

        gameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                float dropXRight = dropX + drop.getWidth(null);
                float dropYBottom = dropY + drop.getHeight(null);
                boolean isDrop = x >= dropX && x <= dropXRight && y >= dropY && y <= dropYBottom;
                if (isDrop) { // тыкнули на хомяка и он исчезает и появляется новый сверху
                    dropY = -100;
                    dropX = (int) (Math.random() * (gameField.getWidth() - drop.getHeight(null)));
                    //  gameWindow.setTitle(score + " hamsters caught.");
                    score++;
                    record.setText(score + " hamsters caught.");
                    dropV = dropV + 40;                                     // Тут увеличиваем скорость падения хомяков.
                    //          } else if (isDrop) {                        // Это зачем было в коде?
                    //              if (score <= 0) {                       // Это зачем было в коде?
                    //                  score--;                            // Это зачем было в коде?
                    //             }
                }

                float restartXLeft = restartX + restart.getWidth(null);
                float restartYBottom = restartY + restart.getHeight(null);
                boolean ifRestart = x >= restartX && x <= restartXLeft && y >= restartY && y <= restartYBottom;
                if (ifRestart && dropY > gameWindow.getHeight()) {
                    dropY = -100;
                    dropX = (int) (Math.random() * (gameField.getWidth() - drop.getHeight(null)));
                    score = 0;
                    dropV = 200;
                    //  gameWindow.setTitle(score + " hamsters caught.");
                    record.setText(score + " hamsters caught.");
                }

                if (gameWindow.startPage) {
                    float startXLeft = startX + start.getWidth(null);
                    float startYBottom = startY + start.getHeight(null);
                    boolean ifStart = x >= startX && x <= startXLeft && y >= startY && y <= startYBottom;
                    if (ifStart) {
                        dropY = -900;
                        dropX = (int) (Math.random() * (gameField.getWidth() - drop.getHeight(null)));
                        score = 0;
                        dropV = 200;
                        gameWindow.startPage = false;
                    }
                }

            }
        });
        gameWindow.add(gameField);
        gameField.add(record);
        gameWindow.setVisible(true);
    }

    public static void onRepaint(Graphics g) {
        if (gameWindow.startPage) {
            g.drawImage(backgroundGalaxy, 0, 0, null);
            //   g.drawImage(gameRulesButton, 395, 10, null);
            g.drawImage(start, 346, 250, null);
            g.drawImage(gameRulesText, 150, 350, null);
        } else {
            g.drawImage(backgroundSky, 0, 0, null);
            long currentTime = System.nanoTime();
            float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
            lastFrameTime = currentTime;
            dropY = dropY + dropV * deltaTime;
            g.drawImage(drop, (int) dropX, (int) dropY, null);
            if (dropY > gameWindow.getHeight()) {                               // если упал хомяк
                g.drawImage(gameOver, 250, 250, null);
                g.drawImage(restart, 300, 300, null);
            }

        }
    }

    private static class GameField extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            onRepaint(g);
            repaint();
        }
    }


}

