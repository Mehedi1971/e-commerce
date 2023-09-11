package com.mahedi.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration extends BaseModel {
    private String name;
    private String address;
    @NotEmpty
    private String phone;
    private String email;
    @NotBlank(message = "This field is mandatory")
    @Size(min = 4, max = 8,message = "")
    private String password;
    private String verificationNumber;
}
