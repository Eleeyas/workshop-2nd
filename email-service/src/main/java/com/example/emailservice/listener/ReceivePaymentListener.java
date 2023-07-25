package com.example.emailservice.listener;

import com.example.emailservice.model.PayRequest;
import com.example.emailservice.service.SendEmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class ReceivePaymentListener {

    private static final Logger log = LoggerFactory.getLogger(ReceivePaymentListener.class);

    private final SendEmailService service;

    public ReceivePaymentListener(SendEmailService service) {
        this.service = service;
    }

    @Bean
    public Consumer<PayRequest> receivePayment() {
        return response -> {
            log.info("receivePayment");
            service.execute(response);
        };
    }
}
