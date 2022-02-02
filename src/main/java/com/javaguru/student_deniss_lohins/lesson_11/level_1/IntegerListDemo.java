package com.javaguru.student_deniss_lohins.lesson_11.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class IntegerListDemo {
    List<Integer> integers = new ArrayList<>();

    public void addToTheEnd(int integer){
        integers.add(integer);
    }

    public void addToTheBegining(int integer){
        integers.add(0, integer);
    }
    public int getListLength(List integers){
        return integers.size();
    }

    public void deleteElementByNumber(int number){
        integers.remove(number);
    }
    public void deleteElementByElement(Object object){
        integers.remove(object);
    }
    public boolean isListEmpty(){
        return integers.isEmpty();
    }
    public void printAllElements(){
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
    }
}
