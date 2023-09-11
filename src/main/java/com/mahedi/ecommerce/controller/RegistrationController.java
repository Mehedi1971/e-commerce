package com.mahedi.ecommerce.controller;

import com.mahedi.ecommerce.model.Registration;
import com.mahedi.ecommerce.service.RegistrationService;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registration")
@RequiredArgsConstructor
public class RegistrationController {
    private final RegistrationService registrationService;

    @PostMapping
    public String saveUser(@Valid @RequestBody Registration registration) throws MessagingException {
        return registrationService.saveUser(registration);
    }

    @GetMapping
    public List<Registration> getAllUser(){
        return registrationService.getAllUser();
    }

    @GetMapping("/verify")
    public String getVerify(@RequestParam String verificationNumber){
        return registrationService.getVerify(verificationNumber);
    }
}
