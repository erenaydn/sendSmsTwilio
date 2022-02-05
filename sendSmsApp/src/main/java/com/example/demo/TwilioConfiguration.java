package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;



// Your accountSid , authToken, trialNumber configuration
@Configuration
@ConfigurationProperties("twilio")
@Getter
@Setter
public class TwilioConfiguration {
    private String accountSid;
    private String authToken;
    private String trialNumber;

    public TwilioConfiguration() {
    }

}