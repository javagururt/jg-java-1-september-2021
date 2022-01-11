package com.javaguru.student_dmitrii_faierberg.lesson_12.level_5_6;

class ProductPriceValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException{
        checkNotNull(product);
        checkPositive(product);
    }

    private void checkNotNull(Product product) throws ValidationException{
        if (product.getPrice() == null){
            throw new ValidationException("RULE-5", "Price cannot be empty", product, "price");
        }
    }

    private void checkPositive(Product product) throws ValidationException{
        if (product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "Price must be positive", product, "price");
        }
    }
}
