package com.javaguru.student_Olga_T.lesson_3.level_x.task_1;


class UserLoginServiceTest {
    public static void main(String[] args) {

        UserLoginServiceTest test = new UserLoginServiceTest();
        test.test1CorrectLogin();
        test.test2WrongLogin();
        test.test3BlockedLogin();
        test.test4ResetTries();
    }

    public void test1CorrectLogin() {
        UserLoginService service = new UserLoginService();
        User user1 = new User("Vasja", "12345");
        service.login(user1, "12345");

        boolean checkLoginCorrect = service.login(user1, "12345");
        if (checkLoginCorrect) {
            System.out.println("test1CorrectLogin OK");
        } else {
            System.out.println("test1CorrectLogin FAIL");
        }
    }

    public void test2WrongLogin() {
        UserLoginService service = new UserLoginService();
        User user1 = new User("Vasja", "12345");
        service.login(user1, "12345");

        boolean checkLoginCorrect = service.login(user1, "125");
        if (!checkLoginCorrect) {
            System.out.println("test2WrongLogin OK");
        } else {
            System.out.println("test2WrongLogin FAIL");
        }
    }


    public void test3BlockedLogin() {
        UserLoginService service = new UserLoginService();
        User user1 = new User("Vasja", "12345");
        service.login(user1, "wrong_password");
        service.login(user1, "wrong_password");
        service.login(user1, "wrong_password");
        if (user1.blockedUser) {
            System.out.println("test3BlockedLogin OK");
        } else {
            System.out.println("test3BlockedLogin FAIL");
        }
    }

    public void test4ResetTries() {
        UserLoginService service = new UserLoginService();
        User user1 = new User("Vasja", "12345");
        service.login(user1, "wrong_password");
        service.login(user1, "wrong_password");
        service.login(user1, "12345");
        if (user1.tryConnect == 3) {
            System.out.println("test4ResetTries OK");
        } else {
            System.out.println("test4ResetTries FAIL");
        }
    }


}


