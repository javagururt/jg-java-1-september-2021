package com.javaguru.student_ruslan_pankratov.lesson_9.level_1;

class SafeVersionTwoTest {
    public static void main(String[] args) {
        SafeVersionTwo safeVersionTwo = new SafeVersionTwo(7777,10000);
        safeVersionTwo.getMoney(123213,1000);
        safeVersionTwo.getMoney(7777, 1000);
        safeVersionTwo.putMoney(7777, 2000);
        safeVersionTwo.putMoney(12312, 20001);
    }

}
