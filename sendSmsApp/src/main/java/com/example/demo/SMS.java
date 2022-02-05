package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@ToString
public class SMS {
    @NotBlank
    private final String phoneNumber;
    @NotBlank
    private final String message;

    public SMS(@JsonProperty("phoneNumber") String phoneNumber,
               @JsonProperty("message") String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

}