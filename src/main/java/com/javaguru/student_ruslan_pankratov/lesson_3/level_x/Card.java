package com.javaguru.student_ruslan_pankratov.lesson_3.level_x;

class Card {

    private String cardNumber;
    private String cardHolder;
    private String cvv;

    public Card(String cardNumber, String cardHolder, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cvv = cvv;
    }

    public String getCardHolder() {
        return cardHolder;
    }


    private String cardNumberString(String cardNumber){
        String[] arr = cardNumber.split("");
        String outNumber = "";
        int length = arr.length;
        for (int i = 0; i < length; i++) {
             if(i >= length - 4){
                 outNumber = outNumber + arr[i];
             } else {
                 outNumber = outNumber + "*";
             }
        }
        return outNumber;
    }

    private String cvvNumber(String number){
        String[] arr = number.split("");
        String outNumber = "";
        for (int i = 0; i < arr.length; i++) {
            outNumber = outNumber + "*";
        }
        return outNumber;
    }



    public void printInformation() {
        System.out.println("Card information: ");
        System.out.println("Card number = " + cardNumberString(cardNumber));
        System.out.println("Card holder = " + cardHolder);
        System.out.println("Card CVV = " + cvvNumber(cvv));
    }

    /*
  * task: add masking service
    Card information:
    Card number = ************1234
    Card holder = John Doe
    Card CVV = ***
     */
}