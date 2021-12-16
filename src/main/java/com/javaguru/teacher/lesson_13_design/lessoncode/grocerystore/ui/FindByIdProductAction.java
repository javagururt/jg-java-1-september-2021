package com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.ui;

import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.domain.Product;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.businesslogic.ProductService;

import java.util.Scanner;

public class FindByIdProductAction implements ProductAction {

    private static final String ACTION_NAME = "Find product by id";
    private final ProductService productService;

    public FindByIdProductAction(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id:");
        Long id = Long.valueOf(scanner.nextLine());
        Product product = productService.findProduct(id);
        System.out.println(product);
    }

    @Override
    public String getActionName() {
        return ACTION_NAME;
    }
}
