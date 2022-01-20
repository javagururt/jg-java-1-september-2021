package com.javaguru.student_nikita_simans.homework.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    List<Integer> integerList = new ArrayList<>();

    public void addElementToBeginning(int newElement){
        integerList.add(0,newElement);
    }

    public void addElementToEnd(int newElement){
        integerList.add(newElement);
    }
    public int getLength(){
        return integerList.size();
    }

    public void deleteByIndex(int index){
        integerList.remove(index);
    }
    public void deleteByName(Object object){
        integerList.remove(object);
    }
    public boolean isListEmpty(){
        return integerList.isEmpty();
    }
    public void printList(){
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
    }

    public static void main(String[] args) {
        IntegerListDemo target = new IntegerListDemo();
        target.addElementToBeginning(1);
        target.addElementToEnd(2);
        target.addElementToEnd(3);
        target.addElementToEnd(4);
        target.addElementToEnd(5);
        target.printList();
        System.out.println("----------------------");
        target.deleteByIndex(0);
        target.deleteByName(5);
        target.printList();
        System.out.println("----------------------");
        System.out.println("List is Empty: " + target.isListEmpty());
        System.out.println(target.getLength());
        target.deleteByIndex(0);
        target.deleteByIndex(0);
        target.deleteByIndex(0);
        System.out.println("----------------------");
        System.out.println("List is Empty: " + target.isListEmpty());


    }
}


