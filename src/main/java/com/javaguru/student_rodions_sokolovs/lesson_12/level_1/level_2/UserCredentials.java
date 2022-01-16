package com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_2;

import java.util.List;

public class UserCredentials {

    public List<Role> getRoles() {
        return roles;
    }

    public boolean ClientRole(Role role) {
        return roles.contains(role);
    }

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    private List<Role> roles;
}
