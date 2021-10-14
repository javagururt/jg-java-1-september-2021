package com.javaguru.student_ruslan_pankratov.lesson_3.level_4;

import com.javaguru.teacher.codereview.CodeReview;

//Task_15
@CodeReview(approved = true)
class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}