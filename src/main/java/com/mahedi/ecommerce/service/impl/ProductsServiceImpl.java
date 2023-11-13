package com.mahedi.ecommerce.service.impl;

import com.mahedi.ecommerce.dto.CategoryListDto;
import com.mahedi.ecommerce.dto.ProductListDto;
import com.mahedi.ecommerce.enums.ActiveStatus;
import com.mahedi.ecommerce.model.Categories;
import com.mahedi.ecommerce.model.Products;
import com.mahedi.ecommerce.repository.CategoriesRepository;
import com.mahedi.ecommerce.repository.ProductsRepository;
import com.mahedi.ecommerce.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductsService {
    private final ProductsRepository productsRepository;
    private final CategoriesRepository categoriesRepository;

//    @Override
//    public List<Products> getProducts(String productName) {
//        return productsRepository.findAllByActiveStatusAndProductName(ActiveStatus.ACTIVE.getValue(), productName);
//    }
    @Override
    public List<Products> getProducts(String productName) {
        List<Products> products=productsRepository.findAllByActiveStatusAndProductName(ActiveStatus.ACTIVE.getValue(), productName);

        return productsRepository.findAllByActiveStatusAndProductName(ActiveStatus.ACTIVE.getValue(), productName);
    }

    @Override
    public List<CategoryListDto> getCategoryList() {
        List<Categories> categories=categoriesRepository.findAll();

        return categories.stream()
                .map(c->{
                    CategoryListDto categoryListDto=new CategoryListDto();
                    categoryListDto.setCategoryList(c.getCategory());

                    List<String> productName= c.getProducts()
                            .stream()
                            .map(Products::getProductName)
                            .collect(Collectors.toList());
                    categoryListDto.setProductList(productName);
                    return categoryListDto;
                }).distinct().collect(Collectors.toList());
    }

    @Override
    public List<ProductListDto> getProductList() {
        List<Categories> categories=categoriesRepository.findAll();

        return categories.stream()
                .flatMap(c->c.getProducts().stream()
                        .map(p->{
                            ProductListDto productListDto=new ProductListDto();
                            productListDto.setProductName(p.getProductName());
                            productListDto.setCategoryName(c.getCategory());
                            return productListDto;
                        })).distinct().collect(Collectors.toList());
    }
}
