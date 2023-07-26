package com.example.reportservice.listener;

import com.example.reportservice.model.PayRequest;
import com.example.reportservice.service.ReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class ReceiveReportListener {

    private static final Logger log = LoggerFactory.getLogger(ReceiveReportListener.class);

    private final ReportService reportService;

    public ReceiveReportListener(ReportService reportService) {
        this.reportService = reportService;
    }

    @Bean
    public Consumer<PayRequest> receiveReport() {
        return req -> {
            log.info("receiveReport");
            reportService.execute(req);
        };
    }
}
