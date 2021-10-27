package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.lesson_3.lessoncode;

class Card {

    private String cardNumber;
    private String cardHolder;
    private String cvv;

    public Card(String cardNumber, String cardHolder, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getCvv() {
        return cvv;
    }

    public void printInformation() {
        System.out.println("Card information: ");
        System.out.println("Card number = " + cardNumber);
        System.out.println("Card holder = " + cardHolder);
        System.out.println("Card CVV = " + cvv);
    }

    /*
  * task: add masking service
    Card information:
    Card number = ************1234
    Card holder = John Doe
    Card CVV = ***
     */
}
