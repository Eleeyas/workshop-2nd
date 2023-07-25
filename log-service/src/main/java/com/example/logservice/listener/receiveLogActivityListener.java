package com.example.logservice.listener;


import com.example.logservice.model.PayResponse;
import com.example.logservice.service.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class receiveLogActivityListener {

    private static final Logger log = LoggerFactory.getLogger(receiveLogActivityListener.class);

    private final LogService logService;

    public receiveLogActivityListener(LogService logService) {
        this.logService = logService;
    }

    @Bean
    public Consumer<PayResponse> receiveLogActivity() {
        return res -> {
            log.info("receiveLogActivity");
            logService.execute(res);
        };
    }
}
