package com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.businesslogic;

import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.businesslogic.validation.ProductNotFoundException;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.businesslogic.validation.ProductValidationException;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.businesslogic.validation.ValidationService;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.domain.Product;
import com.javaguru.teacher.lesson_13_design.lessoncode.grocerystore.repository.ProductRepository;

public class ProductService {

    private final ProductRepository productRepository;
    private final ValidationService validationService;

    public ProductService(ProductRepository productRepository, ValidationService validationService) {
        this.productRepository = productRepository;
        this.validationService = validationService;
    }

    public Product save(Product product) {
        validationService.validate(product);
        return productRepository.save(product);
    }

    public Product findProduct(Long id) {
        Product product = productRepository.findById(id);
        if (product == null) {
            throw new ProductNotFoundException(id);
        }
        return product;
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
