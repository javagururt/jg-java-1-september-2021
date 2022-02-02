package com.javaguru.student_ruslan_pankratov.lesson_16.level_1;

import java.util.Arrays;
import java.util.Objects;

class MarsRover {
   private String compass;
   private int[] currentCoordinates = new int[2];
   private int[] endCoordinates = new int[2] ;
   private String numberRover;


    public MarsRover(String compass, int[] endCoordinates, String numberRover) {
        this.compass = compass;

        this.endCoordinates = endCoordinates;
        this.numberRover = numberRover;
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "compass='" + compass + '\'' +
                ", currentCoordinates=" + Arrays.toString(currentCoordinates) +
                ", endCoordinates=" + Arrays.toString(endCoordinates) +
                ", numberRover='" + numberRover + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MarsRover)) return false;
        MarsRover marsRover = (MarsRover) o;
        return Objects.equals(getCompass(), marsRover.getCompass()) && Arrays.equals(getCurrentCoordinates(), marsRover.getCurrentCoordinates()) && Arrays.equals(getEndCoordinates(), marsRover.getEndCoordinates()) && Objects.equals(getNumberRover(), marsRover.getNumberRover());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getCompass(), getNumberRover());
        result = 31 * result + Arrays.hashCode(getCurrentCoordinates());
        result = 31 * result + Arrays.hashCode(getEndCoordinates());
        return result;
    }

    public String getCompass() {
        return compass;
    }

    public void setCompass(String compass) {
        this.compass = compass;
    }

    public int[] getCurrentCoordinates() {
        return currentCoordinates;
    }

    public void setCurrentCoordinates(int[] currentCoordinates) {
        this.currentCoordinates = currentCoordinates;
    }

    public int[] getEndCoordinates() {
        return endCoordinates;
    }

    public void setEndCoordinates(int[] endCoordinates) {
        this.endCoordinates = endCoordinates;
    }

    public String getNumberRover() {
        return numberRover;
    }

}
