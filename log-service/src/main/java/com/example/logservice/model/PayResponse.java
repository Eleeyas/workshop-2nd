package com.example.logservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayResponse {

    private String code;
    private String status;

    private String name;
    private String email;
    private String paymentMethod;
    private String phone;
    private String price;
}
