package com.mahedi.ecommerce.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration extends BaseModel {
    private String name;
    private String address;
    private String phone;
    private String email;
    private String password;
    private String verificationNumber;
}
