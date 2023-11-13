package com.mahedi.ecommerce.dto;

import lombok.Data;

import java.util.List;

@Data
public class CategoryListDto extends BaseDto{
    private String categoryList;
    private List<String> productList;
}
