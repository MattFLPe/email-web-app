package com.app.email;

import com.app.email.service.EmailService;
import org.springframework.boot.CommandLineRunner;

public class EmailRunner implements CommandLineRunner {

    private final EmailService emailService;

    public EmailRunner(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void run(String... args) throws Exception {
        emailService.sendEmail("Jack","The Game", "You just lost the game.");
    }
}
