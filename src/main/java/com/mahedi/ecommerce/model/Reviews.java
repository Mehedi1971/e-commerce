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
public class Reviews extends BaseModel{
    private String review;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Reacts>reacts;
}
