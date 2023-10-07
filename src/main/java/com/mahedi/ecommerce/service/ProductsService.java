package com.mahedi.ecommerce.service;

import com.mahedi.ecommerce.model.Products;

import java.util.List;

public interface ProductsService {
    List<Products> getProducts(String productName);
}
