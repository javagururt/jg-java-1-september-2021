package com.javaguru.student_deniss_lohins.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subsTest();
        calculatorTest.multiplyTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.firstMaxOfTreeNumbersTest();
        calculatorTest.secondMaxOfTreeNumbersTest();
        calculatorTest.thirdMaxOfTreeNumbersTest();
        calculatorTest.firstTwoMaxOfTreeNumbersTest();
        calculatorTest.firstAndLastMaxOfTreeNumbersTest();
        calculatorTest.secondAndLastMaxOfTreeNumbersTest();
        calculatorTest.allMaxOfTreeNumbersTest();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator victim = new Calculator();
        int result = victim.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.err.println("Sum test = FAIL");
        }
    }
    public void subsTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator victim = new Calculator();
        int result = victim.subs(firstNumber, secondNumber);
        int expectedResult = 5;
        if(result == expectedResult){
            System.out.println("Substraction test = OK");
        }else{
            System.err.println("Substraction test = FAIL");
        }
       }
       public void multiplyTest(){
           int firstNumber = 10;
           int secondNumber = 5;
           Calculator victim = new Calculator();
           int result = victim.multiply(firstNumber, secondNumber);
           int expectedResult = 50;
           if(result == expectedResult){
               System.out.println("Multiply test = OK");
           }else{
               System.err.println("Multiply test = FAIL");
           }
       }

       public void divisionTest(){
           int firstNumber = 10;
           int secondNumber = 5;
           Calculator victim = new Calculator();
           int result = victim.division(firstNumber, secondNumber);
           int expectedResult = 2;
           if(result == expectedResult){
               System.out.println("Division test = OK");
           }else{
               System.err.println("Division test = FAIL");
           }
       }
       public void isEvenTest(){
        int firstNumber = 10;
        int secondNumber = 1;
        Calculator victim = new Calculator();
        boolean test1 = victim.isEven(firstNumber);
        boolean test2 = victim.isEven(secondNumber);
        if (test1 == true){
            if (test2 == false){
            System.out.println("Is Even test = OK");
            }else{
                System.err.println("Second Is Even test = FAIL");
            }
        }else{
            System.err.println("First Is Even test = FAIL");
        }
       }

       public void maxOfTwoNumbersTest(){
        int firstNumber = 41;
        int secondNumber = 2;
        Calculator victim = new Calculator();
        int firstResult = victim.maxOfTwoNumbers(firstNumber, secondNumber);
        int secondResult = victim.maxOfTwoNumbers(secondNumber, firstNumber);
        if(firstResult == secondResult){
            System.out.println("Max of two numbers test = OK");
        }else {
            System.err.println("Max of two numbers test = FAIL");
        }
       }

       public void firstMaxOfTreeNumbersTest(){
        int firstNumber = 0;
        int secondNumber = 420;
        int thirdNumber = -92;
        Calculator victim = new Calculator();
        if (victim.maxOfTreeNumbers(secondNumber, firstNumber, thirdNumber) == secondNumber){
            System.out.println("firstMaxOfTreeNumbersTest = Ok");
        }else{
            System.err.println("firstMaxOfTreeNumbersTest = FAIL");
        }
       }

    public void secondMaxOfTreeNumbersTest(){
        int firstNumber = 0;
        int secondNumber = 420;
        int thirdNumber = -92;
        Calculator victim = new Calculator();
        if (victim.maxOfTreeNumbers(firstNumber, secondNumber, thirdNumber) == secondNumber){
            System.out.println("secondMaxOfTreeNumbersTest = Ok");
        }else{
            System.err.println("secondMaxOfTreeNumbersTest = FAIL");
        }
    }

    public void thirdMaxOfTreeNumbersTest(){
        int firstNumber = 0;
        int secondNumber = 420;
        int thirdNumber = -92;
        Calculator victim = new Calculator();
        if (victim.maxOfTreeNumbers(firstNumber, thirdNumber, secondNumber) == secondNumber){
            System.out.println("thirdMaxOfTreeNumbersTest = Ok");
        }else{
            System.err.println("thirdMaxOfTreeNumbersTest = FAIL");
        }
    }

    public void firstTwoMaxOfTreeNumbersTest(){
        int firstNumber = 0;
        int secondNumber = 420;
        int thirdNumber = -92;
        Calculator victim = new Calculator();
        if (victim.maxOfTreeNumbers(secondNumber, secondNumber, thirdNumber) == secondNumber){
            System.out.println("firstTwoMaxOfTreeNumbersTest = Ok");
        }else{
            System.err.println("firstTwoMaxOfTreeNumbersTest = FAIL");
        }
    }

    public void firstAndLastMaxOfTreeNumbersTest(){
        int firstNumber = 0;
        int secondNumber = 420;
        int thirdNumber = -92;
        Calculator victim = new Calculator();
        if (victim.maxOfTreeNumbers(secondNumber, firstNumber, secondNumber) == secondNumber){
            System.out.println("firstAndLastMaxOfTreeNumbersTest = Ok");
        }else{
            System.err.println("firstAndLastMaxOfTreeNumbersTest = FAIL");
        }
    }

    public void secondAndLastMaxOfTreeNumbersTest(){
        int firstNumber = 0;
        int secondNumber = 420;
        int thirdNumber = -92;
        Calculator victim = new Calculator();
        if (victim.maxOfTreeNumbers(thirdNumber, secondNumber, secondNumber) == secondNumber){
            System.out.println("secondAndLastMaxOfTreeNumbersTest = Ok");
        }else{
            System.err.println("secondAndLastMaxOfTreeNumbersTest = FAIL");
        }
    }

    public void allMaxOfTreeNumbersTest(){
        int firstNumber = 0;
        int secondNumber = 420;
        int thirdNumber = -92;
        Calculator victim = new Calculator();
        if (victim.maxOfTreeNumbers(secondNumber, secondNumber, secondNumber) == secondNumber){
            System.out.println("allMaxOfTreeNumbersTest = Ok");
        }else{
            System.err.println("allMaxOfTreeNumbersTest = FAIL");
        }
    }
}
