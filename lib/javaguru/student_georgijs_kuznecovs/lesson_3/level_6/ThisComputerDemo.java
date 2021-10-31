package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_6;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ThisComputerDemo {
    public static void main (String[] args) {
        ThisComputer lenovo = new ThisComputer("Lenovo", 2500, 1000);
        lenovo.descriptoin();

        ThisComputer dell = new ThisComputer("Dell", 1700, 1500);

        dell.cpu = 4300;

        dell.descriptoin();

    }
}
