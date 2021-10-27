package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson4_home.task_11;

class CalculatorOrgTest {

    public static void main(String[] args) {
        CalculatorOrgTest calculatorOrgTest = new CalculatorOrgTest();
        calculatorOrgTest.testSum();
        calculatorOrgTest.substract();
        calculatorOrgTest.division();
        calculatorOrgTest.multyplay();
        calculatorOrgTest.isEven();
        calculatorOrgTest.maxOfTwoNumbersTest();
    }

     private void testSum() {
        CalculatorOrg calculator = new CalculatorOrg(); //сложение
        int result = calculator.sum(5,6);
         System.out.println(result);
         if (result == 11) {
             System.out.println("Sum test = OK");
         } else {
             System.err.println("Sum test = FAIL");
         }
     }

     private void substract() {  //вычитание
         CalculatorOrg calculator2 = new CalculatorOrg();
         int result = calculator2.substract(7,6);
         System.out.println(result);
         if (result == 1) {
             System.out.println("Substract test = OK");
         } else {
             System.err.println("Substract test = FAIL");
         }
     }
     private void division() {  //деление
         CalculatorOrg calculator3 = new CalculatorOrg();
         int result = calculator3.division(8,2);
         System.out.println(result);
         if (result == 4) {
             System.out.println("Division test = OK");
         } else {
             System.err.println("Division test = FAIL");
         }
     }

     private void multyplay() {  //умножение
         CalculatorOrg calculator4 = new CalculatorOrg();
         int result = calculator4.multyplay(3,10);
         System.out.println(result);
         if (result == 30) {
             System.out.println("Multyplay test = OK");
         } else {
             System.err.println("Multyplay test = FAIL");
         }
     }
     private void isEven() { //деление на 2
        CalculatorOrg calculator5 = new CalculatorOrg();
        int number=4;
        boolean result = calculator5.isEven(number);
        System.out.println(result);
        if (result) {
             System.out.println("isEven test = OK");
         } else {
             System.err.println("isEven test = FAIL");
         }

    }

    public void maxOfTwoNumbersTest() {
        CalculatorOrg calculator6 = new CalculatorOrg();

        int result = calculator6.maxOfTwoNumbers(8, 5);
        if (result == 8) { //pervoe boshe
            System.out.println("OK");
        } else {
            System.err.println("FAIL");
        }

        result = calculator6.maxOfTwoNumbers(8, 10);
        if (result == 10) { //vtoroe boshe
            System.out.println("OK");
        } else {
            System.err.println("FAIL");
        }

        result = calculator6.maxOfTwoNumbers(10, 10);
        if (result == 10) { //vtoroe boshe
            System.out.println("OK");
        } else {
            System.err.println("FAIL");
        }
    }

 }

