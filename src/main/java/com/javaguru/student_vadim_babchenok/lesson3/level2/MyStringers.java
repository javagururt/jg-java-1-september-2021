package com.javaguru.student_vadim_babchenok.lesson3.level2;

import java.util.Scanner;

public class MyStringers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String phrase1 = input.nextLine();
        System.out.println("Привет" +" "+ phrase1 + "!");
        System.out.println("Твоё имя состоит из "+phrase1.length()+ " букв");
        int vopros=15;//пусть строка вопрос (как тебя зовут) будет 15 знаков
        if (vopros > phrase1.length()){
            System.out.println( "Строка \"как тебя зовут?\""+" длинее строки твоего имени.");
        } else if (vopros < phrase1.length()){
            System.out.println( "Строка \"Как тебя зовут?\""+" короче строки твоего имени.");
        } else {
            System.out.println( "Строки равны.");
        }
    }




}
