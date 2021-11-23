package com.javaguru.student_ruslan_pankratov.lesson_9.level_5;

class Transaction {

    private Trader trader;
    private int amount;

    public Trader getTrader() {
        return trader;
    }


    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }
}
