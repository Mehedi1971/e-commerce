package com.mahedi.ecommerce.annotations;

import com.mahedi.ecommerce.enums.AvailableStatus;
import com.mahedi.ecommerce.model.Products;
import jakarta.persistence.PrePersist;
import java.lang.reflect.Method;

public class AvailabilityValidator {

 public static void handlePrePersist(Object entity) {
        Class<?> entityClass = entity.getClass();
        Method[] methods = entityClass.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(AvailabilityValidations.class)) {
                try {
                    method.setAccessible(true); // Allow access to private methods
                    method.invoke(entity);
                } catch (Exception e) {
                    e.printStackTrace();
                    // Handle any exceptions that occur during method invocation
                }
            }
        }
    }
}
