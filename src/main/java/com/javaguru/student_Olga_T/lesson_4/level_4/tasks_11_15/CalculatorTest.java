package com.javaguru.student_Olga_T.lesson_4.level_4.tasks_11_15;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.numbersAddition();
        calculatorTest.numbersSubtraction();
        calculatorTest.numbersMultiplication();
        calculatorTest.numbersDivision();
        calculatorTest.isEven();
        calculatorTest.firstNumberIsLargest();
        calculatorTest.secondNumberIsLargest();
        calculatorTest.numbersAreEqual();
        calculatorTest.maxOfThreeNumbers1();
        calculatorTest.maxOfThreeNumbers2();
        calculatorTest.maxOfThreeNumbers3();
        calculatorTest.maxOfThreeNumbers4();
        calculatorTest.maxOfThreeNumbers5();
        calculatorTest.maxOfThreeNumbers6();
        calculatorTest.maxOfThreeNumbers7();
        calculatorTest.maxOfThreeNumbers8();
    }

    public void numbersAddition() {
        float firstNumber = 10;
        float secondNumber = 5;
        Calculator calculator = new Calculator();
        float result = calculator.numbersAddition(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("numbersAddition test = OK");
        } else {
            System.out.println("numbersAddition test = FAIL");
        }
    }

    public void numbersSubtraction() {
        float firstNumber = 10;
        float secondNumber = 5;
        Calculator calculator = new Calculator();
        float result = calculator.numbersSubtraction(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("numbersSubtraction test = OK");
        } else {
            System.out.println("numbersSubtraction test = FAIL");
        }
    }

    public void numbersMultiplication() {
        float firstNumber = 10;
        float secondNumber = 5;
        Calculator calculator = new Calculator();
        float result = calculator.numbersMultiplication(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("numbersMultiplication test = OK");
        } else {
            System.out.println("numbersMultiplication test = FAIL");
        }
    }

    public void numbersDivision() { //Почему выдает FAIL?
        float firstNumber = 11;
        float secondNumber = 5;
        Calculator calculator = new Calculator();
        float result = calculator.numbersDivision(firstNumber, secondNumber);
        System.out.println(result);
        if (result == 2.2) {
            System.out.println("numbersDivision test = OK");
        } else {
            System.out.println("numbersDivision test = FAIL");
        }
    }

    public void isEven() {
        float firstNumber = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        if (result) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void firstNumberIsLargest() {
        float firstNumber = 10;
        float secondNumber = 5;
        Calculator calculator = new Calculator();
        float result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) {
            System.out.println("firstNumberIsLargest test = OK");
        } else {
            System.out.println("firstNumberIsLargest test = FAIL");
        }
    }

    public void secondNumberIsLargest() {
        float firstNumber = 5;
        float secondNumber = 10;
        Calculator calculator = new Calculator();
        float result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == secondNumber) {
            System.out.println("secondNumberIsLargest test = OK");
        } else {
            System.out.println("secondNumberIsLargest test = FAIL");
        }
    }

    public void numbersAreEqual() {
        float firstNumber = 10;
        float secondNumber = 10;
        Calculator calculator = new Calculator();
        float result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == -10000000) {
            System.out.println("numbersAreEqual test = OK");
        } else {
            System.out.println("numbersAreEqual test = FAIL");
        }
    }

    public void maxOfThreeNumbers1() {
        float firstNumber = 15;
        float secondNumber = 10;
        float thirdNumber = 5;
        Calculator calculator = new Calculator();
        float result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("maxOfThreeNumbers1 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers1 test = FAIL");
        }
    }


    public void maxOfThreeNumbers2() {
        float firstNumber = 15;
        float secondNumber = 20;
        float thirdNumber = 5;
        Calculator calculator = new Calculator();
        float result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == secondNumber) {
            System.out.println("maxOfThreeNumbers2 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers2 test = FAIL");
        }
    }

    public void maxOfThreeNumbers3() {
        float firstNumber = 15;
        float secondNumber = 20;
        float thirdNumber = 35;
        Calculator calculator = new Calculator();
        float result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == thirdNumber) {
            System.out.println("maxOfThreeNumbers3 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers3 test = FAIL");
        }
    }

    public void maxOfThreeNumbers4() {
        float firstNumber = 20;
        float secondNumber = 20;
        float thirdNumber = 5;
        Calculator calculator = new Calculator();
        float result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("maxOfThreeNumbers4 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers4 test = FAIL");
        }
    }

    public void maxOfThreeNumbers5() {
        float firstNumber = 20;
        float secondNumber = 20;
        float thirdNumber = 30;
        Calculator calculator = new Calculator();
        float result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == thirdNumber) {
            System.out.println("maxOfThreeNumbers5 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers5 test = FAIL");
        }
    }

    public void maxOfThreeNumbers6() {
        float firstNumber = 50;
        float secondNumber = 20;
        float thirdNumber = 50;
        Calculator calculator = new Calculator();
        float result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("maxOfThreeNumbers6 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers6 test = FAIL");
        }
    }

    public void maxOfThreeNumbers7() {
        float firstNumber = 20;
        float secondNumber = 20;
        float thirdNumber = 20;
        Calculator calculator = new Calculator();
        float result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("maxOfThreeNumbers7 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers7 test = FAIL");
        }
    }

    public void maxOfThreeNumbers8() {
        float firstNumber = 50;
        float secondNumber = 70;
        float thirdNumber = 50;
        Calculator calculator = new Calculator();
        float result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == secondNumber) {
            System.out.println("maxOfThreeNumbers8 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers8 test = FAIL");
        }
    }


}




