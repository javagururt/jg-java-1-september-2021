package com.javaguru.student_vadims_ilatovskis.lesson_3.level_4.phone;

import com.javaguru.student_vadims_ilatovskis.lesson_3.level_4.phone.Phone;

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}
