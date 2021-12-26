package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.ui;

import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.businesslogic.ProductService;
import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.domain.Product;

import java.math.BigDecimal;
import java.util.Scanner;

public class UpdateProductAction implements ProductAction{

    private final ProductService productService;

    public UpdateProductAction(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter id: ");
        long id = Long.parseLong(scanner.nextLine());
        Product product = productService.findProduct(id); //Ox123
        System.out.println("Product info: ");
        System.out.println(product);

        System.out.println("Please enter new name:");
        String newName = scanner.nextLine();
        System.out.println("Please enter new price: ");
        BigDecimal newPrice = new BigDecimal(scanner.nextLine());

        Product updatedProduct = new Product(product.getId(), newName, newPrice);

        productService.update(updatedProduct);
    }

    @Override
    public String getActionName() {
        return "Update product";
    }
}
