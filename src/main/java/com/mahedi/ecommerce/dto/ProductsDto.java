package com.mahedi.ecommerce.dto;

import lombok.Data;

@Data
public class ProductsDto extends BaseDto {

  private String productName;
  private String description;
  private long price;
  private boolean availability;

}
