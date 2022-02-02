package com.javaguru.student_ruslan_pankratov.lesson_13.level_1;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    public static void main(String[] args) {
        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();
        taxCalculator.calculateTax(new BigDecimal(200000));
    }

    @Override
    public BigDecimal calculateTax(BigDecimal income) {


        if (income.compareTo(new BigDecimal("20000")) <= 0) {
            BigDecimal result = income.multiply(new BigDecimal("0.25"));

            return result;
        } else {
            BigDecimal firstPieceOfMoney = new BigDecimal("20000");
            BigDecimal theRest = income.subtract(firstPieceOfMoney);
            theRest = theRest.multiply(new BigDecimal("0.40"));
            firstPieceOfMoney = firstPieceOfMoney.multiply(new BigDecimal("0.25"));
            BigDecimal sum = theRest.add(firstPieceOfMoney);
            return sum;
        }
        //income.compareTo(new BigDecimal(20000)) <=0   будет решение до 20 тыс
        //income.compareTo(new BigDecimal(20000)) <= 1)  такое решение позволяет мне записывать больше 20 тыс
        // то есть не работает, если мы меняем ноль, тогда метод не будет работать, даже если написать 200 тыс он тоже
        // не отработает, и вместо нуля можем любом число написать, то тогда и работать не будет
        //ноль по сути это запуск самой программы, это выглядит вот так income <= (new BigDecimal(20000)) всё

    }
}
