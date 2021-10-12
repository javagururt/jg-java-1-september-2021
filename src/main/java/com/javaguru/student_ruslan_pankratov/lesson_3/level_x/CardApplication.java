package com.javaguru.student_ruslan_pankratov.lesson_3.level_x;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CardApplication {

    public static void main(String[] args) {
        Card card = new Card("1234123412341234", "John Doe", "122313");
        card.printInformation();
    }
}