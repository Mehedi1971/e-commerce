package com.mahedi.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Registration extends BaseModel {
    private String name;
    private String address;
    @NotEmpty
    private String phone;
    private String email;
    @NotBlank(message = "This field is mandatory")
    @Size(min = 4, max = 8,message = "")
    @EqualsAndHashCode.Exclude
    private String password;
    private String verificationNumber;
}
