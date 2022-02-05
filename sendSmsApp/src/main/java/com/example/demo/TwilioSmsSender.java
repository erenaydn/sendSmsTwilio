package com.example.demo;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("twilio")
public class TwilioSmsSender implements SmsSender {
    private final static Logger LOGGER = LoggerFactory.getLogger(TwilioSmsSender.class);
    private TwilioConfiguration twConfiguration;

    @Autowired
    public TwilioSmsSender(TwilioConfiguration twConfiguration) {
        this.twConfiguration = twConfiguration;

    }

    @Override
    public void sendSms(SMS smsRequest) {

        PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
        PhoneNumber from = new PhoneNumber(twConfiguration.getTrialNumber());
        String message = smsRequest.getMessage();

        MessageCreator creator = Message.creator(to, from, message);
        creator.create();
        LOGGER.info("Send sms {}", smsRequest);

    }
}