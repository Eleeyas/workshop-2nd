package com.example.emailservice.listener;

import com.example.emailservice.model.PayRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class ReceivePaymentListener {

    private static final Logger log = LoggerFactory.getLogger(ReceivePaymentListener.class);

    @Bean
    public Consumer<PayRequest> receivePayment() {
        return response -> {
            log.info("response: {}", response);
        };
    }
}
