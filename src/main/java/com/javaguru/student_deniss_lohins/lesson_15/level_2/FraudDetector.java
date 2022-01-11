package com.javaguru.student_deniss_lohins.lesson_15.level_2;


import com.javaguru.student_deniss_lohins.lesson_14.level_3_4_5_6.Trader;

/*
Что вы скажете об этом коде?
Попробуйте критически оценить этот код.

Работает ли этот код корректно (особенно метод compareTraderName())?

Как убедиться в том, что этот код работает правильно? Что надо потребовать
от вашего коллеги, что бы убедить вас в том, что этот код работает правильно?

Подходящие ли имена выбраны для методов compareTraderName() и compareCity()?
Выражают ли имена методов compareTraderName() и compareCity() суть поставленной
бизнесом задачи или нет? Они просто сравнивают имена трейдеров и городов (с чем?)
или находят мошенников трейдеров и заблокированные для трейдинга города?

Правильные ли идентификаторы доступа выбраны для методов
isFraud(), compareTraderName() и compareCity()? Какие из этих методов должны
быть public а какие private?

Можно ли упростить код в методах isFraud(), compareTraderName() и compareCity()?
Особенно это касается if else логики. Если можно то как? Предложите свой вариант.
Напишите тесты и проведите рефакторинг.
 */
class FraudDetector {
    public boolean isFraud(Trader trader) {
        if (isTraderFraud(trader)){
            return true;
        }
        if(isTraderFromRestrictedCity(trader)) {
            return true;
        }
        return false;
    }



    private boolean isTraderFraud(Trader trader) {
        String traderName = trader.getName();
        if (traderName.equals("Pokemon")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isTraderFromRestrictedCity(Trader trader) {
        String cityName = trader.getCity();
        if (cityName.equals("Sidney")) {
            return true;
        } else {
            return false;
        }
    }

}
