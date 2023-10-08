package com.mahedi.ecommerce.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class ProductsValidator implements ConstraintValidator<ProductsValidations,String> {

  @Override
  public boolean isValid(String productName, ConstraintValidatorContext constraintValidatorContext) {
//    List list = Arrays.asList(new String[]{"RED","GREEN","BLUE"});
//    return list.contains(productName);

    if(productName.isBlank())
    {
      return false;
    }else {
      return true;
    }
  }
}
