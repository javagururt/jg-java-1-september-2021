package com.javaguru.teacher.lesson_12_exceptions.lessoncode.grocerystore;

class GroceryStoreApplication {

    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        ProductService productService = new ProductService(repository);
        UserInterface userInterface = new UserInterface(productService);

        userInterface.startUI();
    }
}
