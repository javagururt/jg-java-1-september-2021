package com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.businesslogic;

import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.businesslogic.validation.ProductNotFoundException;
import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.businesslogic.validation.ValidationService;
import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.domain.Product;
import com.javaguru.teacher.lesson_14_stream_api.lessoncode.grocerystore.repository.ProductRepository;

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
//        Product product = productRepository.findById(id);
//        if (product == null) {
//            throw new ProductNotFoundException(id);
//        }
//        return product;
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public void update(Product product) {
        validationService.validate(product);
        productRepository.update(product);
    }
}
