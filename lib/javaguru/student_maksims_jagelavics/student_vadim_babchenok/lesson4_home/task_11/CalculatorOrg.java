package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson4_home.task_11;


class CalculatorOrg {
    public int sum (int firstNumber, int secondNumber){ //сложение
        return firstNumber + secondNumber;
    }

    public int substract (int firstNumber,int secondNumber){//вычитание
        return firstNumber - secondNumber;
    }

    public int division ( int firstNumber, int secondNumber){//деление
        return firstNumber / secondNumber;
    }

    public int multyplay ( int firstNumber, int secondNumber){//умножение
        return firstNumber * secondNumber;
    }
    public boolean isEven(int number){return number/2==2;}

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }
    /*Добавьте в класс Calculator метод для определения
    максимального из трёх целых чисел.*/

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int result;
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }


}



