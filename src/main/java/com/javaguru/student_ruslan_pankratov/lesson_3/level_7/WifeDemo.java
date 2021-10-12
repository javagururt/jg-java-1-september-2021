package com.javaguru.student_ruslan_pankratov.lesson_3.level_7;

import com.javaguru.teacher.codereview.CodeReview;

//Tsk_24
@CodeReview(approved = true)
class WifeDemo {
    public static void main(String[] args) {
        Wife wife = new Wife();
        wife.showInitialState();
        wife.oneDayDiet();
        wife.eatCake();
        wife.embrace();
        wife.quarrel();
        wife.embrace();
    }

}