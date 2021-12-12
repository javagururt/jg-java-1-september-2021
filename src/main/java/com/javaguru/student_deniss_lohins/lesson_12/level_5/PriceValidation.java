package com.javaguru.student_deniss_lohins.lesson_12.level_5;

import java.util.ArrayList;
import java.util.List;

/*
К цене продукта выдвигаются следующие требования:
- не должна быть пустой
- должна содержать только цифры
- не может быть 0
 */
class PriceValidation {


    boolean isValidPrice(double price) {

        if (price > 0) {
            return true;
        } else {
            new ValidationException("price validation failed");
        }
        return false;
    }

}
