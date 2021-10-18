package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
