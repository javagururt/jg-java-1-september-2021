package com.javaguru.student_georgijs_kuznecovs.lesson_5.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class Task_27 {
    public static void main(String[] args) {
        TaskService service = new TaskService();
        int[] numbers = new int[7];

        service.randomizer(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println();

        service.greatestNumber(numbers);

    }

}
