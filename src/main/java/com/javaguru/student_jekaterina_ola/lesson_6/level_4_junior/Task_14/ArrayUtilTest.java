package com.javaguru.student_jekaterina_ola.lesson_6.level_4_junior.Task_14;

public class ArrayUtilTest {
    public static void main (String[] args){
        ArrayUtilTest arrayUtiltest = new ArrayUtilTest();
        arrayUtiltest.shouldSortArray();
    }

    public void shouldSortArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {5, 85, 1, 3, 46, 12};
        int[] replaced = arrayUtil.sortBubble(array);
        if (replaced[5] == 8 && replaced[46] == 12) {
            System.out.println("Should sort array - OK");
        } else {
            System.out.println("Should sort array - FAIL");
        }

    }
}
