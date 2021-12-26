package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.ui;

import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.businesslogic.ProductService;
import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.domain.Product;

import java.math.BigDecimal;
import java.util.Scanner;

public class AddProductAction implements ProductAction {

    private static final String ACTION_NAME = "Add product";

    private final ProductService productService;

    public AddProductAction(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name:");
        String name = scanner.nextLine();
        System.out.println("Enter product price:");
        BigDecimal price = new BigDecimal(scanner.nextLine());

        Product product = new Product(null, name, price); //0x123

        Product saveResult = productService.save(product);
        System.out.println("Product save result = " + saveResult);
    }

    @Override
    public String getActionName() {
        return ACTION_NAME;
    }

}
