package com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore;

import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.businesslogic.ProductService;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.businesslogic.validation.ValidationService;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.businesslogic.validation.rules.DuplicateProductValidationRule;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.businesslogic.validation.rules.ProductNameValidationRule;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.businesslogic.validation.rules.ValidationRule;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.config.ProductRepositoryFactory;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.repository.ProductRepository;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.ui.AddProductAction;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.ui.DeleteProductByIdProductAction;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.ui.ExitProductMenuAction;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.ui.FindByIdProductAction;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.ui.ProductAction;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.ui.UserInterface;

import java.util.List;

class GroceryStoreApplication {

    public static void main(String[] args) {
        ProductRepositoryFactory repositoryFactory = new ProductRepositoryFactory();
        String repositoryProperty = getRepositoryProperty(args);
        ProductRepository repository = repositoryFactory.getByName(repositoryProperty);

        ValidationRule nameValidationRule = new ProductNameValidationRule();
        ValidationRule duplicateProductValidationRule = new DuplicateProductValidationRule(repository);
        List<ValidationRule> rules = List.of(nameValidationRule, duplicateProductValidationRule);

        ValidationService validationService = new ValidationService(rules);

        ProductService productService = new ProductService(repository, validationService);

        ProductAction addProductAction = new AddProductAction(productService);
        ProductAction findByIdProductAction = new FindByIdProductAction(productService);
        ProductAction deleteById = new DeleteProductByIdProductAction(productService);
        ProductAction exitProductAction = new ExitProductMenuAction();
        List<ProductAction> productActions = List.of(addProductAction,
                findByIdProductAction,
                deleteById,
                exitProductAction);

        UserInterface userInterface = new UserInterface(productActions);

        userInterface.startUI();
    }

    private static String getRepositoryProperty(String[] args) {
        if (args == null || args.length == 0) {
            return null;
        }
        return args[0];
    }
}
