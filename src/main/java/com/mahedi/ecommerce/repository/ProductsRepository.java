package com.mahedi.ecommerce.repository;

import com.mahedi.ecommerce.controller.ProductsController;
import com.mahedi.ecommerce.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, String> {
    List<Products>findAllByActiveStatusAndProductName(int status, String productName);
}
