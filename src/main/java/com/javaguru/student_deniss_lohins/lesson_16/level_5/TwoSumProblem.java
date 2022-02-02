package com.javaguru.student_deniss_lohins.lesson_16.level_5;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "array/number можно удалить")
class TwoSumProblem {

    private int[] array;
    private int number;

    public String findSumOfTwo(int[] array, int number){
        this.array = array;
        this.number = number;
        for (int i = 0; i < array.length; i++) {
            for (int j = i +1; j < array.length; j++){
                if (array[i] + array[j] == number){
                    String result = "[" + i + " " + j + "]";
                    return result;
                }
            }
        }
        return "there are no result";
    }
}
