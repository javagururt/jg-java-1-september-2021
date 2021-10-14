package com.javaguru.student_ruslan_pankratov.lesson_6.level_1;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenTest();
        calculatorTest.isEvenFalseTest();
    }

    void isEvenTest(){
        Calculator calculator = new Calculator();

       boolean result = calculator.isEven(8);
        boolean expectedResult = true;

        method(result,expectedResult,"isEvenTest");
    }

    void isEvenFalseTest(){
        Calculator calculator = new Calculator();

        boolean result = calculator.isEven(9);
        boolean expectedResult = false;

        method(result,expectedResult,"isEvenFalseTest");
    }


    void method(boolean result, boolean expectedResult, String name){
        if(result == expectedResult){
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIL");
        }
    }
}
