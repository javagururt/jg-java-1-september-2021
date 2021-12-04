package com.javaguru.student_ruslan_pankratov.lesson_9.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.pincode = 123123;
        safe.pincode = 21312;
        safe.amountOfMoney = 1000;
        safe.amountOfMoney = 100;
    }
}
