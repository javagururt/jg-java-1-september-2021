package com.javaguru.student_deniss_lohins.lesson_9.level_1;

import java.math.BigDecimal;

class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe2 = new Safe2("qwertyy", 100.0);
        safe2.getMoney("qwert");
        safe2.getMoney("qwertyy");
        safe2.putMoney("qwertt", 100.0);
        safe2.putMoney("qwertyy", 1000.0);
        safe2.getMoney("qwertyy");
    }
}
