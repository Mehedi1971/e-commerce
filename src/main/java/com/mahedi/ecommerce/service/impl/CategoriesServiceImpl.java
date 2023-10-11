package com.mahedi.ecommerce.service.impl;

import com.mahedi.ecommerce.enums.ActiveStatus;
import com.mahedi.ecommerce.model.Categories;
import com.mahedi.ecommerce.model.Products;
import com.mahedi.ecommerce.repository.CategoriesRepository;
import com.mahedi.ecommerce.repository.ProductsRepository;
import com.mahedi.ecommerce.service.CategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriesServiceImpl implements CategoriesService {

    private final CategoriesRepository categoriesRepository;
private final ProductsRepository productsRepository;
    @Override
    public Categories saveCategories(Categories categories) {
        Products products=new Products();
        if(products.getProductName()!=null){
            products.setAvailability(1);
            productsRepository.save(products);
        }

        return categoriesRepository.save(categories);
    }

    @Override
    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }

    @Override
    public List<Categories> getCategory(String category) {
        return categoriesRepository.findAllByActiveStatusAndCategory(ActiveStatus.ACTIVE.getValue(),category);
    }
}
