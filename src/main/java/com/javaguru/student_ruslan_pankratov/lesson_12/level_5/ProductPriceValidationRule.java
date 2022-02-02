package com.javaguru.student_ruslan_pankratov.lesson_12.level_5;

class ProductPriceValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        // реализуйте все требования для валидации цены продукта:
//        К цене продукта выдвигаются следующие требования:
//        - RULE-5: не должна быть пустой
//        - RULE-6: должна быть больше 0

        if (product.getPrice() == null) {
            throw new ValidationException("Rule_5", "price not set", "price");
        }
        if(product.getPrice() < 0){
            throw new ValidationException("Rule_6", "price less than 0","price");
        }
    }

}
