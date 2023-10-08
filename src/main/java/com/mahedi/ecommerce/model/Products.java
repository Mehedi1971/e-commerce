package com.mahedi.ecommerce.model;

import com.mahedi.ecommerce.annotations.ProductsValidations;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products extends BaseModel{
    @ProductsValidations
    private String productName;
    private String description;
    private long price;
    private boolean availability;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Reviews> reviews;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Rates> rates;
}
