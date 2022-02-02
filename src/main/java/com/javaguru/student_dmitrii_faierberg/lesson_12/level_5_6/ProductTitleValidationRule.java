package com.javaguru.student_dmitrii_faierberg.lesson_12.level_5_6;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductTitleValidationRule implements FieldValidationRule{
    public void validate(Product product) throws ValidationException {
        // реализуйте все требования для валидации названия продукта:
        /*
            К названию продукта выдвигаются следующие требования:
            - RULE-1: не должно быть пустым
            - RULE-2: не должно быть короче 3 символов
            - RULE-3: не должно быть длиннее 100 символов
            - RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы
         */
        checkNotEmpty(product);
        checkMinLength(product);
        checkMaxLength(product);
        checkValidSymbols(product);
    }

    public void checkNotEmpty(Product product) throws ValidationException {
        if (product.getTitle() == null || product.getTitle().equals("")){
            throw new ValidationException("RULE-1", "Title cannot be empty", product, "title");
        }
    }

    public void checkMinLength(Product product) throws ValidationException {
        if (product.getTitle().length() < 3){
            throw new ValidationException("RULE-2", "Title cannot be less than 3 symbols", product, "title");
        }
    }

    public void checkMaxLength(Product product) throws ValidationException {
        if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "Title should be less than 100 symbols", product, "title");
        }
    }

    public void checkValidSymbols(Product product) throws ValidationException {
        String title = product.getTitle();
        for (int i = 0; i < title.length(); i++){
            char ch = title.charAt(i);
            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                continue;
            } else {
                throw new ValidationException("RULE-4", "Title should include only english alphabet and " +
                        "numbers", product, "title");
            }
        }
    }
}
