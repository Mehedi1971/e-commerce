package com.mahedi.ecommerce.service;

import com.mahedi.ecommerce.model.Categories;

import java.util.List;
import java.util.Optional;

public interface CategoriesService {
    Categories saveCategories(Categories categories);

    List<Categories> getAllCategories();

    List<Categories> getCategory(String category);

    List<Categories> getPrice(String price);

    Optional<Categories> getPrices();
}
