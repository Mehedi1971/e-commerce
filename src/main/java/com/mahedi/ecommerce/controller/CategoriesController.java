package com.mahedi.ecommerce.controller;

import com.mahedi.ecommerce.model.Categories;
import com.mahedi.ecommerce.service.CategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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


    @GetMapping("/{category}")
    public List<Categories> getCategory(@PathVariable String category){
        return categoriesService.getCategory(category);
    }
    @GetMapping("/{price}")
    public List<Categories> getprice(@PathVariable String price){
        return categoriesService.getPrice(price);
    }

    @GetMapping("/price")
    public Optional<Categories> getprices(){
        return categoriesService.getPrices();
    }
}
