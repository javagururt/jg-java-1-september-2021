package com.javaguru.student_deniss_lohins.lesson_16.level_1_2_3;

import java.util.ArrayList;

class MarsRoversControlApp {
    private int xPletauSize;
    private int yPletauSize;

    private ArrayList<MarsRover> roverArrayList = new ArrayList<MarsRover>();

    public MarsRoversControlApp(int xPletauSize, int yPletauSize) {
        this.xPletauSize = xPletauSize;
        this.yPletauSize = yPletauSize;
    }

    public boolean addRover(int xPosition, int yPosition, char orientation) {
        MarsRover marsRover = new MarsRover(xPosition, yPosition, orientation);
        marsRover.setxPletauSize(xPletauSize);
        marsRover.setyPletauSize(yPletauSize);
        roverArrayList.add(marsRover);
        return true;
    }

    public MarsRover selectRover(int number) {
        return roverArrayList.get(number);
    }

    public boolean finalPositionIsEmpty(int xPosition, int yPosition) {
        boolean result = true;
        for (int i = 0; i < roverArrayList.size(); i++) {
            if (roverArrayList.get(i).getxPosition() == xPosition) {
                if (roverArrayList.get(i).getyPosition() == yPosition) {
                    result = false;
                }
            }
        }
        return result;
    }

    public String moveRover(int roverNumber, String moves) {
/*
        return selectRover(roverNumber).moveRover(moves);
        String
*/
        MarsRover victim = new MarsRover(selectRover(roverNumber).getxPosition(),
                selectRover(roverNumber).getyPosition(), selectRover(roverNumber).getOrientation());
        victim.setxPletauSize(xPletauSize);
        victim.setyPletauSize(yPletauSize);
        victim.moveRover(moves);
        if (finalPositionIsEmpty(victim.getxPosition(), victim.getyPosition())){
            return selectRover(roverNumber).moveRover(moves);
            }else{
            return selectRover(roverNumber).getPosition();
        }


    }


}
