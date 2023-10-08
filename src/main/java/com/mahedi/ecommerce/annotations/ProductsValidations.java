package com.mahedi.ecommerce.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({FIELD,PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ProductsValidator.class)
public @interface ProductsValidations {
  String message() default "Invalid ProductName input";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
