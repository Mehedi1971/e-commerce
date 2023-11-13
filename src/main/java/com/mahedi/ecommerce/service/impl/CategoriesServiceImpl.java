package com.mahedi.ecommerce.service.impl;

import com.mahedi.ecommerce.enums.ActiveStatus;
import com.mahedi.ecommerce.model.Categories;
import com.mahedi.ecommerce.model.ProductNameAndPrice;
import com.mahedi.ecommerce.model.Products;
import com.mahedi.ecommerce.repository.CategoriesRepository;
import com.mahedi.ecommerce.service.CategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

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

    @Override
    public List<Categories> getCategory(String category) {
        return categoriesRepository.findAllByActiveStatusAndCategory(ActiveStatus.ACTIVE.getValue(), category);
    }

    @Override
    public List<Categories> getPrice(String price) {
        return null;
    }

//    @Override
//    public List<Categories> getPrice(String price) {
//        List<Categories> prices = categoriesRepository.findAllByActiveStatus(ActiveStatus.ACTIVE.getValue());
//
//
//        return null;
//    }

    @Override
    public Optional<Categories> getPrices() {
        Optional<Categories> p = categoriesRepository.findAllByActiveStatus(ActiveStatus.ACTIVE.getValue());
        List<ProductNameAndPrice> list = new ArrayList<>();

        ProductNameAndPrice productNameAndPrice = new ProductNameAndPrice();

//        productNameAndPrice.setPName(p.stream()
////                .map(x -> x.getProducts())
//                .map(Categories::getProducts)
//                .map(Products::getProductName)
//                .collect(Collectors.toList()));
//        List<ProductNameAndPrice> productList = p.stream()
//                .flatMap(category -> category.getProducts().stream())
//                .map(products -> new ProductNameAndPrice(products.getProductName(), products.getPrice()))
//                .collect(Collectors.toList());

//        Categories categoriess=p.get();
//        Map<String,List<Products>> map = categoriess.getProducts().stream()
//                .collect(groupingBy(r->r.getProductName()));
//        System.out.println(map);

        List<String> lists=p.stream()
                .flatMap(category -> category.getProducts().stream())
                .map(product -> product.getProductName())
                .collect(Collectors.toList());

        List<Products> listss = p.stream()
                .flatMap(category -> category.getProducts().stream()).toList();

        productNameAndPrice.setPName(String.valueOf(listss+" "+list));
        System.out.println(listss);
        return p;
    }

}
