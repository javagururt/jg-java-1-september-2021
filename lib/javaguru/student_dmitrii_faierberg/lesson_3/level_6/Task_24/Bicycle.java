package com.javaguru.student_dmitrii_faierberg.lesson_3.level_6.Task_24;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Bicycle {
    int transmission = 1;
    boolean areBreakesOn = false;
    boolean isRiding = false;

    void setTransmission(int transmission){
        if (transmission >= 1 && transmission <= 11){
            System.out.println("The speed was changed from " + this.transmission + " to "
            + transmission);
            this.transmission = transmission;
        }
        else System.err.println("This speed does not exist");
    }
    void ride(){
        if (isRiding) System.out.println("The bike is moving already");
        else {
            isRiding = true;
            areBreakesOn = false;
            System.out.println("We are riding");
        }
    }

    void stop(){
        if (areBreakesOn) System.out.println("The bike is stopped already");
        else {
            areBreakesOn = true;
            isRiding = false;
            System.out.println("The bike is stopped");
        }
    }
}
