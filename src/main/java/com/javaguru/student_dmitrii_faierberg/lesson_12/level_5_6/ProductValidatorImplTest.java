package com.javaguru.student_dmitrii_faierberg.lesson_12.level_5_6;

/*
К названию продукта выдвигаются следующие требования:
- RULE-1: не должно быть пустым
- RULE-2: не должно быть короче 3 символов
- RULE-3: не должно быть длиннее 100 символов
- RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы

К цене продукта выдвигаются следующие требования:
- RULE-5: не должна быть пустой
- RULE-6: должна быть больше 0

К описанию продукта выдвигаются следующие требования:
- RULE-7: не должно быть длиннее 2000 символов
- RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы
 */

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class ProductValidatorImplTest {
    ProductTitleValidationRule titleValidationRule = new ProductTitleValidationRule();
    ProductPriceValidationRule priceValidationRule = new ProductPriceValidationRule();
    ProductDescriptionValidationRule descriptionValidationRule = new ProductDescriptionValidationRule();

    private ProductValidator validator = new ProductValidatorImpl(titleValidationRule,
            priceValidationRule, descriptionValidationRule);

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2();
        test.rule3();
        test.rule4();
        test.rule5();
        test.rule6();
        test.rule7();
        test.rule8();
        test.invalidTitleAndPrice();
        test.invalidTitleAndDescription();
        test.invalidPriceAndDescription();
        test.invalidAll();
        // тесты на остальные правила допишите по аналогии
        // тестов будет много! напишите их все!
        // они пишутся легко, и если вы напишите их все то ваше решение будет полностью протестировано!
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title cannot be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title cannot be empty"), "rule1");
    }

    public void rule2(){
        Product product = new Product("ab", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title cannot be less than 3 symbols"), "rule2");
    }

    private String buildStringOfNLength(int n){
        StringBuilder title = new StringBuilder();
        for (int i = 0; i < n; i++){
            title.append("a");
        }
        return title.toString();
    }

    public void rule3(){
        String title = buildStringOfNLength(101);
        Product product = new Product(title, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title should be less than 100 symbols"), "rule3");
    }

    public void rule4(){
        String title = "something like this $#@* is not acceptable.";
        Product product = new Product(title, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title should include only english alphabet and " +
                "numbers"), "rule4");
    }

    public void rule5(){
        Product product = new Product("title", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResult(exceptions.get(0).getDescription().equals("Price cannot be empty"), "rule5");
    }

    public void rule6(){
        Product product = new Product("title", -1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price must be positive"), "rule6");
    }

    public void rule7(){
        String description = buildStringOfNLength(2007);
        Product product = new Product("title", 1, description);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResult(exceptions.get(0).getDescription().equals("Description cannot be more than 2000 symbols"),
                "rule7");
    }

    public void rule8(){
        String description = "something like this $#@* is not acceptable.";
        Product product = new Product("title", 1, description);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description should include only english alphabet and " +
                "numbers"), "rule8");
    }

    public void invalidTitleAndPrice(){
        Product product = new Product("", -2, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "invalidTitleAndPrice");

        checkResult(exceptions.contains(new ValidationException("RULE-1", "Title cannot be empty", product, "title")),
                "RULE-1");
        checkResult(exceptions.contains(new ValidationException("RULE-6", "Price must be positive", product, "price")),
                "RULE-6");
    }

    public void invalidTitleAndDescription(){
        Product product = new Product(null, 1, "money$");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "invalidTitleAndDescription");
        checkResult(exceptions.contains(new ValidationException("RULE-1", "Title cannot be empty", product, "title")),
                "RULE-1");
        checkResult(exceptions.contains(new ValidationException("RULE-8", "Description should include " +
                        "only english alphabet and numbers", product, "description")), "RULE-8");
    }

    public void invalidPriceAndDescription(){
        Product product = new Product("title", -200, "gfdh15&@%");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "invalidPriceAndDescription");
        checkResult(exceptions.contains(new ValidationException("RULE-6", "Price must be positive", product, "price")),
                "RULE-6");
        checkResult(exceptions.contains(new ValidationException("RULE-8", "Description should include " +
                "only english alphabet and numbers", product, "description")), "RULE-8");
    }

    public void invalidAll(){
        Product product = new Product("", -200, "gfdh15&@%");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "invalidAll");
        checkResult(exceptions.contains(new ValidationException("RULE-1", "Title cannot be empty", product, "title")),
                "RULE-1");
        checkResult(exceptions.contains(new ValidationException("RULE-6", "Price must be positive", product, "price")),
                "RULE-6");
        checkResult(exceptions.contains(new ValidationException("RULE-8", "Description should include " +
                "only english alphabet and numbers", product, "description")), "RULE-8");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
