package com.mahedi.ecommerce.repository;

import com.mahedi.ecommerce.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Long> {
Registration findByVerificationNumber(String verificationNumber);
}
