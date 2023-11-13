package com.mahedi.ecommerce.service;

import com.mahedi.ecommerce.dto.CategoryListDto;
import com.mahedi.ecommerce.dto.ProductListDto;
import com.mahedi.ecommerce.model.Products;

import java.util.List;

public interface ProductsService {
    List<Products> getProducts(String productName);

    List<CategoryListDto> getCategoryList();

    List<ProductListDto> getProductList();
}
