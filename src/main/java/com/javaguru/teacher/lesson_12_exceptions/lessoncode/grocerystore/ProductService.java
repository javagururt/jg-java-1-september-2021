package com.javaguru.teacher.lesson_12_exceptions.lessoncode.grocerystore;

class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    Product save(Product product) {
        //validation
        if (product.getName().length() < 3) {
            throw new ProductValidationException("Product name must be greater than 3");
        }
        //save to db (delegate)
        return productRepository.save(product);
    }

    Product findProduct(Long id) {
        Product product = productRepository.findById(id);
        if (product == null) {
            throw new ProductNotFoundException(id);
        }
        return product;
    }
}
