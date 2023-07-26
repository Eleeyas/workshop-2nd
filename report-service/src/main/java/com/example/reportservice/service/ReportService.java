package com.example.reportservice.service;

import com.example.reportservice.model.PayRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    private static final Logger log = LoggerFactory.getLogger(ReportService.class);

    public void execute(PayRequest request) {

        log.info("report service: {}", request);
    }
}
