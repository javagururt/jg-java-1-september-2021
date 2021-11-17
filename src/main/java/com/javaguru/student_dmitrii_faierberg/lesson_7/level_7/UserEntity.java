package com.javaguru.student_dmitrii_faierberg.lesson_7.level_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UserEntity {
    private int id;
    private String name;
    private String surname;
    private String personalCode;

    UserEntity(int id, String name, String surname, String personalCode){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personalCode = personalCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }
}
