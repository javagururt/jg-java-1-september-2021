package com.javaguru.teacher.lesson_11_collections.lessoncode;

class UserHashDemo {

    public static void main(String[] args) throws InterruptedException {
        User user = new User();
        user.setLogin("borja");

        System.out.println(user.hashCode());
        User user2 = new User();
        user2.setLogin("borja");
        System.out.println(user2.hashCode());

        while (true) {
            Thread.sleep(1000);
            System.out.println("B");
        }
    }
}
