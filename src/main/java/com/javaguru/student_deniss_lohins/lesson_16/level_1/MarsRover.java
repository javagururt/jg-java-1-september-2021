package com.javaguru.student_deniss_lohins.lesson_16.level_1;

class MarsRover {
    int xPosition;
    int yPosition;
    char orientation;
    int xPletauSize;
    int yPletauSize;

    public MarsRover(String pletauSize, String positionAndOrientation) {
        char[] positionAndOrientationChar = positionAndOrientation.toCharArray();
        this.xPosition = Character.getNumericValue(positionAndOrientationChar[0]);
        this.yPosition = Character.getNumericValue(positionAndOrientationChar[2]);
        this.orientation = positionAndOrientationChar[4];
        char[] pletauSizeChar = pletauSize.toCharArray();
        xPletauSize = Character.getNumericValue(pletauSizeChar[0]);
        yPletauSize = Character.getNumericValue(pletauSizeChar[2]);
    }

    public String moveRover(String moves){

      char[] steps = moves.toCharArray();
        for (int i = 0; i < steps.length; i++) {
            performMove(steps[i]);
        }
        String finalPosition = xPosition + " " + yPosition + " " + orientation;
        return finalPosition;

    }

    public void performMove(char action){
       if(orientation == 'N'){
           switch(action){
               case 'M':
                    yPosition++;
                    break;
               case 'L':
                   orientation = 'W';
                   break;
               case 'R':
                   orientation = 'E';
                   break;
           }
       }else if(orientation == 'E'){
           switch(action){
               case 'M':
                   xPosition++;
                   break;
               case 'L':
                   orientation = 'N';
                   break;
               case 'R':
                   orientation = 'S';
                   break;
           }
       }else if(orientation == 'S'){
           switch(action){
               case 'M':
                   yPosition--;
                   break;
               case 'L':
                   orientation = 'E';
                   break;
               case 'R':
                   orientation = 'W';
                   break;
           }
       }else if (orientation == 'W'){
           switch(action){
               case 'M':
                   xPosition--;
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

//    private boolean moveIsPossible(char orientation, )
}
