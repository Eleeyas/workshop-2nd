package com.example.paymentservice.aspect;

import com.example.paymentservice.model.response.PayResponse;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    private static final Logger log = LoggerFactory.getLogger(LogAspect.class);

    private final StreamBridge streamBridge;

    public LogAspect(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    @AfterReturning(value = "execution(* com.example.paymentservice.service..*(..))", returning = "payResponse")
    public void afterReturning(JoinPoint joinPoint, PayResponse payResponse) {
        log.info("afterReturning");

//        var message = MessageBuilder
//                .withPayload(payResponse)
//                .build();
//        streamBridge.send("logActivityPublisher-out-0", message);
    }
}
