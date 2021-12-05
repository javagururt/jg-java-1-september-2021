package com.javaguru.student_jekaterina_ola.lesson_6.level_3_junior.Task_9_13;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldContainNumber();
        arrayUtilTest.shouldNotContainNumber();
        arrayUtilTest.shouldReplaceNumber();
        arrayUtilTest.shouldReplaceAllNumbers();
        arrayUtilTest.howManyEqualNumbersContainArray();
    }


    public void shouldContainNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.fillArrayWithNumbers();
        if (arrayUtil.checkNumber(9, array)) {
            System.out.println("Should contain number - OK");
        } else
            System.out.println("Should contain number - FAIL");
    }

    public void shouldNotContainNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.fillArrayWithNumbers();
        if (arrayUtil.checkNumber(9, array)){
            System.out.println("Should not contain number - OK");
        }else
            System.out.println("Sould not contain number - FAIL");
    }

    public void shouldReplaceNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.fillArrayWithNumbers();
        int[] replace = arrayUtil.replace (array, 15,0);
        if (replace[1] == 0){
            System.out.println("Should replace number - OK");
        } else
            System.out.println("Should replace number - FAIL");
    }

    public void shouldReplaceAllNumbers(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.fillArrayWithNumbers();
        int[] replace = arrayUtil.replaceAll(array, 9, 50);
        if (replace[1] == 50){
            System.out.println("Should replace all numbers - OK");
        }else
            System.out.println("Should replace all numbers - FAIL");

    }

    public void howManyEqualNumbersContainArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.fillArrayWithNumbers();
        if (arrayUtil.howManyEqualNumbersContainArray(7, array) == 4) {
            System.out.println("How many equal numbers in array - OK");
        } else
            System.out.println("How many equal numbers in array - FAIL");
    }
}
