package com.myshop.admin.product.controller;

import com.myshop.admin.product.model.AdminProduct;
import com.myshop.admin.product.model.AdminProductDto;
import com.myshop.admin.product.service.AdminProductService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/admin")
public class AdminProductController {
    private final AdminProductService service;

    public AdminProductController(AdminProductService service) {
        this.service = service;
    }


    @GetMapping("/products")
    public List<AdminProduct> getProducts(AdminProduct product) {
        return service.getProducts(product);
    }

    @GetMapping("/products/{id}")
    public AdminProduct getProductById(@PathVariable Long id) {

        return service.getProductById(id);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable Long id) {
        service.deleteProductById(id);
    }

    @PostMapping("/add")
    public AdminProduct createProduct(@RequestBody AdminProductDto adminProductDto) {
        return service.createProduct(AdminProduct.builder()
                .name(adminProductDto.name())
                .category(adminProductDto.category())
                .price(adminProductDto.price())
                .build());
    }

    @PutMapping("/put/{id}")
    public AdminProduct updateProduct(@RequestBody AdminProductDto adminProductDto, @PathVariable Long id) {
        return service.updateProduct(AdminProduct.builder()
                .id(id)
                .name(adminProductDto.name())
                .category(adminProductDto.category())
                .price(adminProductDto.price())
                .build());
    }


}
