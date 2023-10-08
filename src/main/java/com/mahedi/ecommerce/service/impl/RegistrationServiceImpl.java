package com.mahedi.ecommerce.service.impl;

import com.mahedi.ecommerce.model.Registration;
import com.mahedi.ecommerce.repository.RegistrationRepository;
import com.mahedi.ecommerce.service.RegistrationService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {
    private final RegistrationRepository registrationRepository;
    private final JavaMailSender javaMailSender;

    @Override
    public String saveUser(Registration registration) throws RuntimeException, MessagingException {
        MimeMessage mimeMessage= javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper=new MimeMessageHelper(mimeMessage,true);

        String verificationNumber = String.valueOf((int) (Math.random() * 1000000));
        if (verificationNumber.length() < 6) {
            verificationNumber = "0" + verificationNumber;
        }

        mimeMessageHelper.setFrom("md.mahedi.10001@gmail.com");
        mimeMessageHelper.setTo(registration.getEmail());
        mimeMessageHelper.setSubject("This is mail!");
        mimeMessageHelper.setText("Your Verification number is " + verificationNumber);

        registration.setVerificationNumber(verificationNumber);

        javaMailSender.send(mimeMessage);
        registration.setPassword(String.valueOf(registration.getPassword().hashCode()));
         registrationRepository.save(registration);
        return "Mail Send";
    }

    @Override
    public List<Registration> getAllUser() {
        return registrationRepository.findAll();
    }

    @Override
    public String getVerify(String verificationNumber) {
        Registration registration = registrationRepository.findByVerificationNumber(verificationNumber);
        registration.setActiveStatus(1);
        registrationRepository.save(registration);
        return "Your Email Id is Now Verified!!!";
    }
}
