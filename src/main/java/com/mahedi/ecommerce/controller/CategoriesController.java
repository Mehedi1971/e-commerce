package com.mahedi.ecommerce.controller;

import com.mahedi.ecommerce.model.Categories;
import com.mahedi.ecommerce.service.CategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoriesController {
    private final CategoriesService categoriesService;

    @PostMapping
    public Categories saveCategories(@RequestBody Categories categories){
        return categoriesService.saveCategories(categories);
    }

    @GetMapping
    public List<Categories> getAllCategories(){
        return categoriesService.getAllCategories();
    }

}
