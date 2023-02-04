package com.myshop.product.service;

import com.myshop.product.model.Product;
import com.myshop.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {


    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product productCreate(Product product) {
        return productRepository.save(product);
    }


}
