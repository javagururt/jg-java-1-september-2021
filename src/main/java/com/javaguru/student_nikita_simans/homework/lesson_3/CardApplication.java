package com.javaguru.student_nikita_simans.homework.lesson_3;


class CardApplication {

    public static void main(String[] args) {
        Card card = new Card("1234567890937456", "John Doe", "123");
        card.printInformation();
        System.out.println("--------------");
        card.printMaskedInformation();


    }
}
