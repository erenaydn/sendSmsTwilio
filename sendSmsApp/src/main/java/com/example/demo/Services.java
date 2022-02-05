package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Services {

    private final SmsSender smsSender;

    @Autowired
    public Services(@Qualifier("twilio") TwilioSmsSender twSmsSender) {
        this.smsSender = twSmsSender;

    }

    public void sendSms(SMS smsRequest) {
        smsSender.sendSms(smsRequest);
    }

}