package com.example.paymentservice.controller;

import com.example.paymentservice.model.request.PayRequest;
import com.example.paymentservice.model.response.PayResponse;
import com.example.paymentservice.service.PayService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("payment")
public class PaymentController {

    private final PayService payService;

    public PaymentController(PayService payService) {
        this.payService = payService;
    }

    @PostMapping("/pay")
    public PayResponse pay(@RequestBody PayRequest request) {
        return payService.execute(request);
    }
}
