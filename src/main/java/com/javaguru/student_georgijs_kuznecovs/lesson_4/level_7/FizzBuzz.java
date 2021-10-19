package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_7;

class FizzBuzz {
    public String detect(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz"; //System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            return "Fizz"; //System.out.println("Fizz");
        } else if (number % 5 == 0) {
            return "Buzz"; //System.out.println("Buzz");
        } else
            return "" + number;

    }
}
