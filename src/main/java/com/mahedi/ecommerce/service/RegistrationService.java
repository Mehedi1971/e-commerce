package com.mahedi.ecommerce.service;

import com.mahedi.ecommerce.model.Registration;
import jakarta.mail.MessagingException;

import java.util.List;

public interface RegistrationService {
    String saveUser(Registration registration) throws MessagingException;

    List<Registration> getAllUser();

    String getVerify(String verificationNumber);
}
