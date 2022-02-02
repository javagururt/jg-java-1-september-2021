package com.javaguru.student_deniss_lohins.lesson_12.level_5.validation.validation_rules;

import com.javaguru.student_deniss_lohins.lesson_12.level_5.Product;
import com.javaguru.student_deniss_lohins.lesson_12.level_5.validation.ValidationException;
import com.javaguru.teacher.codereview.CodeReview;

/*
К цене продукта выдвигаются следующие требования:
- не должна быть пустой
- должна содержать только цифры
- не может быть 0
 */
@CodeReview(approved = true)
class PriceValidation implements ValidationForProduct {


    @Override
    public boolean isValid(Product product) throws ValidationException{

        if (product.getPrice() > 0 ) {
            return true;
        } else {
            new ValidationException("price validation failed");
        }
        return false;
    }

}
