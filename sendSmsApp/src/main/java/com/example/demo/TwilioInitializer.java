package com.example.demo;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioInitializer {
    private final static Logger LOGGER = LoggerFactory.getLogger(TwilioInitializer.class);
    private TwilioConfiguration twConfiguration;

    @Autowired
    public TwilioInitializer(TwilioConfiguration twConfiguration) {
        this.twConfiguration = twConfiguration;

        // set your twilio configiguration for twilio init
        Twilio.init(
                twConfiguration.getAccountSid(),
                twConfiguration.getAuthToken()
        );

        // Check Twilio Initializer
        LOGGER.info("Tw init started ------ > " + twConfiguration.getAccountSid());
    }

}
