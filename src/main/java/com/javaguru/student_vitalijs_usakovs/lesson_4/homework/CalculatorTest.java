package com.javaguru.student_vitalijs_usakovs.lesson_4.homework;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.substractionTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplicationTest();

    }

    public void sumTest() {
        int number1 = 10;
        int number2 = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(number1, number2);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void substractionTest() {
        int number1 = 10;
        int number2 = 5;
        Calculator calculator = new Calculator();
        int result = calculator.substraction(number1, number2);
        if (result == 5) {
            System.out.println("Substraction test = OK");
        } else {
            System.out.println("Substraction test = FAIL");
        }
    }

    public void divisionTest() {
        int number1 = 10;
        int number2 = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(number1, number2);
        if (result == 2) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void multiplicationTest() {
        int number1 = 10;
        int number2 = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(number1, number2);
        if (result == 50) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

   /* public void isEven() {
        int number1 = 10;
        int number2 = 5;
        Calculator calculator = new Calculator();
        int result = calculator.isEven(number1, number2);
        if (result = true);{
            System.out.println("First number is EVEN.");
        } else (result = false);{
            System.out.println("Second number is EVEN.");}
*/
 /*   public void maxOfTwoNumbers() {
        int number1 = 10;
        int number2 = 5;
        Calculator calculator = new Calculator();
        int result = (number1, number2);
        if (number1 >= number2) {
            System.out.println("First number is GREATER than second number");
        } else {
            System.out.println("Second number is GREATER than first number");
        }
    }
*/
  /*  public void maxOfThreeNumbers(){
        int number1 = 10;
        int number2 = 5;
        int number3 = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(number1, number2, number3);
        if (int number1 >= int number2 && int number3){
            System.out.println("First number is GREATER than second number and third number.");
        } else if (int number2 >= int number3 && int number2 >= int number1){
            System.out.println("Second number is GREATER than first number and third number.");
        } else if (int number3 >= int number1 && int number3 >= int number2){
            System.out.println("Third number is GREATER than first number and second number.");
        } else if (int number1 == int number2 && int number1 >= int number3){
            System.out.println("First number = Second number >Third number");
        } else if (int number1 == int number3 && int number1 >= int number2){
            System.out.println("First number = Third number > Second number");
        } else if (int number2 == int number3 && int number3 >= int number1){
            System.out.println("Second number = Third number > First number");
        } else if (int number1 == int number2 && int number2 == int number3){
            System.out.println("First number = Second number > Third number");
        } else {System.out.println("No numbers was entered.");
*/
}