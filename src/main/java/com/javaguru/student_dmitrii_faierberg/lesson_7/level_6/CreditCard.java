package com.javaguru.student_dmitrii_faierberg.lesson_7.level_6;

/*
Свойства
-Номер карты
-Пин-код карты
-Баланс
-Кредитный лимит
-Задолженность по кредиту


Методы

-Зачисление средств на карту ("deposit")
-Снятие средств с карты ("withdraw")

При создании карты нужно указывать ее номер и пинкод.
Начальный баланс и задолженность по кредиту равны 0.
Кредитный лимит можно менять после создания карты.

Требования к снятию средств:
-При снятии средств с карты необходимо указывать пин-код и желаемую сумму;
-Если пин-коды не совпадают, операция по снятию денег должна быть отклонена;
-Деньги снимаются с карточного баланса. В случае, если их не хватает, остаток суммы нужно брать за счет задолженности по кредиту;
-Если сумма задолженности превышает кредитный лимит, операция по снятию денег должна быть отклонена;

Требования к зачислению средств:
-При зачислении средств на карту необходимо указывать пин-код и желаемую сумму;
-Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена;
-В первую очередь зачисление покрывает задолженность по кредиту;
-Если задолженность по кредиту равна 0, то остаток средств зачисляется в счет баланса;

Написать тестовые сценарии для класса CreditCard в классе CreditCardTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class  CreditCard {
    String cardNumber;
    private int pin;
    private double balance;
    private double creditLimit;
    private double creditDebt;

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCreditDebt() {
        return creditDebt;
    }

    public void setCreditLimit(double sum){
        creditLimit = sum;
    }

    CreditCard(int pin, String cardNumber){
        this.pin = pin;
        this.cardNumber = cardNumber;
        balance = 0;
        creditDebt = 0;
    }

    public void deposit(int pin, double sum){
        if (this.pin != pin){
            System.err.println("Wrong pin-code");
            return;
        }

        if (creditDebt > 0) {
            if (sum > creditDebt){
                sum -= creditDebt;
                creditDebt = 0;
                balance += sum;
            } else {
                creditDebt -= sum;
            }
        } else {
            balance += sum;
        }
    }

    public double withdraw(int pin, double sum){
        double result = 0;
        if (this.pin != pin){
            System.err.println("Wrong pin-code");
            return 0;
        }

        if (sum > balance){
            if (creditDebt + (sum - balance) > creditLimit){
                System.err.println("Credit debt exceed credit limit");
                return 0;
            }
            result += balance;
            sum -= balance;
            balance = 0;
            creditDebt += sum;
            result += sum;
        } else {
            result = sum;
            balance -= sum;
        }
        return result;
    }



}
