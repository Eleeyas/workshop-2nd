package com.example.paymentservice.model.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonIgnore()
    private String name;
    @JsonIgnore()
    private String email;
    @JsonIgnore()
    private String paymentMethod;
    @JsonIgnore()
    private String phone;
    @JsonIgnore()
    private String price;
}
