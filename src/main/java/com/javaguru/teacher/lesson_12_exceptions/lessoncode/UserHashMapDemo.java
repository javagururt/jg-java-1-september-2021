package com.javaguru.teacher.lesson_12_exceptions.lessoncode;

import java.util.HashMap;
import java.util.Map;

class UserHashMapDemo {

    public static void main(String[] args) {
        Map<User, String> userStringMap = new HashMap<>();
        userStringMap.put(new User(1), "A");
        userStringMap.put(new User(2), "B");
        System.out.println(userStringMap);

        String firstUserValue = userStringMap.get(new User(1));
        System.out.println(firstUserValue);

        String secondUserValue = userStringMap.get(new User(2));
        System.out.println(secondUserValue);
    }
}
