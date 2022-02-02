package com.javaguru.student_dmitrii_faierberg.lesson_12.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.List;
@CodeReview(approved = true)
class UserCredentials {
    private List<Role> roles;


    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }

    public List<Role> getRoles() {
        return roles;
    }



}
