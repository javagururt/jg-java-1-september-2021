package com.javaguru.student_ruslan_pankratov.lesson_3.level_x;

//super_task_1
public class UserLoginService {
    public static void main(String[] args) {
        UserLoginService userLoginService = new UserLoginService();
        User user = new User("Rik", "Been123");
        user.login(user, "12312");
        user.login(user, "Been123");
        user.login(user, "1132131");
        user.login(user, "1132131");
        user.login(user, "1132131");
        user.login(user, "Been123");//теперь пользователь не может писать пароль
    }
}
