package com.javaguru.student_Olga_T.lesson_6.level_5.tasks_19_23;
// https://vc.ru/dev/141885-poznaem-osnovy-java-i-sozdaem-krestiki-noliki

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

class TicTacToePainting extends JComponent {
    public static final int FIELD_EMPTY = 0; //пустое поле
    public static final int FIELD_X = 10; //поле с крестиком
    public static final int FIELD_0 = 200; //поле с ноликом
    int[][] field;
    boolean isXturn;


    public TicTacToePainting() {
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
        field = new int[3][3]; //выделяем память под массив при создании компонента
        initGame();
    }

    public void initGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = FIELD_EMPTY; // очищаем массив, заполняя его 0
            }
        }
        isXturn = true;
    }

    protected void processMouseEvent(MouseEvent mouseEvent) {
        super.processMouseEvent(mouseEvent);
        if (mouseEvent.getButton() == MouseEvent.BUTTON1) { //проверяем, что нажата левая клавиша
            int x = mouseEvent.getX(); //координата Х клика
            int y = mouseEvent.getY(); //координата Y клика
            //переводим координаты в индексы ячейки в массиве field
            int i = (int) ((float) x / getWidth() * 3);
            int j = (int) ((float) y / getHeight() * 3);
            //проверяем, что выбранная ячейка пуста и туда можно походить
            if (field[i][j] == FIELD_EMPTY) {
//проверка чей ход (если Х - ставим крестик, если 0 - ставим нолик)
                field[i][j] = isXturn ? FIELD_X : FIELD_0;
                isXturn = !isXturn; //меняем флаг хода
                repaint(); //перерисовка компонента, вызывает метод paintComponent()
                int res = checkState();
                if (res != 0) {
                    if (res == FIELD_0 * 3) {
                        //победил 0
                        JOptionPane.showMessageDialog(this, "нолики выйграли!", "Победа!", JOptionPane.INFORMATION_MESSAGE);
                    } else if (res == FIELD_X * 3) {
                        //победил Х
                        JOptionPane.showMessageDialog(this, "крестики выйграли!", "Победа!", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "ничья!", "Ничья!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    //перезапускаем игру
                    initGame();
                    //переписываем поле
                    repaint();
                }
            }
        }

    }


    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        //очищаем холст
        graphics.clearRect(0, 0, getWidth(), getHeight());
        //рисуем сетку из линий
        drawGrid(graphics);
        //рисуем текущие крестики-нолики
        //    graphics.setColor(Color.RED)
        //  graphics.drawOval(10, 10, 100, 100);
        drawXO(graphics);
    }

    void drawGrid(Graphics graphics) {
        int w = getWidth();
        int h = getHeight();
        int dw = w / 3;
        int dh = h / 3;
        graphics.setColor(Color.BLUE);
        for (int i = 1; i < 3; i++) {
            graphics.drawLine(0, dh * i, w, dh * i);
            graphics.drawLine(dw * i, 0, dw * i, h);
        }
    }

    void drawX(int i, int j, Graphics graphics) {
        graphics.setColor(Color.BLACK);
        int dw = getWidth() / 3;
        int dh = getHeight() / 3;
        int x = i * dw;
        int y = j * dh;
//линия от верхнего угла в правый нижний
        graphics.drawLine(x, y, x + dw, y + dh);
        //линия от левого нижнего угла до правого верхнего
        graphics.drawLine(x, y + dh, x + dw, y);
    }

    void drawO(int i, int j, Graphics graphics) {
        graphics.setColor(Color.BLACK);
        int dw = getWidth() / 3;
        int dh = getHeight() / 3;
        int x = i * dw;
        int y = j * dh;
        //для того, чтобы нолик был вытянут чуть по вертикали и не касался боковых стенок
        graphics.drawOval(x + 5 * dw / 100, y, dw * 9 / 10, dh);

    }

    void drawXO(Graphics graphics) {
//вложенные циклы
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                //если в данной ячейке крестик - рисуем его
                if (field[i][j] == FIELD_X) {
                    drawX(i, j, graphics);
                    //то же для нолика
                } else if (field[i][j] == FIELD_0) {
                    drawO(i, j, graphics);
                }
            }
        }
    }

    int checkState() {
        //проверяем диагонали
        int diag = 0;
        int diag2 = 0;
        for (int i = 0; i < 3; i++) {
            //сумма значений по диагонали от левого угла
            diag += field[i][i];
            //сумма значений по диагонали от правого угла
            diag2 += field[i][2 - i];
        }
        //если по диагонали стоят одни крестики или одни нолики выходим из метода
        if (diag == FIELD_0 * 3 || diag == FIELD_X * 3) {
            return diag;
            //то же самое для второй диагонали
        }
        if (diag2 == FIELD_0 * 3 || diag2 == FIELD_X * 3) {
            return diag2;
        }
        int check_i;
        int check_j;
        boolean hasEmpty = false;
        //будем бегать по всем рядам
        for (int i = 0; i < 3; i++) {
            check_i = 0;
            check_j = 0;
            for (int j = 0; j < 3; j++) {
                //суммируем знаки в текущем ряду
                if (field[i][j] == 0) {
                    hasEmpty = true;
                }
                check_i += field[i][j];
                check_j += field[j][i];
            }
            //если выигрыш крестика или нолика, то выходим
            if (check_i == FIELD_0 * 3 || check_i == FIELD_X * 3) {
                return check_i;
            }
            if (check_j == FIELD_0 * 3 || check_j == FIELD_X * 3) {
                return check_j;
            }
        }

        if (hasEmpty) {
            return 0;
        } else {
            return -1;
        }


    }
}




