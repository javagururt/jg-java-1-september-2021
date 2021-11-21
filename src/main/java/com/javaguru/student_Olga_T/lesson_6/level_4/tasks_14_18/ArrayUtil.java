package com.javaguru.student_Olga_T.lesson_6.level_4.tasks_14_18;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {

    public int[] sortBubble(int[] myArr) {

        boolean ifArrayIsSorted = false;
        while (!ifArrayIsSorted) {
            ifArrayIsSorted = true;

            for (int i = 1; i < myArr.length; i++) {
                if (myArr[i] < myArr[i - 1]) {
                    int tempBubble = myArr[i - 1];
                    myArr[i - 1] = myArr[i];
                    myArr[i] = tempBubble;
                    ifArrayIsSorted = false;
                }
            }
        }
        return myArr;
    }
}









