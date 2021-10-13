package com.javaguru.student_deniss_lohins.lesson_3.level_x;

class UserLoginService {

    public static void main(String[] args) {
    User user1 = new User("Deniss", "qwerty");
    user1.printData();
    user1.login("deniss", "qaqweqewq");
    user1.printData();
    user1.login("Deniss", "qwerty");

    }
}
