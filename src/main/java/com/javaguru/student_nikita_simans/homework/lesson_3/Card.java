package com.javaguru.student_nikita_simans.homework.lesson_3;

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
    //Пожалуйста, прокомментируйте закомментированный ниже код (printMaskedInformationWithInteger)
    //Идея была в том, чтобы перевести строку(cardNumber) в целое (i), затем взять последние 4
    //цифры (lastFourCharacters) как остаток от деления i на 10000 и вывести на консоль * n-раз + полученные последние
    // 4 цифры.
    // Если я создаю отдельный класс, в котором прогоняю данный алгоритм на различных строках, состоящих из цифр,
    // то все окей, но как толкьо попробовал интегрировать его в код, который мы на уроке писали, при вызове
    // метода выкидывает NumberFormatException. При этом. елси я правильно понял, то данная ошибка возникает при
    // невозможно сти перевести данные из одного типа в другой, но тут я не вижу причин для этого, так как cardNumber
    // у нас всегда состоит из чисел, а если в начале есть 1 или несколько нолей, то они "выкидываются", что не важно
    // для данной задачи.
    // Спасибо!


    /*public void printMaskedInformationWithInteger() {
        int i = Integer.parseInt(cardNumber.trim());
        int lastFourCharacters = i % 10000;
        System.out.println("Card information: ");
        System.out.println("************" + lastFourCharacters);
        System.out.println("Card holder = " + cardHolder);
        System.out.println("Card CVV = ***");
    }*/

    public void printMaskedInformation() {
        System.out.println("Card information: ");
        System.out.println("Card number = ************" + cardNumber.substring(12));
        System.out.println("Card holder = " + cardHolder);
        System.out.println("Card CVV = ***");
    }

    /*
  * task: add masking service
    Card information:
    Card number = ************1234
    Card holder = John Doe
    Card CVV = ***
     */
}