package com.javaguru.student_Jegor_Rutkovsky.lesson_5.level_5_6;

//Task_31 - Task_41
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldPrintArrayToConsole();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }
    public void shouldFillArrayWithRandomNumbers(){

    }

    public void shouldPrintArrayToConsole(){
        int[] array = {1, 2, 3};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArrayToConsole(array);
    }

    public void shouldCreateArray(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] victim = arrayUtil.createArray(10);
        int expected = 10;
            if (victim.length == expected){
                System.out.println("shouldCreateArray: PASSED, actual arrayLength: " +victim.length+ ", expected length: " +expected);
            }else {
                System.err.println("shouldCreateArray: FAIL, actual arrayLength: " +victim.length+ ", expected length: " +expected);
            }
    }

    public void shouldFindMaxNumber(){
        int[] array = {1, 2, 3};
        int expected = 3;
        ArrayUtil victim = new ArrayUtil();
        int actual = victim.findMaxNumber(array);
        if (actual == expected){
            System.out.println("ShouldFindMaxNumber: SUCCESS, expected: " +expected+ ", actual: " +actual);
        }else {
            System.err.println("ShouldFindMaxNumber: FAILED, expected: " +expected+ ", actual: " +actual);
        }
    }
    public void shouldFindMinNumber(){
        int[] array = {1,2,3};
        int expected = 1;
        ArrayUtil victim = new ArrayUtil();
        int actual = victim.findMinNumber(array);
        if (expected == actual){
            System.out.println("ShouldFindMinNumber: SUCCESS, expected: " +expected+ ", actual: " +actual);
        }else {
            System.err.println("ShouldFindMinNumber: FAILED, expected: " +expected+ ", actual: " +actual);
        }
    }
}
