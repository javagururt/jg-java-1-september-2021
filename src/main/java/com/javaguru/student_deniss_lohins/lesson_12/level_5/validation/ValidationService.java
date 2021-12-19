package com.javaguru.student_deniss_lohins.lesson_12.level_5.validation;

import com.javaguru.student_deniss_lohins.lesson_12.level_5.Product;
import com.javaguru.student_deniss_lohins.lesson_12.level_5.validation.validation_rules.ValidationForProduct;

import java.util.List;

public class ValidationService{
    private List<ValidationForProduct> validationRules;

    public ValidationService(List<ValidationForProduct> validationRules) {
        this.validationRules = validationRules;
    }

    public void validateProduct(Product product){
        validationRules.forEach(rule -> {
            try {
                rule.isValid(product);
            } catch (ValidationException e) {
                e.printStackTrace();
            }
        });
    }
}
