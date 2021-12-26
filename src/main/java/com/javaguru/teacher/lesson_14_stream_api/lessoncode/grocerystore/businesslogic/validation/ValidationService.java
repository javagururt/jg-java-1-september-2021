package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.businesslogic.validation;

import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.businesslogic.validation.rules.ValidationRule;
import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.domain.Product;

import java.util.List;

public class ValidationService {

    private List<ValidationRule> validationRules;

    public ValidationService(List<ValidationRule> validationRules) {
        this.validationRules = validationRules;
    }

    public void validate(Product product) {
//        for (int i = 0; i < validationRules.size(); i++) {
//            validationRules.get(i).validate(product);
//        }
        validationRules.forEach(rule -> rule.validate(product));
    }
}
