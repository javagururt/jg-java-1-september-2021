package com.javaguru.student_dmitrii_faierberg.lesson_4.level_4_junior;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoFirstShouldBeGreaterTest();
        calculatorTest.maxOfTwoSecondShouldBeGreaterTest();
        calculatorTest.maxOfTwoSouldBeEqualTest();
        calculatorTest.maxOfThreeFirstShouldBeGreatest();
        calculatorTest.maxOfThreeSecondShouldBeGreatest();
        calculatorTest.maxOfThreeThirdShouldBeGreatest();
        calculatorTest.maxOfThreeShouldBeEqual();
        calculatorTest.maxOfThreeFirstEqualSecondShouldBeGreater();
        calculatorTest.maxOfThreeFirstEqualThirdShouldBeGreater();
        calculatorTest.maxOfThreeSecondEqualThirdShouldBeGreater();
        // по аналогии реализуйте тесты для остальных методов
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

    public void subTest(){
        int firstNumber = 20;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        if (result == 15) System.out.println("Sub test = OK");
        else System.err.println("Sub test = FAIL");
    }

    public void mulTest(){
        int firstNumber = 20;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        if (result == 100) System.out.println("Mul test = OK");
        else System.err.println("Mul test = FAIL");
    }

    public void divTest(){
        int firstNumber = 20;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        if (result == 4) System.out.println("Div test = OK");
        else System.err.println("Div test = FAIL");
    }

    public void isEvenTest(){
        int firstNumber = 20;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        boolean firstResult = calculator.isEven(firstNumber);
        boolean secondResult = calculator.isEven(secondNumber);

        if (firstResult && !secondResult) System.out.println("isEven test = OK");
        else System.err.println("isEven test = FAIL");
    }

    public void maxOfTwoFirstShouldBeGreaterTest(){
        int firstNumber = 20;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) System.out.println("firstShouldBeGreaterTest = OK");
        else System.err.println("firstShouldBeGreaterTest = FALSE");
    }

    public void maxOfTwoSecondShouldBeGreaterTest(){
        int firstNumber = 5;
        int secondNumber = 20;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == secondNumber) System.out.println("secondShouldBeGreaterTest = OK");
        else System.err.println("secondShouldBeGreaterTest = FALSE");
    }

    public void maxOfTwoSouldBeEqualTest(){
        int firstNumber = 20;
        int secondNumber = 20;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) System.out.println("souldBeEqualTest = OK");
        else System.err.println("souldBeEqualTest = FALSE");
    }

    public void maxOfThreeFirstShouldBeGreatest(){
        int firstNumber = 40;
        int secondNumber = 10;
        int thirdNumber = 20;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (result == firstNumber) System.out.println("maxOfThreeFirstShouldBeGreatest = OK");
        else System.err.println("maxOfThreeFirstShouldBeGreatest = FALSE");
    }

    public void maxOfThreeSecondShouldBeGreatest(){
        int firstNumber = 10;
        int secondNumber = 40;
        int thirdNumber = 20;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (result == secondNumber) System.out.println("maxOfThreeSecondShouldBeGreatest = OK");
        else System.err.println("maxOfThreeSecondShouldBeGreatest = FALSE");
    }

    public void maxOfThreeThirdShouldBeGreatest(){
        int firstNumber = 20;
        int secondNumber = 10;
        int thirdNumber = 40;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (result == thirdNumber) System.out.println("maxOfThreeThirdShouldBeGreatest = OK");
        else System.err.println("maxOfThreeThirdShouldBeGreatest = FALSE");
    }

    public void maxOfThreeShouldBeEqual(){
        int firstNumber = 20;
        int secondNumber = 20;
        int thirdNumber = 20;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (result == thirdNumber) System.out.println("maxOfThreeShouldBeEqual = OK");
        else System.err.println("maxOfThreeShouldBeEqual = FALSE");
    }

    public void maxOfThreeFirstEqualSecondShouldBeGreater(){
        int firstNumber = 20;
        int secondNumber = 20;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (result == firstNumber) System.out.println("maxOfThreeFirstEqualSecondShouldBeGreater = OK");
        else System.err.println("maxOfThreeFirstEqualSecondShouldBeGreater = FALSE");
    }

    public void maxOfThreeFirstEqualThirdShouldBeGreater(){
        int firstNumber = 20;
        int secondNumber = 10;
        int thirdNumber = 20;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (result == firstNumber) System.out.println("maxOfThreeFirstEqualThirdShouldBeGreater = OK");
        else System.err.println("maxOfThreeFirstEqualThirdShouldBeGreater = FALSE");
    }

    public void maxOfThreeSecondEqualThirdShouldBeGreater(){
        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 20;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (result == secondNumber) System.out.println("maxOfThreeSecondEqualThirdShouldBeGreater = OK");
        else System.err.println("maxOfThreeSecondEqualThirdShouldBeGreater = FALSE");
    }



}
