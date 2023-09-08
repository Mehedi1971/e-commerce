package com.mahedi.ecommerce.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products extends BaseModel{
    private String productName;
    private String description;
    private long price;
    private boolean availability;
}
