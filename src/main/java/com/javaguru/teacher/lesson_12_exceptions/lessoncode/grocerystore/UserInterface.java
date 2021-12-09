package com.javaguru.teacher.lesson_12_exceptions.lessoncode.grocerystore;

import java.math.BigDecimal;
import java.util.Scanner;

class UserInterface {

    private ProductService productService;

    public UserInterface(ProductService productService) {
        this.productService = productService;
    }

    void startUI() {
        boolean menuEnabled = true;
        while (menuEnabled) {
            System.out.println("Menu:");
            System.out.println("1. Add product");
            System.out.println("2. Find product by id");
            System.out.println("3. Delete product");
            System.out.println("4. Exit");
            try {
                Scanner scanner = new Scanner(System.in);
                int menuAction = Integer.parseInt(scanner.nextLine());
                if (menuAction == 1) {
                    System.out.println("Enter product name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter product price:");
                    BigDecimal price = new BigDecimal(scanner.nextLine());
                    Product product = new Product();
                    product.setName(name);
                    product.setPrice(price);
                    Product saveResult = productService.save(product);
                    System.out.println("Product save result = " + saveResult);
                } else if (menuAction == 2) {
                    System.out.println("Enter product id:");
                    Long id = Long.valueOf(scanner.nextLine());
                    Product product = productService.findProduct(id);
                    System.out.println(product);
                } else if (menuAction == 3) {
                    throw new UnsupportedOperationException("Delete product not implemented");
                } else if (menuAction == 4) {
                    menuEnabled = false;
                } else {
                    throw new IllegalArgumentException("Wrong menu action");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
