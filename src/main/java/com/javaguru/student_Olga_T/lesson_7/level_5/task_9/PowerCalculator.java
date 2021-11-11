package com.javaguru.student_Olga_T.lesson_7.level_5.task_9;

class PowerCalculator {



    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        powerCalculator.power(2, 3);
    }

    public int power(int someNumber, int powerOfSomeNumber) {
        int result = 1;
        for (int i = 1; i <= powerOfSomeNumber; i++) {
            result = result * someNumber;
        }
        System.out.println(someNumber + " ^ " + powerOfSomeNumber + " = " + result + ".");
        return result;
    }


}

