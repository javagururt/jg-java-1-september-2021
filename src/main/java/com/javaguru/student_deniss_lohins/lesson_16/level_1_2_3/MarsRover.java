package com.javaguru.student_deniss_lohins.lesson_16.level_1_2_3;

import java.util.Locale;

class MarsRover {
    private int xPosition;
    private int yPosition;
    private char orientation;
    private int xPletauSize;
    private int yPletauSize;

    public String getPosition(){
        return xPosition + " " + yPosition + " " + orientation;
    }
    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public char getOrientation() {
        return orientation;
    }

    public void setxPletauSize(int xPletauSize) {
        this.xPletauSize = xPletauSize;
    }

    public void setyPletauSize(int yPletauSize) {
        this.yPletauSize = yPletauSize;
    }


    public MarsRover(int xPosition, int yPosition, char orientation) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.orientation = orientation;
    }

    public String moveRover(String moves) {
        String movesUppercase = moves.toUpperCase(Locale.ROOT);
        char[] steps = movesUppercase.toCharArray();
        for (int i = 0; i < steps.length; i++) {
            performMove(steps[i]);
        }
        String finalPosition = xPosition + " " + yPosition + " " + orientation;
        return finalPosition;

    }

    public void performMove(char action) {
        if (orientation == 'N') {
            switch (action) {
                case 'M':
                    yPosition = checkBoundariesYAxis(1);
                    break;
                case 'L':
                    orientation = 'W';
                    break;
                case 'R':
                    orientation = 'E';
                    break;
            }
        } else if (orientation == 'E') {
            switch (action) {
                case 'M':
                    xPosition = checkBoundariesXAxis(1);
                    break;
                case 'L':
                    orientation = 'N';
                    break;
                case 'R':
                    orientation = 'S';
                    break;
            }
        } else if (orientation == 'S') {
            switch (action) {
                case 'M':
                    yPosition = checkBoundariesYAxis(-1);
                    break;
                case 'L':
                    orientation = 'E';
                    break;
                case 'R':
                    orientation = 'W';
                    break;
            }
        } else if (orientation == 'W') {
            switch (action) {
                case 'M':
                    xPosition = checkBoundariesXAxis(-1);
                    break;
                case 'L':
                    orientation = 'S';
                    break;
                case 'R':
                    orientation = 'N';
                    break;
            }
        }
    }

    private int checkBoundariesXAxis(int move) {
        if (xPosition + move >= 0 && xPosition + move <= xPletauSize) {
            return xPosition + move;
        } else {
            return xPosition;
        }
    }

    private int checkBoundariesYAxis(int move) {
        if (yPosition + move >= 0 && yPosition + move <= yPletauSize) {
            return yPosition + move;
        } else {
            return yPosition;
        }
    }
}
