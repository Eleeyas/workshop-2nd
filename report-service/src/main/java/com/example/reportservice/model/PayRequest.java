package com.example.reportservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

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
    private BigInteger totalPrice;
}
