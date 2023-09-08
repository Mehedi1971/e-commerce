package com.mahedi.ecommerce.service.impl;

import com.mahedi.ecommerce.model.Categories;
import com.mahedi.ecommerce.repository.CategoriesRepository;
import com.mahedi.ecommerce.service.CategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriesServiceImpl implements CategoriesService {

    private final CategoriesRepository categoriesRepository;

    @Override
    public Categories saveCategories(Categories categories) {
        return categoriesRepository.save(categories);
    }

    @Override
    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }
}
