package com.javaguru.student_Olga_T.lesson_6.level_4.tasks_14_18;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldBeSortedArray();
    }


    public void shouldBeSortedArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArr = {4, 3, 1, 89, 34, 12};
        int[] replaced = arrayUtil.sortBubble(myArr);
        if (replaced[0] == 1 && replaced[5] == 89) {
            System.out.println("shouldBeSortedArray OK");
        } else {
            System.out.println("shouldBeSortedArray FAIL");
        }
    }

}
