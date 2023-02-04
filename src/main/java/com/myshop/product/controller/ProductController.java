package com.myshop.product.controller;
import com.myshop.product.model.Product;
import com.myshop.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts(Product product) {
        return productService.getProducts();
    }

    @PostMapping("/add")
    public Product createProduct(Product product) {
        return productService.productCreate(product);
    }


}
