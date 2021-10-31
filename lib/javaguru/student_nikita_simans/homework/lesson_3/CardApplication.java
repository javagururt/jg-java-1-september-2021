package com.javaguru.student_nikita_simans.homework.lesson_3;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CardApplication {

    public static void main(String[] args) {
        Card card = new Card("1234567890937456", "John Doe", "123");
        card.printInformation();
        System.out.println("--------------");
        card.printMaskedInformation();


    }
}
