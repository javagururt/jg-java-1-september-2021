package com.javaguru.student_ruslan_pankratov.lesson_8.level_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MAthOperationDemoTest {

    public static void main(String[] args) {
      MAthOperationDemoTest demoTest = new MAthOperationDemoTest();
      demoTest.additionTest();
      demoTest.subtractionTest();
      demoTest.divisionTest();
      demoTest.multiplicationTest();
    }

    void additionTest() {
        Argument arg1 = new Argument(30);
        Argument arg2 = new Argument(25);
        MathOperation result = new Addition(arg1, arg2);

        double expectedResult = 55.0;
        method(expectedResult,result.calculate(),"additionTest");
    }


    void subtractionTest(){
        Argument arg1 = new Argument(100);
        Argument arg2 = new Argument(30);

        MathOperation result = new Subtraction(arg1, arg2);
        double expectedResult = 70.0;

        method(expectedResult, result.calculate(), "subtractionTest");
    }


    void divisionTest(){
        Argument arg1 = new Argument(100);
        Argument arg2 = new Argument(10);

        MathOperation result = new Division(arg1, arg2);
        double expectedResult = 10.0;

        method(expectedResult,result.calculate(), "divisionTest");
    }

    void multiplicationTest(){
        Argument arg1 = new Argument(100);
        Argument arg2 = new Argument(10);

        MathOperation result = new Multiplication(arg1, arg2);
        double expectedResult = 1000.0;

        method(expectedResult,result.calculate(), "multiplicationTest");
    }


    void method(double expectedResult, double result, String name) {
        if (expectedResult == result) {
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIL");
        }

    }
}
