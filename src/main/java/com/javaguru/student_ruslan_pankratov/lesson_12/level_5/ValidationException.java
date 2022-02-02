package com.javaguru.student_ruslan_pankratov.lesson_12.level_5;

import java.util.Objects;

class ValidationException extends Exception {

    // название валидационного правила, которое создало эту ошибку
    private String ruleName;

    // описание ошибки, которое можно показать на UI
    private String description;
    // название поля при проверке которого произошла эта ошибка
    // (Product: title, price, description),
    // UI сможет по этому названию показать ошибку рядом с нужным полем
    private String fieldName;

    public ValidationException(String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ValidationException)) return false;
        ValidationException that = (ValidationException) o;
        return Objects.equals(getRuleName(), that.getRuleName()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getFieldName(), that.getFieldName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRuleName(), getDescription(), getFieldName());
    }

}
