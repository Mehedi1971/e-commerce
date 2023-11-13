package com.mahedi.ecommerce.dto;

import lombok.Data;

@Data
public class ProductListDto extends BaseDto{
    private String productName;
    private String categoryName;
}
