package com.javaguru.student_Olga_T.lesson_2.level_x.task_3;

public class CorrectDataTypes {
    public static void main(String[] args) {
        double numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        double sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);

        /* Тут (https://www.w3schools.com/java/java_data_types.asp) они пишут, что лучше использовать double, поэтому я поставила везде double.
        "Use float or double?
        The precision of a floating point value indicates how many digits the value can have after the decimal point.
        The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits.
        Therefore it is safer to use double for most calculations."
        */


    }
}
