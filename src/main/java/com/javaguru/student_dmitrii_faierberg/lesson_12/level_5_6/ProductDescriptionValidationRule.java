package com.javaguru.student_dmitrii_faierberg.lesson_12.level_5_6;

class ProductDescriptionValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException{
        checkMaxLength(product);
        checkValidSymbols(product);
    }

    private void checkMaxLength(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-7", "Description cannot be more than 2000 symbols", product,
                    "description");
        }
    }

    public void checkValidSymbols(Product product) throws ValidationException {
        String description = product.getDescription();
        for (char ch : description.toCharArray()){
            if (Character.isLetter(ch) || Character.isDigit(ch)){
                continue;
            } else {
                throw new ValidationException("RULE-8", "Description should include only english alphabet and " +
                        "numbers", product, "description");
            }
        }
    }

}
