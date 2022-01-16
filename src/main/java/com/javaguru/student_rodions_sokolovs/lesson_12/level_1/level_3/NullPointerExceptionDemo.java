package com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_3;

public class NullPointerExceptionDemo {
    private static void printLength(String str) {
        System.out.println(str.length());
    }

    public static void main(String args[]) {
        String myString = null;
        printLength(myString);
    }
}
///Поскольку значение строки, переданной из метода main(), равно null, запуск приведенного выше кода вызывает исключение NullPointerException: