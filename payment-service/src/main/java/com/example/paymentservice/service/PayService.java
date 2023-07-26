package com.example.paymentservice.service;

import com.example.paymentservice.model.request.PayRequest;
import com.example.paymentservice.model.response.PayResponse;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.Supplier;

@Service
public class PayService {

    private static final Logger log = LoggerFactory.getLogger(PayService.class);

    private final StreamBridge streamBridge;

    public PayService(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    @SneakyThrows
    public PayResponse execute(PayRequest request) {
        log.info("req: {}", request);
        var message = MessageBuilder
                .withPayload(request)
                .build();
        streamBridge.send("payment-topic", message);

        if (request.getTotalPrice().compareTo(BigDecimal.valueOf(10000)) > 0) {
            streamBridge.send("report-topic", message);
        }
        return PayResponse.builder()
                .code("200")
                .status("Success")
                .email(request.getEmail())
                .name(request.getName())
                .paymentMethod(request.getPaymentMethod())
                .phone(request.getPhone())
                .price(request.getPrice())
                .build();
    }
}
