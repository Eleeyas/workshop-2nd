package com.example.emailservice.service;

import com.example.emailservice.model.PayRequest;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {

    private static final Logger log = LoggerFactory.getLogger(SendEmailService.class);

    @SneakyThrows
    public void execute(PayRequest request) {
        log.info("Send Email with data : {}", request);
    }
}
