package com.mahedi.ecommerce.repository;

import com.mahedi.ecommerce.controller.ProductsController;
import com.mahedi.ecommerce.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories,Long> {
    List<Categories>findAllByActiveStatusAndCategory(int status, String category);
    Optional<Categories> findAllByActiveStatus(int status);
}
