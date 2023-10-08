package com.mahedi.ecommerce.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class RegistrationDto extends BaseDto{
  @NotBlank
  private String name;
  @NotBlank
  private String address;
  @NotBlank
  private String phone;
  @NotBlank
  private String email;
}
