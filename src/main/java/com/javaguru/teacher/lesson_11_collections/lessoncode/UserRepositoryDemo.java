package com.javaguru.teacher.lesson_11_collections.lessoncode;

import java.util.Scanner;

class UserRepositoryDemo {

    public static void main(String[] args) {
        UserRepository repository = new UserRepository();

        User user = new User();
        user.setLogin("borja");
        String userId = repository.save(user);
        System.out.println(userId);

        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        User userFromRepository = repository.getUser(id);
        System.out.println(userFromRepository);
    }
}
