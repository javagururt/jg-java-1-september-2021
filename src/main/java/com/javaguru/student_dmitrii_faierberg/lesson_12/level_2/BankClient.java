package com.javaguru.student_dmitrii_faierberg.lesson_12.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankClient {
    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента


    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }


}
