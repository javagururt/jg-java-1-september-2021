package com.javaguru.student_ruslan_pankratov.lesson_12.level_1;

import java.io.FileNotFoundException;

//Task_5
class ExceptionDemo {
    public static void main(String[] args) {
        Exception exception = new RuntimeException();
        Exception exception1 = new FileNotFoundException();
        Exception exception2 = new Exception();
        Exception exception3 = new ArrayIndexOutOfBoundsException();
        Exception exception4 = new CloneNotSupportedException();

    }
}
