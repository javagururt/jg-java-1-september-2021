package com.javaguru.student_rodions_sokolovs.lesson_4.level_4;
//Создайте класс CalculatorTest и напишите тесты для
//всех методов класса Calculator из предыдущего задания.

class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorDemo calculatorDemo = new CalculatorDemo();
        calculatorDemo.sumTest();
        calculatorDemo.divisionTest();
        calculatorDemo.minusTest();
        calculatorDemo.multiplication();
        calculatorDemo.isEven();
        calculatorDemo.maxOfTwoNumbers();
        calculatorDemo.maxOfTwoNumbers2();
        calculatorDemo.maxOfTwoNumbers3();
        calculatorDemo.maxOfThreeNumbers();
        calculatorDemo.maxOfThreeNumbers2();
        calculatorDemo.maxOfThreeNumbers3();
        calculatorDemo.maxOfThreeNumbers4();
        calculatorDemo.maxOfThreeNumbers5();
        calculatorDemo.maxOfThreeNumbers6();
        calculatorDemo.maxOfThreeNumbers7();

    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");

        }
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int finalDivision = 2;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == finalDivision) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");

        }

    }

    public void minusTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int finalMinus = 5;
        Calculator calculator = new Calculator();
        int result = calculator.minus(firstNumber, secondNumber);
        if (result == finalMinus) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");

        }
    }
// Добавьте в класс CalculatorTest тесты для этого метода.
// Тесты должны покрывать следующие тестовые сценарии:
// - первое число больше второго
//- второе число больше первого
//- оба числа равны
// Создайте по одному тесту на каждый из сценариев!

    public void multiplication() {
        int firstNumber = 10;
        int secondNumber = 5;
        int finalMulti = 50;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        if (result == finalMulti) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");

        }


//        Добавьте в класс CalculatorTest тесты для этого метода.
//        Тесты должны покрывать следующие тестовые сценарии:
//        - первое число больше второго
//                - второе число больше первого
//                - оба числа равны
//        Создайте по одному тесту на каждый из сценариев!
    }
    public void isEven(){
        int number = 10;
        boolean expnum = true;

        Calculator calculator = new Calculator();
        boolean finalresult = calculator.isEven(number);
        if (expnum == finalresult) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }

    public void maxOfTwoNumbers() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expnum = 10;
        Calculator calculator = new Calculator();
        int finalresult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expnum == finalresult) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    public void maxOfTwoNumbers2() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expnum = 10;
        Calculator calculator = new Calculator();
        int finalresult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expnum == finalresult) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }

    }

    public void maxOfTwoNumbers3() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expnum = 10;
        Calculator calculator = new Calculator();
        int finalresult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expnum == finalresult) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }

    }

    //
//    Добавьте в класс CalculatorTest тесты для этого метода.
//    Тесты должны покрывать следующие тестовые сценарии:
//            - первое число больше второго и третьего
//- второе число больше первого и третьего
//- третье число больше первого и второго
//- первые два равны и больше третьего
//- ...
//        - три числа равны
//    По одному тесту на каждый из сценариев!
    public void maxOfThreeNumbers() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 2;
        int expnum = 10;

        Calculator calculator = new Calculator();
        int finalresult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (expnum == finalresult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }


    }

    public void maxOfThreeNumbers2() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 2;
        int expnum = 10;
        Calculator calculator = new Calculator();
        int finalresult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expnum == finalresult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }

    }

    public void maxOfThreeNumbers3() {
        int firstNumber = 2;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expnum = 10;
        Calculator calculator = new Calculator();
        int finalresult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expnum == finalresult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }


    }

    public void maxOfThreeNumbers4() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 5;
        int expnum = 10;
        Calculator calculator = new Calculator();
        int finalresult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expnum == finalresult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }

    }

    public void maxOfThreeNumbers5() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expnum = 10;
        Calculator calculator = new Calculator();
        int finalresult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expnum == finalresult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }

    }

    public void maxOfThreeNumbers6() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expnum = 10;
        Calculator calculator = new Calculator();
        int finalresult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expnum == finalresult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }


    }

    public void maxOfThreeNumbers7() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expnum = 10;
        Calculator calculator = new Calculator();
        int finalresult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expnum == finalresult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }

    }
}


