package com.mahedi.ecommerce.model;

import com.mahedi.ecommerce.annotations.AvailabilityValidations;
import com.mahedi.ecommerce.annotations.ProductsValidations;
import com.mahedi.ecommerce.enums.AvailableStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PrePersist;
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
    private Integer availability;
    private Integer quantity=0;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Reviews> reviews;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Rates> rates;

//    @PrePersist
//    protected void setPreAvailability(){
//        if(this.quantity==0){
//            this.availability= AvailableStatus.OUT_OF_STOCK.getValue();
//        }else {
//            this.availability=AvailableStatus.AVAILABLE.getValue();
//        }
//    }
}
