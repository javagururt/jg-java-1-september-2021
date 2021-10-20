package com.javaguru.student_dmitrii_faierberg.lesson_3.level_6.Task_24;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Parrot {
    private boolean isHungry = false;
    private boolean isSad = true;
    private String name;

    Parrot(String name){
        this.name = name;
    }
    void feed(){
        if (!isHungry) {
            System.out.println("Feeding...");
            System.out.println(name + " is not hungry yet");
            isHungry = true;
            isSad = false;
        }
        else System.out.println(name + " is not hungry");
    }
    void tweet(){
        if (isSad) System.out.println("Tweet(");
        else System.out.println("Tweet! Tweet!");
    }
}
