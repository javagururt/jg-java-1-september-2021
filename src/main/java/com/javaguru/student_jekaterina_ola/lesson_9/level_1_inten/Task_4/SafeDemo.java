package com.javaguru.student_jekaterina_ola.lesson_9.level_1_inten.Task_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SafeDemo {
    public static void main (String[] args){
        Safe safe = new Safe();
        safe.balance = 10000;
        safe.pinCode = 0;
        System.out.println("Safe balance" + safe.balance);
        System.out.println("Safe PinCode" + safe.pinCode);

    }
}
