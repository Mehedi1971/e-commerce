package com.mahedi.ecommerce.service.impl;

import com.mahedi.ecommerce.enums.ActiveStatus;
import com.mahedi.ecommerce.model.Products;
import com.mahedi.ecommerce.repository.ProductsRepository;
import com.mahedi.ecommerce.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductsService {
    private final ProductsRepository productsRepository;

    @Override
    public List<Products> getProducts(String productName) {
        return productsRepository.findAllByActiveStatusAndProductName(ActiveStatus.ACTIVE.getValue(), productName);
    }
}
