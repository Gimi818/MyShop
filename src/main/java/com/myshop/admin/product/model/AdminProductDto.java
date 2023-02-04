package com.myshop.admin.product.model;

import lombok.Getter;

import java.math.BigDecimal;


public record AdminProductDto(String name, String category, BigDecimal price) {

}

