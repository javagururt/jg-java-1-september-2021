package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.ui;

import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.businesslogic.ProductService;

import java.util.Scanner;

public class DeleteProductByIdProductAction implements ProductAction {

    public static final String ACTION_NAME = "Delete product by id";

    private final ProductService productService;

    public DeleteProductByIdProductAction(ProductService productService) {
        this.productService = productService;

    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter id:");
        Long id = scanner.nextLong();
        productService.deleteById(id);
    }

    @Override
    public String getActionName() {
        return ACTION_NAME;
    }
}
