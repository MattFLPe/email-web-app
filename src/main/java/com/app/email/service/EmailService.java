package com.app.email.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailService {

    private JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public String sendEmail(String to, String subject, String message) {
        SimpleMailMessage mailmessage = new SimpleMailMessage();
        mailmessage.setTo(to);
        mailmessage.setSubject(subject);
        mailmessage.setText(message);
        javaMailSender.send(mailmessage);
        return "Email sent";
    }
}
