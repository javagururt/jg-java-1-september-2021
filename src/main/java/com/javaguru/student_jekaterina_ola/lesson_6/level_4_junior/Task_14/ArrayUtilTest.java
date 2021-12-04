package com.javaguru.student_jekaterina_ola.lesson_6.level_4_junior.Task_14;

public class ArrayUtilTest {
    public static void main (String[] args){
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldBeSortedArray();

    }

    public void shouldBeSortedArray(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = {9, 24, 7, 3, 52, 1};
        int[] replaced = arrayUtil.sortBubble(myArray);
        if (replaced[0] == 3 && replaced[5] == 24){
            System.out.println("Should Be Sorted - OK");
        }else {
            System.out.println("Should Be Sorted - FALSE");
        }
    }
}
