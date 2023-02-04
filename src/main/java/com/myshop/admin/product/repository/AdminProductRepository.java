package com.myshop.admin.product.repository;

import com.myshop.admin.product.model.AdminProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminProductRepository  extends JpaRepository<AdminProduct , Long> {
}
