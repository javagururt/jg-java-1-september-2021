package com.javaguru.student_dmitrii_faierberg.lesson_12.level_5_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Objects;
@CodeReview(approved = true)
class ValidationException extends Exception{
    String ruleName;
    String description;
    Product product;
    String fieldName;

    public ValidationException(String validationRule, String description, Product product, String fieldName) {
        this.ruleName = validationRule;
        this.description = description;
        this.product = product;
        this.fieldName = fieldName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public Product getProduct() {
        return product;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationException that = (ValidationException) o;
        return Objects.equals(ruleName, that.ruleName) && Objects.equals(description, that.description) && Objects.equals(product, that.product) && Objects.equals(fieldName, that.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, description, product, fieldName);
    }
}
