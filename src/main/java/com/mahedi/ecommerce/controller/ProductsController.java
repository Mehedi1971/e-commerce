package com.mahedi.ecommerce.controller;

import com.mahedi.ecommerce.model.Products;
import com.mahedi.ecommerce.repository.ProductsRepository;
import com.mahedi.ecommerce.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductsController {
    private final ProductsService productsService;

    @GetMapping("/{productName}")
    public List<Products> getProducts(@PathVariable String productName){
        return productsService.getProducts(productName);
    }
}
