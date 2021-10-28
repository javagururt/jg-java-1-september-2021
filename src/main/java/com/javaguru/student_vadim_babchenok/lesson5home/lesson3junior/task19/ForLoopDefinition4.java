package com.javaguru.student_vadim_babchenok.lesson5home.lesson3junior.task19;
//Найдите логическую ошибку в программе и исправить её:
//PS: программа должна выводить на консоль числа от 0 до 9.
public class ForLoopDefinition4 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
//в цикле был постфиксный инкремент, а если увеличить надо ++ декремент