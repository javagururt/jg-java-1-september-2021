package com.javaguru.student_vitalijs_usakovs.lesson_3.Homework;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Phone {
    private String model;
    public Phone(String newModel) {
        this.model = newModel;
    }
    public String getModel() {
        return this.model;
    }
}
class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}