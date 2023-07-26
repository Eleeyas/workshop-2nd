package com.example.paymentservice.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class PayRequest {

    private String name;
    private String email;
    @JsonProperty(value = "payment_method")
    private String paymentMethod;
    private String phone;
    private String price;
    private String taxId;
    private BigDecimal totalPrice;
}
