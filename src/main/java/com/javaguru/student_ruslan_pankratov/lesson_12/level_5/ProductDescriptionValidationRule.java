package com.javaguru.student_ruslan_pankratov.lesson_12.level_5;

class ProductDescriptionValidationRule implements FieldValidationRule  {

    @Override
    public void validate(Product product) throws ValidationException {
//К описанию продукта выдвигаются следующие требования:
//- не должно быть длиннее 2000 символов
//- должно содержать только английские буквы и цифры, другие символы не допустимы

        if(product.getDescription().length() > 2000){
            throw new ValidationException("Rule_7", "more than two thousand characters", "description");
        }
        if(!product.getDescription().matches("[A-Za-z0-9]*")){
            throw new ValidationException("Rule_8", "the text must contain only English letters and numbers","description");
        }
    }
}
