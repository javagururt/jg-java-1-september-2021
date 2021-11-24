package com.javaguru.student_ruslan_pankratov.lesson_9.level_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Draw extends WinningPositions {

    boolean draw(int[][] arr) {
        Draw draw = new Draw();
        if (!draw.winPosition(arr, 1) ||
                !draw.winPosition(arr, 2)) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length + 1; j++) {
                    if (arr[i][j] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
