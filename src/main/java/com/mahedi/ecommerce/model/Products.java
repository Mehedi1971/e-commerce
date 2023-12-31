package com.mahedi.ecommerce.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products extends BaseModel{
    private String productName;
    private String description;
    private long price;
    private boolean availability;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Reviews>reviews;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Rates> rates;
}
