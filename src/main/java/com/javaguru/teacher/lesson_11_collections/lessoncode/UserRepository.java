package com.javaguru.teacher.lesson_11_collections.lessoncode;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class UserRepository {

    private Map<String, User> repository = new HashMap<>();

    public String save(User user) {
        String id = UUID.randomUUID().toString();
        repository.put(id, user);
        return id;
    }

    public User getUser(String id) {
        return repository.get(id);
    }
}
