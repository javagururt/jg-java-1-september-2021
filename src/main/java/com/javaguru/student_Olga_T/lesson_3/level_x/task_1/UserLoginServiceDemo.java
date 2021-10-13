package com.javaguru.student_Olga_T.lesson_3.level_x.task_1;


class UserLoginServiceDemo {
    public static void main(String[] args) {

        UserLoginService service = new UserLoginService();
        User userOne = new User("Vasja", "12345");
        service.login(userOne, "1111"); //Should return false
        service.login(userOne, "12345"); //Should return true

        boolean check = service.login(userOne, "12345");
        if (check) {
            System.out.println("Password correct.");
        } else {
            System.out.println("Wrong password.");
        }

    }
}








