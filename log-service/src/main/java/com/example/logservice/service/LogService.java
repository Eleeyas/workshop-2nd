package com.example.logservice.service;

import com.example.logservice.model.PayResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    private static final Logger log = LoggerFactory.getLogger(LogService.class);

    public void execute(PayResponse response) {
        log.info("log data : {}", response);
    }
}
