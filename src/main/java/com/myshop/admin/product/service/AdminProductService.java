package com.myshop.admin.product.service;
import com.myshop.admin.product.model.AdminProduct;
import com.myshop.admin.product.repository.AdminProductRepository;
import com.myshop.product.model.Product;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class AdminProductService {

    private final AdminProductRepository repository;

    public AdminProductService(AdminProductRepository repository) {
        this.repository = repository;

    }

    public List<AdminProduct> getProducts(AdminProduct adminProduct) {
        return repository.findAll();
    }

    public AdminProduct getProductById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public AdminProduct createProduct(AdminProduct product) {
        return repository.save(product);
    }

    public AdminProduct updateProduct(AdminProduct product) {
        return repository.save(product);
    }

    public void deleteProductById(Long id) {
        repository.deleteById(id);
    }

}
