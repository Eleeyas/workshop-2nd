package com.example.emailservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PayRequest {

    private String name;
    private String email;
    @JsonProperty(value = "payment_method")
    private String paymentMethod;
    private String phone;
    private String price;
}
