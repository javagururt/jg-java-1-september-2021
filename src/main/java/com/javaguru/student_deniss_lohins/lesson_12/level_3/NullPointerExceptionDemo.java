package com.javaguru.student_deniss_lohins.lesson_12.level_3;

import java.util.Locale;

class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.toUpperCase(Locale.ROOT));
    }

    // так как строка s ровна пустоте (null), тогда с ней нельзя ничего сделать.
}
