package com.javaguru.student_ruslan_pankratov.lesson_12.level_5;

class ProductTitleValidationRule implements FieldValidationRule {
    public static void main(String[] args) {
        ProductTitleValidationRule pro = new ProductTitleValidationRule();
        Product product = new Product("sdfsdf", 123123,"banan");
        try {
            pro.validate(product);
        } catch (ValidationException e) {
            e.printStackTrace();
        }

    }

    public void validate(Product product) throws ValidationException {
        // реализуйте все требования для валидации названия продукта:
//        К названию продукта выдвигаются следующие требования:
//        - RULE-1: не должно быть пустым
//        - RULE-2: не должно быть короче 3 символов
//                - RULE-3: не должно быть длиннее 100 символов
//                - RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы
//    }

     if(product.getTitle() == null){
         throw new ValidationException("Rule_1", "the name is emptiness", "title");
     }
     int number = product.getTitle().length();// так можно сделать подсчёт строки стринг имеет свой метод подсчёт строки

     if(number < 3){
         throw new ValidationException("Rule_2", "name is less than 3 characters", "title");
     }
     if(number > 100){
         throw new ValidationException("Rule_3", "name is more than 100 characters", "title");
     }

     if(!product.getTitle().matches("[A-Za-z0-9]*")){
         throw new ValidationException("Rule_4", "the text must contain only English letters and numbers", "title");
     }
    }
}
