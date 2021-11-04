package com.javaguru.student_vadim_babchenok.lesson4_home.task11;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }


    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }


    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber > secondNumber) {
            System.out.println("a");
            return firstNumber;
        } else if (firstNumber < secondNumber) {
            System.out.println("b");
            return secondNumber;
        } else {
            System.out.println("c");
            System.out.println("Number is equal");
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {   // 2 3 5
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {  // 5 2 1
            System.out.println("a");
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) { // 2 5 3
            System.out.println("b");
            return secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) { // 2 3 5
            System.out.println("c"); // пойдёт сюда
            return thirdNumber;
        } else {  // 5 5 5
            return firstNumber;
        }
    }

}


